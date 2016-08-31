import java.io.Console;
import java.util.Arrays;

public class Decoder{

  public static void main(String[] args){
    Console con = System.console();
    System.out.println("Enter a sentence.");
    String sentence = con.readLine();
    System.out.println("Enter an offset.");
    int offset = Integer.parseInt(con.readLine());
    decoder(sentence, offset);

  }

public static void decoder(String sentence, int offset){
char[] convert = new char[sentence.length()];
  for(int i=0;i<sentence.length();i++){
    int ascii = (int) sentence.charAt(i)+offset;
    convert[i] = (char) ascii;
  }
  String answer = new String(convert);
  System.out.println(convert);
}

}
