package datatypes;



public class Task_3_3 {
    public static void main(String[] args){
        /*Вычислить значение логического выражения при следующих значениях логических величин
        А, В и С: А = Истина, В = Ложь, С = Ложь:
         */
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean result = !a&&b;

        System.out.println(result);

        result = a||(!b);
        System.out.println(result);





    }

}
