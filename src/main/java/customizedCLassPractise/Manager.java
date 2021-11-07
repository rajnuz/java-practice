package customizedCLassPractise;

/**
 * @date 11/7/2021 5:30 PM
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);//super 是子类构造器必须的第一条语句
        bonus = 0;
    }

    public void setBouns(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        double baseSalary = super.getSalary();//super表名使用的是父类Employee的公有方法getSalary，因为Manager不能直接访问Employee的私有域salary
        return baseSalary + bonus;
    }
}
