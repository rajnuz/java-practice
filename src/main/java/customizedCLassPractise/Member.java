package customizedCLassPractise;

import java.util.Random;

/**
 * * 展示集中不同的构造器方法
 * @author rajnuz
 * @date 2021/11/24 22:25
 */
public class Member {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    //static initialization block
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    // id 通过一个方法块初始化
    {
        id = nextId;
        nextId ++;
    }

    //three overloaded constructors
    public Member(String n, double s){
        name = n;
        salary = s;
    }

    public Member(double s){
        //calls the Member (String,double)constructor
        this("Employee #" + nextId,s);
    }

    //default constructor
    public Member(){
        //name initialized to ""
        //salary not explicitly set
        //id initialized in initialization block
    }

    public String getName(){
        return  name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return  id;
    }

    public static void main(String[] args) {
        Member[] members = new Member[3];
        members[0] = new Member("Harry",40000);
        members[1] = new Member(60000);
        members[2] = new Member();

        for (Member m: members
             ) {
            System.out.println("name = " + m.getName() + ",id  = " + m.getId() + ", salary = " + m.getSalary());
        }
    }

}
