import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        guessTheNumber();
    }


    public static void guessTheNumber(){
        System.out.println("Это игра угодай число, вам будет загаданно число от 0 до 9, ваша задача угадать его за 3 попытки");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number;
        int attempts = 3;
        String str = "yes";
        String answer;
        do {
            int anyNumber = rand.nextInt(10);
            for (int n = 0, score = attempts -1; n <= attempts ; n++, score--) {
                System.out.println(" Введите число от 0 до 9");
                number = scan.nextInt();
                if(number < 0 || number > 9){
                    System.out.println("Вы угазали число вне диапазона. Пожалуйста попробуйте снова \n");
                    continue;
                }
                if (number == anyNumber){
                    System.out.printf("Поздравляем вы угадали это число - %d \n", anyNumber);
                    break;
                }
                if (score == 0){
                    System.out.printf("К сожалению у вас заеончились попытки. Мы  загадывали чило %d \n",  anyNumber);
                    break;
                }
                if (number > anyNumber){
                    System.out.printf("Загаданное число меньше %d попробуйте снова, у вас осталось попыток %d  \n", number, score);
                }
                if (number < anyNumber){
                    System.out.printf("Загаданное число больше %d попробуйте снова, у вас осталось попыток %d \n", number, score);
                }
            }
                System.out.println("Если хотите попробовать снова введите Yes если нет No");
                Scanner word = new Scanner(System.in);
                answer = word.nextLine().toLowerCase(Locale.ROOT);
        }while (str.equals(answer));
        System.out.println("Спасибо за игру, досвидания");

    }
}
