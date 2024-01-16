class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a*b;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(Calculator.add(2, 3));
        System.out.println(Calculator.add(2, 3, 4));
    }
}

