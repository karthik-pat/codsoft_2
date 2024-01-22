import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            m[i] = scanner.nextInt();
        }
        int tot = calTot(m);
        double per = calPer(tot, n);
        char g = grade(per);
        disp(tot, per, g);
        scanner.close();
    }
    private static int calTot(int[] m) {
        int tot = 0;
        for (int mark : m) {
            tot += mark;
        }
        return tot;
    }
    private static double calPer(int tot, int n) {
        return (double) tot / n;
    }
    private static char grade(double per) {
        if (per >= 90) {
            return 'A';
        } else if (per >= 80) {
            return 'B';
        } else if (per >= 70) {
            return 'C';
        } else if (per >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    private static void disp(int tot, double per, char g) {
        System.out.println("\nThe Results are below:");
        System.out.println("Total marks Obtained: " + tot);
        System.out.println("Average Percentage Obtained: " + per + "%");
        System.out.println("Your Grade Is: " + g);
    }
}