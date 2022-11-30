package ooss.step3;

import ooss.Klass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KlassTest {

    @Test
    public void should_return_true_when_equals_given_two_classes_with_same_id() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(1);

        assertEquals(klass1, klass2);
    }

    @Test
    public void should_return_false_when_equals_given_two_classes_with_different_id() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);

        assertNotEquals(klass1, klass2);
    }

}
