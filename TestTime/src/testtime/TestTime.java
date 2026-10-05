/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtime;


public class TestTime {

   
    public static void main(String[] args) {
        Time t = new Time();
        t.printtime();
        Time t1=new Time(12);
        t1.printtime();
        
      t.setHours(22);
        t.setMinute(55);
        t.setSecond(34);
        t.printtime();
        System.out.printf("Hours:%d\n Minute:%d\n Second:%d\n",t.getHours(),t.getMinute(),t.getSecond());
        Time t2=new Time();
        t2.setHours(02);
        t2.setMinute(35);
        t2.setSecond(24);
        t2.printtime();
        
       
        Time t3=new Time(82, 13 ,14);
        t3.printtime();
        Time t4=new Time(12 ,13);
        t4.printtime();
        t4.Userinput();
        t4.printtime();
    }
    
    
    
    
}
