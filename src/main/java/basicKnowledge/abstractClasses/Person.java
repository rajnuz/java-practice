package basicKnowledge.abstractClasses;

/**
 * @date 12/5/2021 10:00 PM
 */
public abstract class Person {

    public abstract  String getDescription();//抽象方法不需要实现，有一个抽象方法，name这个类也必须抽象
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){//抽象类允许不抽象的方法
        return name;
    }
}
