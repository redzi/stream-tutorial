package com.stream.tutorial;

import com.stream.tutorial.model.Branch;
import com.stream.tutorial.model.Leaf;
import com.stream.tutorial.model.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.stream.tutorial.TestUtil.TREE_1;
import static com.stream.tutorial.TestUtil.TREE_2;
import static com.stream.tutorial.TestUtil.branchWithLeaves;
import static com.stream.tutorial.TestUtil.branchWithNeedles;
import static com.stream.tutorial.TestUtil.branchesWithLeaves;
import static com.stream.tutorial.TestUtil.branchesWithNeedles;
import static com.stream.tutorial.TestUtil.createTree;
import static com.stream.tutorial.TestUtil.leaf1;
import static com.stream.tutorial.TestUtil.leaf2;
import static com.stream.tutorial.TestUtil.needle1;
import static com.stream.tutorial.TestUtil.needle2;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FlatMapTest
{
    private FlatMap flatMap = new FlatMap();

    private List<Tree> trees = asList(
            createTree(TREE_1, branchesWithLeaves),
            createTree(TREE_2, branchesWithNeedles)
    );

    @Test
    public void shouldGetAllBranches()
    {
        // given

        // when
        List<Branch> result = flatMap.getAllBranches(trees);

        // then
        assertOnAllBranches(result);
    }

    @Test
    public void shouldGetAllBranches2()
    {
        // given

        // when
        List<Branch> result = flatMap.getAllBranches2(trees);

        // then
        assertOnAllBranches(result);
    }

    private void assertOnAllBranches(List<Branch> result)
    {
        assertThat(result).hasSize(4);
        assertThat(result).containsExactly(branchWithLeaves, branchWithLeaves, branchWithNeedles, branchWithNeedles);
    }

    @Test
    public void shouldGetAllLeaves()
    {
        // given

        // when
        List<Leaf> result = flatMap.getAllLeaves(trees);

        // then
        assertOnAllLeaves(result);
    }

    @Test
    public void shouldGetAllLeaves2()
    {
        // given

        // when
        List<Leaf> result = flatMap.getAllLeaves2(trees);

        // then
        assertOnAllLeaves(result);
    }

    private void assertOnAllLeaves(List<Leaf> result)
    {
        assertThat(result).hasSize(8);
        assertThat(result).contains(leaf1, leaf2, needle1, needle2);
    }
}
