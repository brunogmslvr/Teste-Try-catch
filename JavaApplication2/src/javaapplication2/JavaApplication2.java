/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 962027
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // exercicio 1
        System.out.println("Hello word!");
        
        
        //exercicio 2
        
        //this is a single-line comment
                
       /* this is a multi-line 
comment */
    
       //exercicio 3
       
       String carName = "Volvo";
       System.out.println(carName);
     
       
       
       //exercicio 4
       
       int maxSpeed = 120;
       System.out.println(maxSpeed);
       
       
       //exercicio 5
       
       int x = 5;
       int y = 10;
       
        System.out.println(x+y);
        
        
        //exercicio 6
        
         x = 5;
         y = 10;
        int z = x + y;
        System.out.println(z);
        
        
        //exercicio 7
        
         x = 5; y = 6;
         z = 50;
         
        System.out.println(x + y + z);
        
        // Exercício 8
        int myNum = 9;
        System.out.println(myNum);
        float myFloatnum = 8.99f;
        System.out.println(myFloatnum);
        String myLetter = "A";
        System.out.println(myLetter);
        boolean myBool = false;
        System.out.println(myBool);
        String myText = "Hello World!";
        System.out.println(myText);
        // Exercício 9
         //Java data types
         
        // EXERCÍCIO 10
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        
        // Exercício 11
        System.out.println(10 * 5);
        
        // Exercício 12
        System.out.println(10 / 5);
        
        // Exercício 13
        x = 10;
        x++;
        System.out.println(x);
        
        // Exercício 14
        x = 10;
        x += 5;
        System.out.println(x);
        
        // Exercício 15
        String greeting = "Hello!";
        System.out.println(greeting);
        
        // Exercício 16
        String txt = "hello!";
        System.out.println(txt.toUpperCase());
        
        // Exercício 17
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + ' ' + lastName);
        
        // Exercício 18
        firstName = "John";
        lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        
        // Exercício 19
        txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));
        
        // Exercício 20
        x = 5;
        y = 10;
        System.out.println(Math.max(x,y));
        
        // Exercício 21
       x = 16;
       System.out.println(Math.sqrt(x));
       // Exercício 22
       double rand = Math.random() * 1;
       System.out.println(rand);
       //Exercício 23
       boolean isJavaFun = true;
       boolean isFishTasty = false;
       System.out.println(isJavaFun);
       System.out.println(isFishTasty);
       //Exercício 24
       x = 10;
       y = 9;
       System.out.println(x > y);
       // Exercício 25
       x = 50;
       y = 10;
       if (x > y){
        System.out.println("Hello World!");   
       }
       // Exercício 26
       x = 50;
       y = 50;
       if (x == y){
        System.out.println("Hello World!");   
       }
       // Exercício 27
       x = 50;
       y = 50;
       if (x == y){
        System.out.println("Yes!");   
       }else{
           System.out.println("No!");
       }
       // Exercício 28
       x = 50;
       y = 50;
       if (x == y){
        System.out.println("1");   
       }else if (x > y) {
           System.out.println("2");
       }else {
           System.out.println("3");
       }
       // Exercício 29
       int time = 20;
       String result = (time < 18) ? "Good day." : "Good evening.";
       System.out.println(result);
       // Exercício 30
       int day = 2;
       switch (day) {
           case 1:
           System.out.println("Saturday");
           break;
           case 2:
           System.out.println("Sunday");
           break;
       }
       // Exercício 31
       day = 4;
       switch (day) {
           case 1:
           System.out.println("Saturday");
           break;
           case 2:
           System.out.println("Sunday");
           break;
           default:
           System.out.println("Weekend");    
       }
       System.out.println("Hello World!");
       // Exercício 32
       int i = 1;
       while (i < 6){
           System.out.println(i);
           i++;
       }
       // Exercício 33
       i = 1;
       do {
           System.out.println(i);
           i++;
       }
       while (i < 6);
       // Exercício 34
       for ( i = 0; i < 5; i++){
           System.out.println("Sim!");
       }
       // Exercício 35
       String[] cars = {"Volvo", "BMW", "Ford"};
       for (String c : cars){
           System.out.println(c);
       }
       // Exercício 36
       for (i = 0; i < 10; i++){
           if (i == 5){
               break;
           }
           System.out.println(i);
       }
       // Exercício 37
       for (i = 0; i < 10; i++) {
           if (i == 4) {
               continue;
            }
            System.out.println(i);
        }
       // Exercício 38
       //String[] cars = {"Volvo", "BMW", "Ford"};
       // Exercício 39
       System.out.println(cars[1]);
       // Exercício 40
       cars[0] = ("Opel");
       System.out.println(cars[0]);
       // Exercício 41
       //String[] cars = {"Volvo", "BMW", "Ford"};
       System.out.println(cars.length);
       // Exercício 42
       //String[] cars = {"Volvo", "BMW", "Ford"};
       for (String c : cars){
           System.out.println(c);
       }
       // Exercício 43
       int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
       /* Exercício 44
       RESPOSTA myMethod(); */
       /* Exercício 45
       RESPOSTA myMethod();
                myMethod();*/
       /* Exercício 46
       
       static void myMethod(String fname) {
            System.out.println(fname + " Doe");
        } */
       /* Exercício 47
       
       static int myMethod(int x) {
           return 5 + x;
        }
       */
    }
    // Exercício 48
       public class MyClass {
         int x =5;  
    // Exercício 49
    MyClass myObj = new MyClass();
    // Exercício 50
        //System.out.println(myObj.x);
    // Exercício 50
    // myObj.myMethod();
    /* Exercício 51
    public class MyClass {
  int x;
    }
     public MyClass() {
    x = 5;
    }
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
    */
    /* Exercício 52
    final class MyClass
    */
    /* Exercício 53
    import java.util.Scanner;
    */
    /* Exercício 54
    class Car extends Vehicle;
    */
    } 
}

    



