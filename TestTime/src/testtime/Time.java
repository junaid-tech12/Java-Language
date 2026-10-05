/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime;


import java.util.Scanner;


public class Time {
    private int hrs;
    private int mins;
    private int sec;
    public void setHours(int h){
        if(h>0&&h<=23){
            
        
        this.hrs=h;
        }else{
            System.out.println("Invalid Hours");
            this.hrs=0;
        }
            
    }
    public void setMinute(int m){
        if(m>=0&&m<=59){
             this.mins=m;
        }else{
            System.out.println("Invalid Minute");
            this.mins=0;
        }
        
       
    }
    public void setSecond(int s){
        if(s>=0&&s<=59){
            this.sec=s;
        }else{
            System.out.println("Invalid Second");
            this.sec=0;
        }
        
    }
    //Getter
    public int getHours(){
        return this.hrs;
    }
     public int getMinute(){
        return this.mins;
    }
     public int getSecond(){
        return this.sec;
    }
     public void printtime(){
         
         System.out.printf("%02d : %02d :%02d :\n",this.hrs,this.mins,this.sec);
     }
     public Time(int h,int m,int s)
     {
       // this.hrs=h;
       // this.mins=m;
       // this.sec=s;
         this.setHours(h);
         this.setMinute(m);
         this.setSecond(s);
         
     }
     public Time(int h ,int m)
     {
         this.hrs=h;
        this.mins=m;
         
     }
     public Time(int h)
     {
        this.hrs=h;
         
         
     }
     public Time() 
     {
         
         
     }
    
     
     public void Userinput()
     {
          Scanner input=new Scanner(System.in);
         System.out.println("Enter Hours:...");
         this.setHours(input.nextInt());
         System.out.println("Enter Minute:...");
         this.setMinute(input.nextInt());
         System.out.println("Enter Second:...");
         this.setSecond(input.nextInt());
         
         
         
         
     }
     
         
     
     
    
    
    
}
