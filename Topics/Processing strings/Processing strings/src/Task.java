// You can experiment here, it won't be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    String word = "racecar";
    String reversedWord = "";
    for (int i = word.length() - 1; i >= 0; i--){
      reversedWord += word.charAt(i);
    }
    System.out.println(reversedWord);
    if (word.equals(reversedWord)){
      System.out.println("palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }
}
