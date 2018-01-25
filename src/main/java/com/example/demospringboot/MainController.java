package com.example.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public String showIndex() {
        String userName = "";
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter your name");
        userName = keyboard.nextLine();
        String greet = "Hello " + userName;
        System.out.println(greet);
        return greet;

    }

    @RequestMapping("/new")
    public String test() {
        String myName = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        myName = keyboard.nextLine();
        String hi = "My name is " + myName;
        System.out.println(hi);
        return hi;
    }

    @RequestMapping("/yes")
    public void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");

            } else {
                System.out.println(i);
            }
        }


    }
    @RequestMapping("/grade")
    public String gradingApp ()
    {


        //  double calculatedScore;
          char letterGrade;

        Scanner key = new Scanner(System.in);


        System.out.println("Enter the Number");
        int stuNum = key.nextInt();


        System.out.println("Enter the Name");
        String stuName= key.next();

        System.out.println("Enter the Test Score");
        double testScore=key.nextDouble();

       double calculatedScore= (testScore/50)*100;

        if (calculatedScore >= 90) {
            letterGrade = 'A';
        } else if (calculatedScore > 79 && calculatedScore<=89 ) {
            letterGrade = 'B';
        } else if (calculatedScore > 69 && calculatedScore<=79) {
            letterGrade = 'C';
        } else if (calculatedScore > 59 && calculatedScore <=69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }




       String result = "Student Name = " + stuName +  "Student Number = " +  stuNum  + "Student test Score= " + testScore + "Student Letter Grade = " + letterGrade;

         System.out.println(result);
         return result;
    }


//    @RequestMapping("/sales")
//    public String salesReport()
//    {
//        int counter = 0;
//         double tax;
//         String salesTax;
//
//
//        Scanner  kb = new Scanner(System.in);
//        do
//        System.out.println("Enter the Number");
//        double customerNum = kb.nextDouble();
//        System.out.println("Enter the Name");
//        String customerName=kb.nextLine();
//        System.out.println("Enter the Amount");
//        double salesAmount = kb.nextDouble();
//        System.out.println("Enter the TaxCode");
//        int taxCode = kb.nextInt();
//
//        if (taxCode==0)
//            tax = 1;
//            salesTax = "tax exempt";
//            else if (taxCode ==1)
//                tax= .03;
//                salesTax ="3%";
//                else if (taxCode==2)
//                      tax = .05;
//                     salesTax = "5%";
//
//                  double  salesTaxDue = salesAmount * tax;
//                  double totalAmountDue = salesAmount + salesTaxDue;
//
//                  String report = "Cust"
//                          System.out.println(report);
//                             return report;
//
//
//
//
//
//    }


}