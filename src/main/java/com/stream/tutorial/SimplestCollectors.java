package com.stream.tutorial;

import com.stream.tutorial.model.Tree;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class SimplestCollectors
{
    public List<Tree> collectToList(List<Tree> trees)
    {
        return trees.stream()
             .collect(Collectors.toList());

//        return null;
    }

    public Set<Tree> collectToSet(List<Tree> trees)
    {
        return trees.stream()
             .collect(Collectors.toSet());

//        return null;
    }
}
