import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TrainerTest {

    Trainer baseballTrainer;
    Trainer trackTrainer;

    @Before
    public void setUp() throws Exception {
        baseballTrainer = new BaseballTrainer();
        trackTrainer = new TrackTrainer();
    }

    @Test
    public void shouldReturnAnExercise() {
        assertTrue(("30 minutes of batting practice").equals(baseballTrainer.getDailyWorkout()));
        assertTrue(("Run a hard 5k").equals(trackTrainer.getDailyWorkout()));
    }
}