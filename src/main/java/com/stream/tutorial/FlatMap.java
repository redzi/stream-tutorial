package com.stream.tutorial;

import com.stream.tutorial.model.Branch;
import com.stream.tutorial.model.Leaf;
import com.stream.tutorial.model.Tree;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FlatMap
{
    //example 1
    public List<Branch> getAllBranches(List<Tree> trees)
    {
        return trees.stream()
                .flatMap(tree -> tree.getBranches().stream())
                .collect(Collectors.toList());
    }

    // example 2 (the same output)
    public List<Branch> getAllBranches2(List<Tree> trees)
    {
        return trees.stream()
                .map(Tree::getBranches)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Leaf> getAllLeaves(List<Tree> trees)
    {
        return trees.stream()
                    .flatMap(p -> Stream.<Branch> empty()) //TODO implement
                    .flatMap(p -> Stream.<Leaf> empty())  //TODO implement
                    .collect(Collectors.toList());
    }

    public List<Leaf> getAllLeaves2(List<Tree> trees)
    {
        return trees.stream()
                    .map(tree -> null) //TODO implement
                    .flatMap(p -> Stream.<Branch> empty()) //TODO implement
                    .map(branch -> null) //TODO implement
                    .flatMap(p -> Stream.<Leaf> empty())  //TODO implement
                    .collect(Collectors.toList());
    }
}
