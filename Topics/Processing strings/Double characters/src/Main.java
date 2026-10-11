import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        String s = myString.replaceAll(".", "$0$0");
        /*
        The method String.replaceAll uses the regular expression syntax which is described in the documentation of
        the Pattern class, where we can learn that . matches “any character”. Within the replacement,
        $number refers to numbered “capturing group” whereas $0 is predefined as the entire match.
        So $0$0 refers to the matching character two times. As the name of the method suggests,
         it is performed for all matches, i.e. all characters.
        */
        System.out.println(s);
    }
}