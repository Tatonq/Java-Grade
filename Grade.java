import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int score;
        Scanner scanf = new Scanner(System.in);
        System.out.print("ใส่คะแนนที่คุณได้ : ");
        score = scanf.nextInt();
        if(score > 100 && score < 0) {
            System.out.println("คุณใส่คะแนนผิด");
        } else if (score >= 80) {
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B+");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 65) {
            System.out.println("C+");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 55) {
            System.out.println("D+");
        } else if (score >= 50) {
            System.out.println("D");
        } else if (score <= 49) {
            System.out.println("F");
        }
    }
}
