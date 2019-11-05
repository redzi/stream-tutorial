package com.stream.tutorial;

import com.stream.tutorial.model.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.stream.tutorial.TestUtil.TREE_1;
import static com.stream.tutorial.TestUtil.TREE_2;
import static com.stream.tutorial.TestUtil.TREE_3;
import static com.stream.tutorial.TestUtil.branchesWithLeaves;
import static com.stream.tutorial.TestUtil.branchesWithNeedles;
import static com.stream.tutorial.TestUtil.createTree;
import static com.stream.tutorial.TestUtil.leaflessBranches;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FilterTest
{
    private Filter filter = new Filter();

    @Test
    public void shouldFilterOutTreesWithNoNames()
    {
        // given
        List<Tree> trees = asList(
                createTree(null, emptyList()),
                createTree(TREE_2, emptyList()),
                createTree(null, emptyList())
        );

        // when
        List<Tree> result = filter.filterOutTreesWithNoNames(trees);

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getName()).isEqualTo(TREE_2);
    }

    @Test
    public void shouldFilterOutTreesWithNoBranches()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, emptyList()),
                createTree(TREE_2, emptyList()),
                createTree(TREE_3, branchesWithLeaves)
                );

        // when
        List<Tree> result = filter.filterOutTreesWithNoBranches(trees);

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getName()).isEqualTo(TREE_3);
    }

    @Test
    public void shouldFilterOutTreesThatHaveBranchesWithNoLeaves()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, branchesWithLeaves),
                createTree(TREE_2, leaflessBranches)
        );

        // when
        List<Tree> result = filter.filterOutTreesThatHaveBranchesWithNoLeaves(trees);

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getName()).isEqualTo(TREE_1);
    }

    @Test
    public void shouldFilterOutTreesWithNeedles()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, branchesWithNeedles),
                createTree(TREE_2, branchesWithLeaves)
                );

        // when
        List<Tree> result = filter.filterOutTreesWithNeedles(trees);

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getName()).isEqualTo(TREE_2);
    }

}
