package basicKnowledge.abstractClasses;

/**
 * @date 12/5/2021 10:08 PM
 */
public class Student extends Person{

    private  String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription(){
        return "a student majoring in" + major;
    }

}
