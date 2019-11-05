package com.stream.tutorial.model;

import java.util.Objects;

public class Leaf
{
    private String someVeryImportantData;

    public Leaf(String someVeryImportantData)
    {
        this.someVeryImportantData = someVeryImportantData;
    }

    public String getSomeVeryImportantData()
    {
        return someVeryImportantData;
    }

    public void setSomeVeryImportantData(String someVeryImportantData)
    {
        this.someVeryImportantData = someVeryImportantData;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(someVeryImportantData, leaf.someVeryImportantData);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(someVeryImportantData);
    }
}
