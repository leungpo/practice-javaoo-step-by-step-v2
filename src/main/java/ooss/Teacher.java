package ooss;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Teacher extends Person {
    protected List<Klass> klass = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public String introduce() {
        String introduceString = super.introduce();
        introduceString += " I am a teacher.";
        String classString = "";
        if (!this.klass.isEmpty()){
            String klassString = klass.stream()
                    .map(klassObject -> klassObject.getNumber())
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));;
            classString = MessageFormat.format(" I teach Class {0}.",klassString);
        }
        introduceString += classString;

        return introduceString;
    }
    public void assignTo(Klass klass) {
        this.klass.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.klass.isEmpty()? false: this.klass.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return this.klass.contains(student.getKlass());
    }
}
