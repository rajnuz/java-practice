package equals;

/**
 * @author rajnuz
 * @date 2021/12/7 23:09
 */
public class Manager extends Employee{

    private double bonus;

    public Manager (String name , double salay, int year, int month, int day){
        super(name,salay,year,month,day);
        bonus = 0;
    }

    @Override
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)){ //超类都不满足肯定false
            return false;
        }

        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
