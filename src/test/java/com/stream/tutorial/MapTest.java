package com.stream.tutorial;

import com.stream.tutorial.model.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.stream.tutorial.TestUtil.TREE_1;
import static com.stream.tutorial.TestUtil.TREE_2;
import static com.stream.tutorial.TestUtil.branchWithLeaves;
import static com.stream.tutorial.TestUtil.createTree;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MapTest
{
    private Map map = new Map();

    @Test
    public void shouldMapLeavesToString()
    {
        // given
        List<Tree> trees = asList(createTree(TREE_1, emptyList()), createTree(TREE_2, emptyList()));

        // when
        List<String> result = map.mapTreeToName(trees);

        // then
        assertThat(result).hasSize(2);
        assertThat(result).containsExactly(TREE_1, TREE_2);
    }

    @Test
    public void shouldMapTreeToTotalNumberOfBranches()
    {
        // given
        List<Tree> trees = asList(
                createTree(TREE_1, emptyList()),
                createTree(TREE_2, asList(branchWithLeaves, branchWithLeaves, branchWithLeaves)),
                createTree(TREE_2, asList(branchWithLeaves, branchWithLeaves, branchWithLeaves, branchWithLeaves, branchWithLeaves)));

        // when
        List<Integer> result = map.mapTreeToTotalNumberOfBranches(trees);

        // then
        assertThat(result).hasSize(3);
        assertThat(result).containsExactly(0, 3, 5);
    }
}
