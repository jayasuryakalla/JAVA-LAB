public class ThreadDemo extends Thread{
    public static void main(String args[]){
        ThreadDemo td1= new ThreadDemo();
        ThreadDemo td2= new ThreadDemo();
        td1.start();
        td2.start();
        String str=td2.getName();
        System.out.println("Thread2 name is "+str);
    }
    public void run(){
        System.out.println("Thread is created and is running");
    }
}