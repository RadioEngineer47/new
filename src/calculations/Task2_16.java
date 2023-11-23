package calculations;

public class Task2_16 {
    public  static void main (String[] args){
        int a =123;
        int o =  a%10;
        int c = (a/10)%10;
        int v = a/100;
        int sum = o+c+v;
        int mul = o*c*v;
        int NewNumber = c*100 + v*10 +o;
        System.out.println(NewNumber);
    }
}

