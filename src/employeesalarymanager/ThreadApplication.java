/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesalarymanager;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEEPAK
 */
public class ThreadApplication extends Thread{
    String stop="";
    int a=1;
    public void setStop(String s)
    {
        stop=s;
    }
    @Override
    public void run()
    {
        while(!stop.equals("s"))
        {
            System.out.println(a);
            a++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
