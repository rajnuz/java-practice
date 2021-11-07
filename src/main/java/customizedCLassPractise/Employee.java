package customizedCLassPractise;

import java.time.LocalDate;

/**
 * @date 11/7/2021 5:04 PM
 */
public class Employee {
    //instance fields
    private String name; //private 关键字可以确保只有本类的方法可以访问这些实例域，一般不要把实例域标记为public，避免其他类改写从而破坏封装性
    private  double salary;
    private LocalDate hireDay;

    //constructor
    //构造器总是通过new方法来实现的
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    // meythod
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent/100;
        this.salary +=raise;
        //this 均可省略
    }
}
