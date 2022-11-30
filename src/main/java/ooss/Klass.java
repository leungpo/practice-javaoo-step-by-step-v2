package ooss;

import java.text.MessageFormat;
import java.util.Optional;

public class Klass {

    private final int number;
    private Student leader;
    private Person person;

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
        return this.number;
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

        if(Optional.ofNullable(this.leader).isPresent()){
            if(person instanceof Student){
                Student student1 = (Student) person;
                int classNo = student1.getKlass().getNumber();
                System.out.println(MessageFormat.format("I am {0}, student of Class {1}." +
                        " I know {2} become Leader.",student1.name,classNo,student1.getKlass().leader.name));
            }
            else if(person instanceof Teacher){
                Teacher teacher = (Teacher) person;
                int classNo = teacher.klass.stream()
                        .findFirst()
                        .get()
                        .getNumber();
                System.out.println(MessageFormat.format("I am {0}, teacher of Class {1}." +
                        " I know {2} become Leader.",teacher.name,classNo,teacher.klass.stream().findFirst()
                        .get().leader.name
                ));
            }
        }
    }

    public void attach(Person person) {

        this.person = person;

    }
}
