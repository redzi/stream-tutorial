package com.stream.tutorial;

import com.stream.tutorial.model.Tree;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Collectors
{
    public boolean doAllTreesHaveBranches(List<Tree> trees)
    {
        return false; //TODO implement
    }

    public boolean doesAnyTreeHaveNoBranches(List<Tree> trees)
    {
        return false; //TODO implement
    }

    public Optional<Tree> findTreeWithNoBranches(List<Tree> trees)
    {
        return Optional.empty(); //TODO implement
    }

    public long countAllBranches(List<Tree> trees)
    {
        return Long.MIN_VALUE; //TODO implement
    }

    public java.util.Map<Tree, String> createMapTreeToName(List<Tree> trees)
    {
        return Collections.emptyMap(); //TODO implement
    }
}
