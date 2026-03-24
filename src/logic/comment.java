package logic;

public class comment {
    public String getCom(int age) {
        
        if (age <= 1) {
            return "You probably can't read this yet, can you? :)";
        } else if (age <= 4) {
            return "HELLO!";
        } else if (age <= 12) {
            return "You're going to meet so many new friends from now on!";
        } else if (age <= 19) {
            return "Sometimes things get tough, but remember, this too shall pass.";
        } else if (age <= 39) {
            return "You look a bit tired. How about taking a break and doing what you love?";
        } else if (age <= 59) {
            return "Are you the adult that your younger self dreamed of becoming?";
        } else if (age <= 79) {
            return "How have you been lately? Are you doing well?";
        } else if (age <= 99) {
            return "I'm so happy to see you here! ^_^";
        } else {
            return "Wait... are you actually still alive?! ...";
        }
    }
}
