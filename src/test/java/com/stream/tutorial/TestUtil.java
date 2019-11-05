package com.stream.tutorial;

import com.stream.tutorial.model.Branch;
import com.stream.tutorial.model.Leaf;
import com.stream.tutorial.model.Needle;
import com.stream.tutorial.model.Tree;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class TestUtil
{
    static final String TREE_1 = "tree1";
    static final String TREE_2 = "tree2";
    static final String TREE_3 = "tree3";
    static final String LEAF_1 = "leaf1";
    static final String LEAF_2 = "leaf2";

    static Leaf leaf1 = createLeaf(LEAF_1);
    static Leaf leaf2 = createLeaf(LEAF_2);
    static Needle needle1 = createNeedle("needle1");
    static Needle needle2 = createNeedle("needle2");
    static Branch branchWithLeaves = new Branch(asList(leaf1, leaf2));
    static Branch branchWithNeedles = new Branch(asList(needle1, needle2));
    static List<Branch> branchesWithLeaves = asList(branchWithLeaves, branchWithLeaves);
    static List<Branch> branchesWithNeedles = asList(branchWithNeedles, branchWithNeedles);
    static List<Branch> leaflessBranches = asList(new Branch(emptyList()), new Branch(null));


    private TestUtil()
    {
    }

    public static Leaf createLeaf(String data)
    {
        return new Leaf(data);
    }

    public static Needle createNeedle(String data)
    {
        return new Needle(data);
    }

    public static Branch createBranch(List<Leaf> leaves)
    {
        return new Branch(leaves);
    }

    public static Tree createTree(String name, List<Branch> branches)
    {
        return new Tree(name, branches);
    }
}
