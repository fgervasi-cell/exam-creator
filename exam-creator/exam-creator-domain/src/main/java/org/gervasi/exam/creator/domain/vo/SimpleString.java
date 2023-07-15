package org.gervasi.exam.creator.domain.vo;

import org.gervasi.exam.creator.domain.exceptions.SimpleStringException;

public final class SimpleString
{
    private String s;

    public SimpleString(String s)
    {
        if (s == null || s.isEmpty() || s.isBlank())
        {
            throw new SimpleStringException();
        }
        this.s = s;
    }

    public String getString()
    {
        return s;
    }

    @Override
    public int hashCode()
    {
        return s.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof SimpleString)
        {
            SimpleString other = (SimpleString) o;
            return other.getString().equals(s);
        }
        return false;
    }
}
