import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double menu, aS, aC;
        System.out.println("Type 1 to the calculate square area\nType 2 to the calculate circle area");
        menu = sc.nextInt();
        if (menu == 1){
            System.out.println("Ok do you choice Square area..\nnow type a other number to ther calculate the square area");
            aS = sc.nextInt();
            double aSC = aS * aS;
            System.out.println("The Square area is: "+aSC);
        }else if (menu == 2) {
            System.out.println("Ok do you choice Circle area..\nnow type a other number to ther calculate the circle area");
            aC = sc.nextInt();
            double aCC = 3.14159265359 * (aC * aC);
            System.out.println("The Square area is: "+aCC);
        }
    }
}
