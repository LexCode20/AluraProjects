import java.util.Scanner;

public class UsingChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char justOneCharacter;
        String someCharacters;

        System.out.println("Text some characters");
        someCharacters = sc.nextLine();
        System.out.println("Text a single character");
        justOneCharacter = sc.next().charAt(0);
        System.out.println(someCharacters+""+justOneCharacter);

    }
}
