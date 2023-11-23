package calculations;

public class logical2 {
    public static void main(String[] args){

        int a=1, b=1, c=3;
        System.out.println((a==b)&&(b!=c));
        System.out.println((b>a)||(c>a));
        System.out.println((a>=b)&&(b<=c));
        boolean b4 = (a!=b)&&(b!=c)&&(c!=a);
        System.out.println(b4);
        boolean b5 = (a%2==0)&&(b%2!=0)&&(c<0);
        System.out.println(b5);




        /*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */
    }



}
