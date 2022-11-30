package ooss;

import java.text.MessageFormat;
import java.util.Optional;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduceString = super.introduce() + " I am a student.";
        if(Optional.ofNullable(this.klass).isPresent()) {
            if(this.klass.isLeader(this)){
                introduceString += MessageFormat.format(" I am the leader of class {0}.", klass.getNumber());
            }
            else {
                introduceString += MessageFormat.format(" I am in class {0}.", klass.getNumber());
            }
        }
        return introduceString;
    }

    public boolean isIn(Klass klass) {
        return Optional.ofNullable(this.klass).isPresent()?this.klass.equals(klass): false;
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
}
