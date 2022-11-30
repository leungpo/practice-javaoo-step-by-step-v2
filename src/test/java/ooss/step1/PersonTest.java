package ooss.step1;

import ooss.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void should_return_message_with_name_and_age_when_introduce_given_person() {
        Person tom = new Person(1, "Tom", 18);
        String introduce = tom.introduce();

        assertEquals("My name is Tom. I am 18 years old.", introduce);
    }
//
//    @Test
//    public void should_return_message_with_name_and_age_when_introduce_given_another_person() {
//        Person jim = new Person(2, "Jim", 19);
//        String introduce = jim.introduce();
//
//        assertEquals("My name is Jim. I am 19 years old.", introduce);
//    }
//
//    @Test
//    public void should_return_true_when_equals_given_two_people_with_same_id() {
//        Person person1 = new Person(1, "Tom", 18);
//        Person person2 = new Person(1, "Tommy", 18);
//
//        assertEquals(person1, person2);
//    }
//
//    @Test
//    public void should_return_false_when_equals_given_two_people_with_different_id() {
//        Person person1 = new Person(1, "Tom", 18);
//        Person person2 = new Person(2, "Tom", 18);
//
//        assertNotEquals(person1, person2);
//    }

}
