package qa.amishra.jackson.JsonPojoClasses;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Ashutosh on 29-05-2017.
 */
public class School {

    private String name;
    private int age;
    private String classroom;
    private BigDecimal marks;
    private List<String> subjects;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setMarks(BigDecimal marks) {
        this.marks = marks;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassroom() {
        return classroom;
    }

    public BigDecimal getMarks() {
        return marks;
    }

    public List<String> getSubjects() {
        return subjects;
    }


}
