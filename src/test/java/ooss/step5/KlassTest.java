package ooss.step5;

import ooss.Klass;
import ooss.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KlassTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_return_false_when_isLeader_given_student_is_not_in_the_class() {
        Student tom = new Student(1, "Tom", 21);
        Klass klass = new Klass(1);

        boolean isLeader = klass.isLeader(tom);

        assertFalse(isLeader);
    }

    @Test
    public void should_return_false_when_isLeader_given_student_is_in_the_class_but_not_the_leader() {
        Student tom = new Student(1, "Tom", 21);
        Klass klass = new Klass(1);
        tom.join(klass);

        boolean isLeader = klass.isLeader(tom);

        assertFalse(isLeader);
    }

    @Test
    public void should_return_true_when_isLeader_given_student_is_the_leader() {
        Student tom = new Student(1, "Tom", 21);
        Klass klass = new Klass(1);
        tom.join(klass);
        klass.assignLeader(tom);

        boolean isLeader = klass.isLeader(tom);

        assertTrue(isLeader);
    }

    @Test
    public void should_print_prompt_message_when_assign_leader_given_student_is_not_in_class() throws Exception {
        Student tom = new Student(1, "Tom", 21);
        Klass klass = new Klass(1);

        klass.assignLeader(tom);

        assertThat(systemOut(), containsString("It is not one of us."));
    }

    private String systemOut() {
        return outContent.toString();
    }
}
