public class Sum {
    public int Sum(){

        return 3+5;
    }
    public int Sum(int x,int y){
        return x+y;
    }
    public int Sum(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String args[]){
        int a=2,b=8,c=96;
        Sum s = new Sum();
        System.out.println(s.Sum());
        System.out.println(s.Sum(a,b));
        System.out.println(s.Sum(a,b,c));
    }
}
