
package employeesalarymanager;

import java.util.Scanner;

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n=sc.nextInt();
        int type[]= new int[n];  
        double basicSalary[]=new double[n];
        int a[]= new int[n];  
        int t[]= new int[n]; 
        int cont=1,k=0;
        Parent p[]= new Parent[n];
        while (cont==1)
        {
            System.out.println("Enter the type of employee\n1 for sales \n2 for production");
            type[k]=sc.nextInt();
            if(type[k]==1)
            {
                System.out.println("Enter the basic salary of the employee:");
                basicSalary[k]=sc.nextDouble();
                System.out.println("Enter sales actual:");
                a[k]=sc.nextInt();
                System.out.println("Enter sales target:");
                t[k]=sc.nextInt();
                p[k]=new Sales(basicSalary[k],a[k],t[k]);
                System.out.println("Do you want to continue?\nEnter 1 to YES\n2 to EXIT");
                cont=sc.nextInt();
                k++;
            }
            else if(type[k]==2)
            {
                System.out.println("Enter the basic salary of the employee:");
                basicSalary[k]=sc.nextDouble();
                System.out.println("Enter production actual:");
                a[k]=sc.nextInt();
                System.out.println("Enter production target:");
                t[k]=sc.nextInt();
                p[k]=new Production(basicSalary[k],a[k],t[k]) ;
                System.out.println("Do you want to continue?\nEnter:\n1 to YES\n2 to EXIT");
                cont=sc.nextInt();
                k++;
            }
        }
        System.out.println("Enter the password to access the details of employees");
        int password=sc.nextInt();
        if(password==123)
        {
            String stop="";
            System.out.println("Click: s and enter key to stop the threading");
            ThreadApplication ta=new ThreadApplication();
            ta.start();
            stop=sc.next();
            ta.setStop(stop);
            for(int i=0;i<k;i++)
            {
                if(type[i]==1)
                {
                    p[i].fixedSalary();
                    p[i].salesBonus();
                    System.out.println("The salary for employee "+(i+1)+" for sales is:"+p[i].totalSalary());
                }
                else
                {
                    p[i].fixedSalary();
                    p[i].productionBonus();
                    System.out.println("The salary for employee "+(i+1)+" for production is:"+p[i].totalSalary());
                }
            }
        }
        else
        {
            System.out.println("Invalid Password!\nSorry, you are ineligible to access the details\n");
        }
    }
    
}
