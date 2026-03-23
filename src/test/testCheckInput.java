package test;
import logic.checkInput;

public class testCheckInput {
    public static void main(String[] args) {
        String dd = "28";
        String mm = "10";
        String yy = "2544";
        String ty = "Buddhist Era(B.E.)";

        checkInput check = new checkInput();
        String result = check.isNum(dd, mm, yy, ty);
        if (result.equals("Pass")) {
            result = check.isReal(dd, mm, yy, ty);
            if (result.equals("Pass")) {
                System.out.println(result);
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println(result);
        }
    }
}
