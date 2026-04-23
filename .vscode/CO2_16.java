import java.util.Scanner;

interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Below First Division";
        }
    }
}

public class CO2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        Result res = new Result();

        String division = res.getDivision(avg);

        System.out.println("Division: " + division);

        sc.close();
    }
}