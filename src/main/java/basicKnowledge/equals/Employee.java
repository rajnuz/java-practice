package basicKnowledge.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author rajnuz
 * @date 2021/12/7 22:52
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

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
        double raise = salary * byPercent /100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject){// 重写equals
        // a quick test to see if the objects are identical
        if (this == otherObject){
            return true;
        }

        //must return false if the explicit parameter is null
        if( otherObject == null){
            return false;
        }

        //if the classes don't match, they can't be equal
        if(getClass() != otherObject.getClass()){
            return  false;
        }

        //now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;// 强制类型转换，只能发生在继承层次内，超类转为子类前应该用instanceOf方法检查

        return Objects.equals(name,((Employee) otherObject).name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
