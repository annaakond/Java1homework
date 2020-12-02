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
        enterDigit();
        compareDigit();
        repeatGame();
    }


    private static void setNumber() {


        }


    private static void enterDigit() {
        for (int i = 0; i < 3; i++);{
            compareDigit();
        }
    }

    public static void compareDigit() {
        int digit = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число");
        int printedDigit = scanner.nextInt();

        if (printedDigit == digit){
            System.out.println("Отлично!");

        } repeatGame();
        if (printedDigit < digit); {
        System.out.println("Не угадали. Ваше число меньше задуманного.");
        }
        compareDigit();
        if (printedDigit > digit); {
        System.out.println("Не угадали. Ваше число больше задуманного.");
        }
        compareDigit();


    }
    private static void repeatGame() {
        while (true) {
            System.out.println("Повторить игру ещё раз? 1 - да / 0 - нет" );
            chooseAction();
        }
    }

    private static void chooseAction() {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        switch(in) {
            case "1":
                enterDigit();
                break;
            case "0":
                doExit();
                break;
        }

    }
    private static void doExit() {
        System.exit(0);
    }





}



