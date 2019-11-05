package com.stream.tutorial;

import com.stream.tutorial.model.Tree;

import java.util.List;
import java.util.stream.Collectors;

class Map
{
    public List<String> mapTreeToName(List<Tree> trees)
    {
        return trees
                .stream()
                .map(tree -> "TEST") //TODO implement
                .collect(Collectors.toList());
    }

    public List<Integer> mapTreeToTotalNumberOfBranches(List<Tree> trees)
    {
        return trees
                .stream()
                .map(tree -> Integer.MIN_VALUE) //TODO implement
                .collect(Collectors.toList());
    }
}
