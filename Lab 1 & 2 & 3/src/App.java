import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lab No 1-3");
        int choice = input.nextInt();
        int task;
        if (choice==1) {
            System.out.println("Task No 1-5");
            task=input.nextInt();
            if (task==1) {
            Lab1task1();
        }
        else if (task==2) {
            Lab1task2();
        }
        else if (task==3) {
            Lab1task3();
        }
        else if (task==4) {
            Lab1task4();
        }
        else if (task==5) {
            Lab1task5();
        }
        else{
            System.out.println("Invalid Input");
        }
        }
        if (choice==2) {
            System.out.println("Task No 1-4");
            task=input.nextInt();
            if (task==1) {
            Lab1task1();
        }
        else if (task==2) {
            Lab1task2();
        }
        else if (task==3) {
            Lab1task3();
        }
        else if (task==4) {
            Lab1task4();
        }
        else{
            System.out.println("Invalid Input");
        }
        }
        else if (choice==3) {
            Lab3();
        }
        else {
            System.out.println("Invalid Input");
        }
        input.close();
    }
    public static void Lab1task1() {
        int variable1 =1;
       // float variable2=12.4343;
        double variable3=3.509037;
        short variable4=23;
        long variable5=3212;
      //  boolean variable6=true;
        byte variable7=12;
        char variable8='c';
        String variable9="AINT-2A";
        System.out.println("variable 1 ="+ variable1 +  "variable 3 ="+ variable3+ "variable 4 ="+ variable4+ "variable 5 ="+ variable5+ "variable 7 ="+ variable7+ "variable 8 ="+ variable8+ "variable 9 ="+ variable9);
    }
    public static void Lab1task2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        double radius= input.nextDouble();
        double area = 3.14*radius;
        System.out.println("Area is:" + area);
        input.close();
    }
    public static void Lab1task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int table= input.nextInt();
        System.out.println(table+ " * 1 = " + table*1);
        System.out.println(table+ " * 2 = " + table*2);
        System.out.println(table+ " * 3 = " + table*3);
        System.out.println(table+ " * 4 = " + table*4);
        System.out.println(table+ " * 5 = " + table*5);
        System.out.println(table+ " * 6 = " + table*6);
        System.out.println(table+ " * 7 = " + table*7);
        System.out.println(table+ " * 8 = " + table*8);
        System.out.println(table+ " * 9 = " + table*9);
        System.out.println(table+ " * 10 = " + table*10);
        input.close();
        
    }
    public static void Lab1task4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        float Year = input.nextFloat();
        System.out.println("In months : " + Year*12);
        System.out.println("In Days : " + Year*365);
        input.close();
    }
    public static void Lab1task5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Tempreture in Celcius: ");
        double temp = input.nextDouble();
        System.out.println("Farenheit = " + (temp*1.8+32));
        input.close();
    }
    public static void Lab3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting year");
        int start = input.nextInt();
        System.out.println("Enter ending year");
        int end = input.nextInt();
        if (start >= 1000 && start < end) {
            do {
                if (start % 4 == 0 ) {
                    System.out.println("Leap Year :" + start);
                    start++;
                } else {
                    start++;
                }
            }while( start < end) ;
        } else {
            System.out.println("Enter year greater than 1000");
        }
        input.close();
    }
    public static void Lab2task2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        System.out.println("Add = " + (num1+num2));
        System.out.println("subtract = " + (num1-num2));
        System.out.println("Multiply = " + (num1*num2));
        System.out.println("Divide = " + (num1/num2));
        System.out.println("Remainder = " + (num1%num2));
        input.close();
    }
    public static void Lab2task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int month= input.nextInt();
        if (month==1) {
            System.out.println(" January"  );
        }
        else if (month==2) {
            System.out.println(" Feburary"  );
        }
        else if (month==3) {
            System.out.println(" March"  );
        }
        else if (month==4) {
            System.out.println(" April"  );
        }
        else if (month==5) {
            System.out.println(" May"  );
        }
        else if (month==6) {
            System.out.println(" June"  );
        }
        else if (month==7) {
            System.out.println(" July"  );
        }
        else if (month==8) {
            System.out.println(" August"  );
        }
        else if (month==9) {
            System.out.println(" September"  );
        }
        else if (month==10) {
            System.out.println(" October"  );
        }
        else if (month==11) {
            System.out.println(" November"  );
        }
        else if (month==12) {
            System.out.println("December"  );
        }
        else{
            System.out.println("invalid Output");
        }
        

        input.close();
        
    }
    public static void Lab2task4() {
        Scanner input = new Scanner(System.in);
        int counteven=0,countodd=0,countzero=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter value");
            int choice= input.nextInt();
        if (choice==0) {
            countzero++;
        }
        else if (choice%2!=0) {
            countodd++;
        }
        else
        {
            counteven++;
        }
    }
    System.out.println("Even : " + counteven);
    System.out.println("Odd : " + countodd);
    System.out.println("zero : " + countzero);
        input.close();
    }
    public static void Lab2task1() {
        Scanner input = new Scanner(System.in);
        double sum=0;
        for(int i =0;i<3;i++)
        {
            System.out.println("Enter Marks");
            double marks = input.nextDouble();
            sum=sum+marks;
        }
        double avg=sum/3;
        if (avg>=50) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        input.close();
    }
}
