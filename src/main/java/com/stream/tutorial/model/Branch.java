package com.stream.tutorial.model;

import java.util.List;
import java.util.Objects;

public class Branch
{
    private List<Leaf> leaves;

    public Branch(List<Leaf> leaves)
    {
        this.leaves = leaves;
    }

    public List<Leaf> getLeaves()
    {
        return leaves;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(leaves, branch.leaves);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(leaves);
    }
}
