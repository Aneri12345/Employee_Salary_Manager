
package employeesalarymanager;
public abstract class Parent {
    double basicSalary,actual,target,fixedSalary;
    Parent(double bs,int a,int t)
    {
        basicSalary=bs;
        actual=a;
        target=t;
    }
    public double fixedSalary()
    {
       fixedSalary= basicSalary +(basicSalary*0.4)+ (basicSalary*0.1) + (basicSalary*0.1);
       return fixedSalary;
    }
    public abstract double totalSalary();
    public abstract double salesBonus();
    public abstract double productionBonus();
}
