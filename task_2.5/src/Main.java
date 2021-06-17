import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if(num == 10){
            System.out.println("Верно");
        }
        else{
            System.out.println("Не верно");
        }
        in.close();
    }
}

