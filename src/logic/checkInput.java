package logic;

import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.chrono.HijrahDate;

public class checkInput {
    public String isNum(String day, String month, String year, String yearFormat) {

        String d = day.replace(" ", "");
        if (d.isEmpty()) {
            return "Day is required!";
        }
        try {
            Integer.parseInt(d);
        } catch (NumberFormatException e) {
            return "Day must be a number only!";
        }

        String m = month.replace(" ", "");
        if (m.isEmpty()) {
            return "Month is required!";
        }
        try {
            Integer.parseInt(m);
        } catch (NumberFormatException e) {
            return "Month must be a number only!";
        }

        String y = year.replace(" ", "");
        if (y.isEmpty()) {
            return "Year is required!";
        }
        try {
            Integer.parseInt(y);
        } catch (NumberFormatException e) {
            return "Year must be a number only!";
        }

        String yf = yearFormat.replace(" ", "");
        if (yf.isEmpty()) {
            return "Year format is required!";
        }
        
        return "Pass";
    }

    public String isReal(String day, String month, String year, String yearFormat) {
        try {
            int d = Integer.parseInt(day.replace(" ", ""));
            int m = Integer.parseInt(month.replace(" ", ""));
            int y = Integer.parseInt(year.replace(" ", ""));

            LocalDate birthDate;

            if (yearFormat.equals("Buddhist Era(B.E.)")) {
                birthDate = LocalDate.of(y - 543, m, d);
            } else if (yearFormat.equals("Hijrah Era(A.H.)")) {
                HijrahDate hiData = HijrahDate.of(y, m, d);
                birthDate = LocalDate.from(hiData);
            } else {
                birthDate = LocalDate.of(y, m, d);
            }

            if (birthDate.isAfter(LocalDate.now())) {
                return "Birth date cannot be in the future!";
            }

            return "Pass";

        } catch (DateTimeException e) {
            return "Invalid date! This day does not exist in the selected calendar.";
        }
    }
}