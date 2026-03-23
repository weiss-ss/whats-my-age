package logic;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.HijrahDate;

public class calAge {
    public int[] myAge(String day, String month, String year, String yearFormat) {

        int d = Integer.parseInt(day.replace(" ", ""));
        int m = Integer.parseInt(month.replace(" ", ""));
        int y = Integer.parseInt(year.replace(" ", ""));

        LocalDate toDay = LocalDate.now();
        LocalDate birthDate;

        //Buddhist Era(B.E.)
        if (yearFormat.equals("Buddhist Era(B.E.)")) {
            birthDate = LocalDate.of(y - 543, m, d);
        //Hijrah Era(A.H.)
        } else if (yearFormat.equals("Hijrah Era(A.H.)")) {
            HijrahDate hiData = HijrahDate.of(y, m, d);
            birthDate = LocalDate.from(hiData);
        //Christian Era(A.D.)
        } else {
            birthDate = LocalDate.of(y, m, d);
        }

        Period period = Period.between(birthDate, toDay);
        int Y = period.getYears();
        int M = period.getMonths();
        int D = period.getDays();

        return new int[] { Y, M, D };

    }
}
