package ooss.step2;

import ooss.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_given_student() {
        Student tom = new Student(1, "Tom", 18);
        String introduce = tom.introduce();

        assertEquals("My name is Tom. I am 18 years old. I am a student.", introduce);
    }

    @Test
    public void should_return_message_with_name_and_age_when_introduce_given_another_student() {
        Student jim = new Student(2, "Jim", 19);
        String introduce = jim.introduce();

        assertEquals("My name is Jim. I am 19 years old. I am a student.", introduce);
    }

    @Test
    public void should_return_true_when_equals_given_two_students_with_same_id() {
        Student student1 = new Student(1, "Tom", 18);
        Student student2 = new Student(1, "Tommy", 19);

        assertEquals(student1, student2);
    }

    @Test
    public void should_return_false_when_equals_given_two_students_with_different_id() {
        Student student1 = new Student(1, "Tom", 18);
        Student student2 = new Student(2, "Tom", 18);

        assertNotEquals(student1, student2);
    }
}
