package test;

import logic.calAge;
import logic.checkInput;

public class testCalAge {
    public static void main(String[] args) {
        String day = "23";
        String month = "12";
        String year = "2004";
        String yearFormat = "Christian Era(A.D.)";

        calAge cal = new calAge();
        checkInput check = new checkInput();
        String birth = check.isNum(day, month, year, yearFormat);
        if (birth.equals("Pass")) {
            birth = check.isReal(day, month, year, yearFormat);
            if (birth.equals("Pass")) {
                int [] age = cal.myAge(day, month, year, yearFormat);
                System.out.println("Age : "+age[0]+" Years");
                System.out.println("Age : "+age[1]+" Months");
                System.out.println("Age : "+age[2]+" Days");
            } else {
                System.out.println(birth);
            }
        } else {
            System.out.println(birth);
        }
    }
}
