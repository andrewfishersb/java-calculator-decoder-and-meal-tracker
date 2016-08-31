import java.io.Console;
import java.util.Arrays;

public class Calculator {
  private int num1 =0;
  private int num2 =0;

  public void setNumbers1(int num){
    num1 = num;
  }
  public void setNumbers2(int num){
    num2 = num;
  }
  public int getNumber1(){
    return num1;
  }
  public int getNumber2(){
    return num2;
  }
  public int add(){
    return num1+num2;
  }
  public int subtract(){
    return num1-num2;
  }
  public int divide(){
    return num1/num2;
  }
  public int multiply(){
    return num1*num2;
  }

  public static void main(String[] args) {
    Calculator h = new Calculator();
    Console m = System.console();
    System.out.println("Type a two integers expression");
    String numbers = m.readLine();
    String [] num = numbers.split(" ");
    h.setNumbers1(Integer.parseInt(num[0]));
    h.setNumbers2(Integer.parseInt(num[2]));

    if(num[1].equals("+")){
        System.out.printf("%d + %d = %d\n",h.getNumber1(),h.getNumber2(),h.add());
    }else if(num[1].equals("-")){
        System.out.printf("%d - %d = %d\n",h.getNumber1(),h.getNumber2(),h.subtract());
    }else if(num[1].equals("/")){
      System.out.printf("%d / %d = %d\n",h.getNumber1(),h.getNumber2(),h.divide());
    }else{
        System.out.printf("%d X %d = %d\n",h.getNumber1(),h.getNumber2(),h.multiply());
    }
  }
 }
