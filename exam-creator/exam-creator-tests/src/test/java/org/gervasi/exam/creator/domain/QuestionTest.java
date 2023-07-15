package org.gervasi.exam.creator.domain;

import java.util.UUID;

import org.gervasi.exam.creator.domain.entities.Question;
import org.gervasi.exam.creator.domain.exceptions.MissingQuestionTypeException;
import org.gervasi.exam.creator.domain.vo.SimpleString;
import org.junit.Test;

public class QuestionTest
{
    @Test(expected = MissingQuestionTypeException.class)
    public void testMissingQuestionTypeThrowsException()
    {
        new Question(UUID.randomUUID(), new SimpleString("My question"), null);
    }
}
