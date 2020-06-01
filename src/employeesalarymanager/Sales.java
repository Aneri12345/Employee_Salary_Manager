/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesalarymanager;

import java.util.Scanner;

/**
 *
 * @author DEEPAK
 */
public class Sales extends Parent{
    
    double bonus,totalSalary;
    public Sales(double bs, int a, int t) {
        super(bs, a, t);
    }
    public double salesBonus()
    {
         
       if(actual>target)
       { 
           bonus=((actual-target)*100);
       }
       else
       {
       bonus=0;
       }
       return bonus;
    }
    public double totalSalary()
    {
       totalSalary=bonus +fixedSalary;
       System.out.println(totalSalary);
       return totalSalary;
    }

    @Override
    public double productionBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
