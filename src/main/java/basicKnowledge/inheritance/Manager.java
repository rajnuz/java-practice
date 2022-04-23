package basicKnowledge.inheritance;

/**
 * @author rajnuz
 * @date 2021/11/25 23:11
 */
public class Manager extends Employee{
    //只属于Manager不属于Employee的域
    private double bonus;

    /**
     * @param  name  the employee's name
     * @param  salary the employee's salary
     * @param  year the hire year
     * @param  month the hire month
     * @param  day the hire day
     */
    public Manager(String name, double salary, int year, int month,int day){
        //子类构造器的第一条语句一定是super(...)
        super(name,salary,year,month,day);
        //初始bonus为0
        bonus = 0;
    }

    @Override
    public double getSalary(){
        //父类的salary是私有域，只可以通过父类的public方法 getSalary()修改
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }

}
