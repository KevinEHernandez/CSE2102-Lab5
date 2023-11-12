import com.example.demo.Quiz.model.Question;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    public void testQuestionCreation() {
        String questionText = "Is this a test question?";
        boolean isCorrect = true;

        Question question = new Question(questionText, isCorrect);

        assertEquals(questionText, question.question);
        assertEquals(isCorrect, question.isCorrect);
    }
}
