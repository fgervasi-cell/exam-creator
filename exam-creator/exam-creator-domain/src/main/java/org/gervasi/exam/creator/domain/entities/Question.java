package org.gervasi.exam.creator.domain.entities;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.gervasi.exam.creator.domain.QuestionType;
import org.gervasi.exam.creator.domain.exceptions.MissingQuestionTypeException;
import org.gervasi.exam.creator.domain.vo.SimpleString;

public class Question
{
    private final UUID questionId;
    private final UUID parentQuestionId;
    private SimpleString questionString;
    private QuestionType type; // this can change pretty often... maybe change to SimpleString and use QuestionType in an outer layer
    private Set<SimpleString> tags;

    public Question(final UUID parentQuestionId, SimpleString questionString, QuestionType type)
    {
        if (type == null)
        {
            throw new MissingQuestionTypeException();
        }
        questionId = UUID.randomUUID();
        this.parentQuestionId = parentQuestionId;
        this.questionString = questionString;
        this.type = type;
        tags = new HashSet<>();
    }

    public UUID getQuestionId()
    {
        return questionId;
    }

    public Optional<UUID> getParentQuestionId()
    {
        return Optional.of(parentQuestionId);
    }

    public boolean isSubQuestion()
    {
        return parentQuestionId != null;
    }

    public String getQuestionString()
    {
        return questionString.getString();
    }

    public void setQuestionString(SimpleString questionString)
    {
        this.questionString = questionString;
    }

    public QuestionType getType()
    {
        return type;
    }

    public void setQuestionType(QuestionType type)
    {
        this.type = type;
    }

    public Set<SimpleString> getTags()
    {
        return tags;
    }

    public void addTag(SimpleString tag)
    {
        tags.add(tag);
    }

    public void removeTag(SimpleString tag)
    {
        tags.remove(tag);
    }
}