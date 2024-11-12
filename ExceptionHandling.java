public class ExceptionHandling {
    public static void main(String []args){
        int a =4;
        int arr[]=new int[5];
        int c;
        try {
            c=a;
            arr[12]=98;
            System.out.println("a/b="+c);
        } catch (ArithmeticException ae) {
            System.out.println("Exception caugth");
        }
        catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Array exception caugth");
        }
        catch (Exception e){
            System.out.println("Eception caugth");
        }
    }
    
}
