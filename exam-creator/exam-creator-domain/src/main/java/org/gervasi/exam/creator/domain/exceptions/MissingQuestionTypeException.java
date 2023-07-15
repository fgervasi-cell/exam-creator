package org.gervasi.exam.creator.domain.exceptions;

public class MissingQuestionTypeException extends RuntimeException
{
    public MissingQuestionTypeException()
    {
        super("Each question must have a type.");
    }
}
