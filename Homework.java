public class Homework {
    public static void main(String[] args) {

//        проверяет на отсутствие символов
        String method1 = " ";
        boolean result1 = method1.isEmpty();
        System.out.println(result1);

//        проверяет на отсутствие символов (не пробелов)
        String method2 = " ";
        boolean result2 = method2.isBlank();
        System.out.println(result2);

//        возвращает подстроку заданную в виде диапазона
        String method3 = "impossible";
        String result3 = method3.substring(2,10);
        System.out.println(result3);

//        возвращает индекс первого вхождения заданной подстроки
        String method4 = "wwabcdabrt";
        int result4 = method4.indexOf("ab");
        System.out.println(result4);

//        возвращает индекс последнего вхождения заданной подстроки
        String method5 = "wwabcdabrt";
        int result5 = method5.lastIndexOf("ab");
        System.out.println(result5);

//        приводит строку к нижнему регистру
        String method6 = "MoSCow";
        String result6 = method6.toLowerCase();
        System.out.println(result6);

//        приводит строку к верхнему регистру
        String method7 = "MoScow";
        String result7 = method7.toUpperCase();
        System.out.println(result7);

//        заменяет заданную подстроку на другую заданную подстроку
        String method8 = "aabbattaa";
        String result8 = method8.replace("aa", "XX");
        System.out.println(result8);

//        проверяет начинается ли строка с заданной подстроки
        String method9 = "Moscow";
        boolean result9 = method9.startsWith("Mo");
        System.out.println(result9);

//        проверяет заканчивается ли строка заданной подстрокой
        String method10 = "Moscow";
        boolean result10 = method10.endsWith("cow");
        System.out.println(result10);

//        повторяет строку заданное кол-во раз
        String method11 = "Moscow";
        String result11 = method11.repeat(3);
        System.out.println(result11);

//        проверяет содержит ли строка заданную подстроку
        String method12 = "Moscow";
        boolean result12 = method12.contains("sc");
        System.out.println(result12);

//        добавляет к строке заданную строку
        String method13 = "You";
        String result13 = method13.concat(" & me");
        System.out.println(result13);

//        удаляет пробелы в начале и в конце строки
        String method14 = "    There are a lot of whitespaces        ";
        String result14 = method14.trim();
        System.out.println(result14);

//        проверяет равна ли строка заданной строке
        String method15 = "Moscow";
        boolean result15 = method15.equals("Moscow");
        System.out.println(result15);
    }
}
