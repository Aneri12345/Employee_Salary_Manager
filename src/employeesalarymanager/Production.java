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
public class Production extends Parent{
    
    double bonus,totalSalary;
    public Production(double bs, int a, int t) {
        super(bs, a, t);
    }
    public double productionBonus()
       {
            
      if(actual<target)
       { 
           bonus=((target-actual)*15);
       }
       else
       {
       bonus=0;
       }
      return bonus;
      
    }
     
     
    public double totalSalary()
    {
       
      totalSalary=fixedSalary+bonus;
      return totalSalary;
    }

    @Override
    public double salesBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
