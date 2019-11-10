package com.stream.tutorial;

import com.stream.tutorial.model.Tree;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// implement all of the methods so that that junits in FilterTest pass
class Filter
{
    public List<Tree> filterOutTreesWithNoNames(List<Tree> trees)
    {
        return trees
                .stream()
                .filter(tree -> false) //TODO implement
                .collect(Collectors.toList());

    }

    public List<Tree> filterOutTreesWithNoBranches(List<Tree> trees)
    {
        return trees
                .stream()
                .filter(tree -> false) //TODO implement
             .collect(Collectors.toList());

    }

    // to get it done implement FilterOutTreesWithNoLeavesPredicate
    public List<Tree> filterOutTreesThatHaveBranchesWithNoLeaves(List<Tree> trees)
    {
        return trees
                .stream()
                .filter(new TreesThatHaveNoLeaflessBranchesPredicate())
                .collect(Collectors.toList());
    }

    public List<Tree> filterOutTreesWithNeedles(List<Tree> trees)
    {
        return trees
                .stream()
                .filter(new TreesWithLeavesPredicate())
                .collect(Collectors.toList());
    }

    private class TreesThatHaveNoLeaflessBranchesPredicate implements Predicate<Tree>
    {
        @Override
        public boolean test(Tree tree)
        {
            //TODO implement this after checking out other tutorial classes and take a look at handy apache CollectionUtils methods (e.g. isNotEmpty())
            return false;
        }
    }

    private class TreesWithLeavesPredicate implements Predicate<Tree>
    {
        @Override
        public boolean test(Tree tree)
        {
            //TODO implement this after checking out other tutorial classes
            return false;
        }
    }
}
