package Password;


public class  PasswordComplexity extends PasswordMeterV2 {
    public String complexity;
    public int score;

     if (score > 100) {
        score = 100;
    } else if (score < 0) {
        score = 0;
    }

     if (score < 20) {
        complexity = "Very Weak";
    } else if (score < 40) {
        complexity = "Weak";
    } else if (score < 60) {
        complexity = "Good";
    } else if (score < 80) {
        complexity = "Strong";
    } else {
        complexity = "Very Strong";
    }
}

}
