import java.util.*;
import java.io.*;
public class StringBufferDemo {
  public static void main(String args[]) {
    StringBuffer sb1=new StringBuffer("HELLO");
    System.out.println("The resultant string : "+sb1);
    sb1.append("JAVA");
    System.out.println("The resultant string : "+sb1);
    StringBuffer sb2=new StringBuffer("HELLO");
    sb2.insert(2,"java");
    System.out.println("The resultant string : "+sb2);
    StringBuffer sb3=new StringBuffer("HELLO");
    sb3.replace(2,4,"java");
    System.out.println("The resultant string : "+sb3);
    StringBuffer sb4=new StringBuffer("HELLO");
    sb4.delete(1,3);
    System.out.println("The resultant string : "+sb4);
    StringBuffer sb5=new StringBuffer("HELLO");
    sb5.reverse();
    System.out.println("The resultant string : "+sb5);
  }
}
