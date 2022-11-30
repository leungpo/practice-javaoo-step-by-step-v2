package ooss;

import java.util.Optional;

public class Klass {

    private final int number;
    private Student leader;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isLeader(Student student) {
        return Optional.ofNullable(this.leader).isPresent()?this.leader.equals(student): false;
    }

    public void assignLeader(Student student) {
        if(Optional.ofNullable(student.getKlass()).isPresent()){
            this.leader = student;
        }
        else{
            System.out.println("It is not one of us.");
        }
    }
}
