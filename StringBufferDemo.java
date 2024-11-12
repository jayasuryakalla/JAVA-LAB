public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer str =new StringBuffer("Hello World!");
        System.out.println("String is "+str);
        str.replace(6,12,"java");
        System.out.println("Modified string: "+str);
        str.delete(0, 5);
        str.insert(0,"Morning ");
        System.out.println("Modified string: "+str);
    }
}
