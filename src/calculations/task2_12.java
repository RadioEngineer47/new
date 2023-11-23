package calculations;

public class task2_12 {
    public  static void main (String[] args){
        /*. Дано трехзначное число. Найти:
а) число единиц в нем;
б) число десятков в нем;
в) сумму его цифр;
г) произведение его цифр./*
         */
        int a =153;
        int o =  a%10;
        int c = (a/10)%10;
        int v = a/100;
        int sum = o+c+v;
        int mul = o*c*v;
        System.out.println(sum);
        System.out.println(mul);
    }
}
