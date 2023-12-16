import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bilmək istədiyin hərfi yaz: ");
        String vowel = scn.nextLine().toUpperCase();

        switch (vowel){
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println(vowel + " qalın saitdir.");
                break;
            case "E":
            case "Ə":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println(vowel + " incə saitdir.");
                break;
            default:
                System.out.println("Keçərsiz giriş.");
        }

    }
}