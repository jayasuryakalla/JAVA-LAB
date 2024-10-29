import java.util.*;
import java.io.*;
public class StringBuilderDemo {
  public static void main(String args[]) {
    StringBuilder sb1=new StringBuilder("HELLO");
    System.out.println("The resultant string : "+sb1);
    sb1.append("JAVA");
    System.out.println("The resultant string : "+sb1);
    StringBuilder sb2=new StringBuilder("HELLO");
    sb2.insert(2,"java");
    System.out.println("The resultant string : "+sb2);
    StringBuilder sb3=new StringBuilder("HELLO");
    sb3.replace(2,4,"java");
    System.out.println("The resultant string : "+sb3);
    StringBuilder sb4=new StringBuilder("HELLO");
    sb4.delete(1,3);
    System.out.println("The resultant string : "+sb4);
    StringBuilder sb5=new StringBuilder("HELLO");
    sb5.reverse();
    System.out.println("The resultant string : "+sb5);
  }
}
