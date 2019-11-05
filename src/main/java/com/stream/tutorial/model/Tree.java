package com.stream.tutorial.model;

import java.util.List;
import java.util.Objects;

public class Tree
{
    private String name;
    private List<Branch> branches;

    public Tree(String name, List<Branch> branches)
    {
        this.name = name;
        this.branches = branches;
    }

    public String getName()
    {
        return name;
    }

    public List<Branch> getBranches()
    {
        return branches;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(name, tree.name) && Objects.equals(branches, tree.branches);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, branches);
    }
}
