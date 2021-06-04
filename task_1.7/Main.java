/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            System.out.print("Введите оператор: ");
            String operator = scanner.next();
            double result = calc(a,b,operator);
            System.out.println("Результат: " + result);
            System.out.println("Для выхода введите exit, для продолжения нажмите enter");
            scanner.nextLine();
            String command = scanner.nextLine();
            if(command.equals("exit")) break;
        }

    }



    public static double calc(double a, double b, String operator){
        double result = 0;
        if(operator.equals("+")) result = a+b;
        else if(operator.equals("-")) result = a-b;
        else if(operator.equals("*")) result = a*b;
        else if(operator.equals("/")) result = a/b;
        return result;
    }

    public static void sayHi(String name){
        System.out.println("Hello "+name);
    }
}