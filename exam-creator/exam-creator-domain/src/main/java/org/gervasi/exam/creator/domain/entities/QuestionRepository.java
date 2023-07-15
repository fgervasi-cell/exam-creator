package org.gervasi.exam.creator.domain.entities;

import java.util.List;
import java.util.UUID;

public interface QuestionRepository
{
    public Question findQuestionById(UUID questionId);
    public List<Question> findAllSubQuestionsFor(UUID questionID);
    public void createQuestion(Question q);
}
