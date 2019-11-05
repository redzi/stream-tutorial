package com.stream.tutorial;

import com.stream.tutorial.model.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static com.stream.tutorial.TestUtil.TREE_1;
import static com.stream.tutorial.TestUtil.TREE_2;
import static com.stream.tutorial.TestUtil.branchesWithLeaves;
import static com.stream.tutorial.TestUtil.createTree;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CollectorsTest
{
    private Collectors collectors = new Collectors();

    private List<Tree> trees = asList(
            createTree(TREE_1, branchesWithLeaves),
            createTree(TREE_2, emptyList())
    );

    @Test
    public void allTreesShouldHaveBranches()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, branchesWithLeaves),
                createTree(TREE_2, branchesWithLeaves)
        );

        // when
        boolean result = collectors.doAllTreesHaveBranches(trees);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void someTreesShoulNotdHaveBranches()
    {
        // given

        // when
        boolean result = collectors.doAllTreesHaveBranches(trees);

        // then
        assertThat(result).isFalse();
    }

    @Test
    public void shouldHaveAllBranches()
    {
        // given

        // when
        Optional<Tree> resultOp = collectors.findTreeWithNoBranches(trees);

        // then
        assertThat(resultOp).isPresent();
        assertThat(resultOp.get().getName()).isEqualTo(TREE_1);
    }

    @Test
    public void shouldNotHaveAllBranches()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, emptyList()),
                createTree(TREE_2, emptyList())
        );

        // when
        Optional<Tree> resultOp = collectors.findTreeWithNoBranches(trees);

        // then
        assertThat(resultOp).isNotPresent();
    }

    @Test
    public void shouldCountAllBranches()
    {
        // given

        // when
        long result = collectors.countAllBranches(trees);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldCreateMap()
    {
        // given

        // when
        java.util.Map<Tree, String> result = collectors.createMapTreeToName(trees);

        // then
        assertThat(result).hasSize(2);
        assertThat(result).containsValues(TREE_1, TREE_2);
    }
}
