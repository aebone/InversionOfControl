import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BaseballTrainerTest {

    Trainer baseballTrainer;

    @Before
    public void setUp() throws Exception {
        baseballTrainer = new BaseballTrainer();
    }

    @Test
    public void shouldReturnAnExercise() {
        assertTrue(("30 minutes of batting practice").equals(baseballTrainer.getDailyWorkout()));
    }
}