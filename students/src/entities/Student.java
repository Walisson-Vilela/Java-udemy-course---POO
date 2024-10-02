package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    private final double PASSING_GRADE = 60.00;


    public double finalGrade() {
        return n1 + n2 + n3;
    }

    public String result() {
        double sum = finalGrade();
        if (sum >= PASSING_GRADE) {
            return "PASS";
        } else {
            double missingPoints = PASSING_GRADE - sum;
            return String.format("FAILED. MISSING %.2f POINTS", missingPoints);
        }
    }

    public String toString() {
        return String.format("%.2f", finalGrade()) + "\nResult: " + result();
    }
}
