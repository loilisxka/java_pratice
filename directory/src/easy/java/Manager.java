
public class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        Manager other = (Manager) obj;
        return bonus == other.bonus;
    }

    public int hashCode(){
        return java.util.Objects.hash(super.hashCode(),bonus);
    }

    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }
}