package org.gervasi.exam.creator.domain.exceptions;

public class SimpleStringException extends RuntimeException
{
    public SimpleStringException()
    {
        super("The string should not be null, empty or blank.");
    }
}
