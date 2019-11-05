package com.stream.tutorial;

import com.stream.tutorial.model.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Set;

import static com.stream.tutorial.TestUtil.TREE_1;
import static com.stream.tutorial.TestUtil.TREE_2;
import static com.stream.tutorial.TestUtil.TREE_3;
import static com.stream.tutorial.TestUtil.branchesWithLeaves;
import static com.stream.tutorial.TestUtil.createTree;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SimplestCollectorsTest
{
    private SimplestCollectors simplestCollectors = new SimplestCollectors();

    private List<Tree> trees = asList(
            createTree(TREE_1, branchesWithLeaves),
            createTree(TREE_2, branchesWithLeaves),
            createTree(TREE_3, branchesWithLeaves)
    );

    @Test
    public void shouldFilterOutTreesWithNoBranches()
    {
        // given

        // when
        List<Tree> result = simplestCollectors.collectToList(trees);

        // then
        assertThat(result).hasSize(3);
        assertThat(result).isInstanceOf(List.class);
    }

    @Test
    public void shouldFilterOutTreesWithNoLeaves()
    {
        // given

        // when
        Set<Tree> result = simplestCollectors.collectToSet(trees);

        // then
        assertThat(result).hasSize(3);
        assertThat(result).isInstanceOf(Set.class);
    }
}
