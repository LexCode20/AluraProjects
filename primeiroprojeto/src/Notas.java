import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        int mediaInteira;
        System.out.println("Welcome to the HighSchool notes exams");
        System.out.println("Wrote your first note: ");
        n1 = sc.nextDouble();
        System.out.println("Wrote your second note: ");
        n2 = sc.nextDouble();
        media = (n1 + n2)/2;
        mediaInteira = (int) media;//Making a media casting
        System.out.println("Final integer media is: "+mediaInteira);
    }
}
