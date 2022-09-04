import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {           
        assertEquals(0, management.exerciseList().size());
    }
        
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("hi");
        assertEquals(1, management.exerciseList().size());
    }
        
    @Test
    public void addedExerciseIsInList() {
        management.add("hi");
        assertTrue(management.exerciseList().contains("hi"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New");
        management.markAsCompleted("New");
        assertTrue(management.isCompleted("New"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("hi");
        management.markAsCompleted("hi");
        assertFalse(management.isCompleted("h"));
    }
}
