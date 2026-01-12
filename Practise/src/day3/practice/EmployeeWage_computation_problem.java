package day3.practice;

import java.util.Scanner;

public class EmployeeWage_computation_problem {

    private  static final int wage_perhr = 20;
    public static void main(String[] args) {

//        Check Employee is
//        Present or Absent
//                - Use ((RANDOM)) for Attendance
//                Check
        int attendance = (int)(Math.random() * 2);

        if (attendance == 1){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }

//        Calculate Daily Employee Wage assume Wage per hour is 20 , assume full day hour is 8

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Hour in an Number the person is worked with Full-time:  ");

        int number = sc.nextInt();

        System.out.print("Enter an Hour in an Number the person is worked with Part-time:  ");
        int parttime_number = sc.nextInt();


        int full_dayhr = 8;

        int totalmoney;

        if (number >= 0 && number <= full_dayhr){

            totalmoney = number * wage_perhr;
            System.out.println("The totalmoney calculated by your Working hours is(Full-time): " +  totalmoney);
        }
else {
            System.out.println("Give the input hours  between 8hrs");

        }

//        Add Part time
//        Employee & Wage
//                - Assume Part time Hour is 8

       full_dayhr = 4;


        if (parttime_number >= 0 && parttime_number <= full_dayhr){

            totalmoney = parttime_number * wage_perhr;
            System.out.println("The totalmoney calculated by your Working hours is(Part-time): " +  totalmoney);
        }
        else {
            System.out.println("Give the input hours  between 4hrs");

        }

//        Solving using  Switch Case  Statement



    }
}
