package hust.soict.dsai.lab01.lab1;

import java.util.Scanner;

public class ValidDate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";
        
        System.out.println("Enter a Month (full name, abbreviation, or number): ");
        String monthInput = scanner.next();
        
        System.out.println("Enter a year:");
        int year = scanner.nextInt(); 
        
        int month = convertMonthInputToNumber(monthInput);
        
        switch(month) {
        case 1:
            MonthOfName = "January";
            number_Of_DaysInMonth = 31;
            break;
        case 2:
            MonthOfName = "February";
            number_Of_DaysInMonth = (isLeapYear(year)) ? 29 : 28;
            break;
        case 3:
            MonthOfName = "March";
            number_Of_DaysInMonth = 31;
            break;
        case 4:
            MonthOfName = "April";
            number_Of_DaysInMonth = 30;
            break;
        case 5:
            MonthOfName = "May";
            number_Of_DaysInMonth = 31;
            break;
        case 6:
            MonthOfName = "June";
            number_Of_DaysInMonth = 30;
            break;
        case 7:
            MonthOfName = "July";
            number_Of_DaysInMonth = 31;
            break;
        case 8:
            MonthOfName = "August";
            number_Of_DaysInMonth = 31;
            break;
        case 9:
            MonthOfName = "September";
            number_Of_DaysInMonth = 30;
            break;
        case 10:
            MonthOfName = "October";
            number_Of_DaysInMonth = 31;
            break;
        case 11:
            MonthOfName = "November";
            number_Of_DaysInMonth = 30;
            break;
        case 12:
            MonthOfName = "December";
            number_Of_DaysInMonth = 31;
            break;
        default:
            System.out.println("Invalid month input.");
            System.exit(1);
        }
        
        System.out.println(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days.");
        
        scanner.close();
    }
    
    private static int convertMonthInputToNumber(String monthInput) {
        monthInput = monthInput.toLowerCase();
        switch(monthInput) {
        case "january":
        case "jan":
        case "jan.":
        case "1":
            return 1;
        case "february":
        case "feb":
        case "feb.":
        case "2":
            return 2;
        case "march":
        case "mar":
        case "mar.":
        case "3":
            return 3;
        case "april":
        case "apr":
        case "apr.":
        case "4":
            return 4;
        case "may":
        case "5":
            return 5;
        case "june":
        case "jun":
        case "jun.":
        case "6":
            return 6;
        case "july":
        case "jul":
        case "jul.":
        case "7":
            return 7;
        case "august":
        case "aug":
        case "aug.":
        case "8":
            return 8;
        case "september":
        case "sep":
        case "sep.":
        case "sept":
        case "sept.":
        case "9":
            return 9;
        case "october":
        case "oct":
        case "oct.":
        case "10":
            return 10;
        case "november":
        case "nov":
        case "nov.":
        case "11":
            return 11;
        case "december":
        case "dec":
        case "dec.":
        case "12":
            return 12;
        default:
            return -1;
        }
    }
    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}