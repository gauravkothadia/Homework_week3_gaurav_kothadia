package week3;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme02_CheckLeapYear {

    public String checkLeapYear(int year){
        String ans = "";
        if((year%4==0)&&((year%100!=0)||(year%400==0))){
            ans = " is a leap year.";
        }else {
            ans = " is NOT a leap year.";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int num = scanner.nextInt();
        Programme02_CheckLeapYear lp = new Programme02_CheckLeapYear();
        System.out.println(num+lp.checkLeapYear(num));
    }
}
