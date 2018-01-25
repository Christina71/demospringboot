package com.example.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public String showIndex()
    {
        String userName="";
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter your name");
        userName = keyboard.nextLine();
        String greet = "Hello " + userName;
        System.out.println(greet);
                return greet;

        }
    @RequestMapping ("/new")
    public String test ()
    {
        String myName = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        myName =keyboard.nextLine();
        String hi = "My name is " + myName;
        System.out.println(hi);
        return hi;
    }
//    @RequestMapping ("/yes")
//    public void fizzBuzz ()
//    {
//        for (int i=0;i<=100;i++)
//        {
//    }
    }

