package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearnig.service.EmpCredentialsImpl;
import com.greatlearning.model.Employee;

public class DriverApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Employee First Name");
        String f=sc.next();
        System.out.println("Please enter Employee Last Name");
        String l=sc.next();

        Employee emp1=new Employee(f,l);
        Employee emp2=new Employee();
        emp2.setfname("Rohit");
        emp2.setlname("Sharma");
        
        EmpCredentialsImpl cred=new EmpCredentialsImpl();
        
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. leagl");
        
        System.out.println("Please choose your department");
        int choice=sc.nextInt();
        String genEmail="";
        String genPassword="";
        
        switch(choice)
        {
        case 1 :
        	  genEmail=cred.generateEmailId(emp2.getfname().toLowerCase(), emp2.getlname().toLowerCase(), "tech");
        	  //genEmail=cred.generateEmailId(emp1.getfname(), emp1.getlname(), "tech");
        	  break;
        case 2 :
        	  genEmail=cred.generateEmailId(emp2.getfname().toLowerCase(), emp2.getlname().toLowerCase(), "admin");
        	  //genEmail=cred.generateEmailId(emp1.getfname(), emp1.getlname(), "admin");
      	      break;
        case 3 :
        	genEmail=cred.generateEmailId(emp2.getfname().toLowerCase(), emp2.getlname().toLowerCase(), "human resource");
        	//genEmail=cred.generateEmailId(emp1.getfname(), emp1.getlname(), "human resource");
      	      break;
        case 4 :
        	genEmail=cred.generateEmailId(emp2.getfname().toLowerCase(), emp2.getlname().toLowerCase(), "legal");
        	//genEmail=cred.generateEmailId(emp1.getfname(), emp1.getlname(), "legal");
      	      break;
      	default : System.out.println("Please enter valid Input");      
         }
         genPassword=cred.generatePassword();
         emp2.setEmailId(genEmail); //rohit.sharma@tech.gl.com
         emp2.setPassword(genPassword); //a2$%78
         
         cred.showDetails(emp2); //fname, lname, id & pw
         
	}

}
