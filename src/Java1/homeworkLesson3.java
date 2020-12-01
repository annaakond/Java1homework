package Java1;

import org.w3c.dom.ls.LSOutput;


import java.util.Random;
import java.util.Scanner;

public class homeworkLesson3 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        gameRiddle();

    }

       private static void gameRiddle() {

        compareDigit();
        repeatGame();
    }


    private static void setNumber() {


        }


    private static void enterDigit() {






    }

    public static void compareDigit() {
        int digit = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число");
        int printedDigit = scanner.nextInt();
        scanner.close();

        if (printedDigit < digit); {
        System.out.println("Не угадали. Ваше число меньше задуманного.");
        }
        if (printedDigit > digit); {
        System.out.println("Не угадали. Ваше число больше задуманного.");
        }
        if (printedDigit == digit){
            System.out.println("Отлично!");
        }

    }
        private static void repeatGame() {
                while (true) {
            System.out.println("Повторить игру ещё раз? 1 - да / 0 - нет" );
            chooseAction();
               }
        }

            private static void chooseAction() {
                switch(in.next) {
                    case "1":
                        enterDigit();
                    case "0":
                        doExit();
                }

            }
            private static void doExit() {
                System.exit(0);
            }





}



