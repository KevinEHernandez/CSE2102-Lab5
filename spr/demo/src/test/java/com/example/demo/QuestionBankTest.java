import com.example.demo.Quiz.model.Question;
import com.example.demo.Quiz.model.QuestionBank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionBankTest {

    @Test
    public void testGetQuestions() {
        QuestionBank questionBank = new QuestionBank();
        assertNotNull(questionBank.getQuestions());
        assertEquals(3, questionBank.getQuestions().size());
    }
}
