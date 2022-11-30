package ooss.step2;

import ooss.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TeacherTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_given_teacher() {
        Teacher jerry = new Teacher(1, "Jerry", 21);
        String introduce = jerry.introduce();

        assertEquals("My name is Jerry. I am 21 years old. I am a teacher.", introduce);
    }

    @Test
    public void should_return_message_with_name_and_age_when_introduce_given_another_teacher() {
        Teacher robert = new Teacher(1, "Robert", 20);
        String introduce = robert.introduce();

        assertEquals("My name is Robert. I am 20 years old. I am a teacher.", introduce);
    }

    @Test
    public void should_return_true_when_equals_given_two_teachers_with_same_id() {
        Teacher teacher1 = new Teacher(1, "Jerry", 21);
        Teacher teacher2 = new Teacher(1, "Jerry", 22);

        assertEquals(teacher1, teacher2);
    }

    @Test
    public void should_return_false_when_equals_given_two_teachers_with_different_id() {
        Teacher teacher1 = new Teacher(1, "Jerry", 21);
        Teacher teacher2 = new Teacher(2, "Jerry", 21);

        assertNotEquals(teacher1, teacher2);
    }
}
