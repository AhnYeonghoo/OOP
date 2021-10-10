import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int human;
        int[] score = new int[3];
        int multiply;
        int result;
        int[] number = new int[1000];
        int[] temp = new int[100];
        int[] tempPlus = new int[100];
        Scanner scan = new Scanner(System.in);

        human = scan.nextInt();
        for (int i = 0; i < human; i++) {
            number[i] = scan.nextInt();
            for (int j = 0; j < 3; j++) {
                score[j] = scan.nextInt();
            }
            temp[i] = score[0] * score[1] * score[2];
            tempPlus[i] = score[0] + score[1] + score[2];
        }
        for (int i = 0; i < human-1; i++) {
            for (int j = 0; j < human - 1; j++) {
                if (temp[j] > temp[j+1]) {
                    int im = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = im;
                    int im2 = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = im2;
                    int imPlus = tempPlus[j];
                    tempPlus[j] = tempPlus[j + 1];
                    tempPlus[j + 1] = imPlus;
                } else if (temp[j] == temp[j+1]) {
                    if (tempPlus[j] > tempPlus[j+1]) {
                        int im = number[j];
                        number[j] = number[j+1];
                        number[j+1] = im;
                        int im2 = temp[j];
                        temp[j] = temp[j+1];
                        temp[j+1] = im2;
                        int imPlus = tempPlus[j];
                        tempPlus[j] = tempPlus[j+1];
                        tempPlus[j+1] = imPlus;
                    } else if(temp[j] == temp[j+1] && tempPlus[j] == tempPlus[j+1]){
                        if(number[j] > number[j+1]) {
                            int im = number[j];
                            number[j] = number[j+1];
                            number[j+1] = im;
                            int im2 = temp[j];
                            temp[j] = temp[j+1];
                            temp[j+1] = im2;
                            int imPlus = tempPlus[j];
                            tempPlus[j] = tempPlus[j+1];
                            tempPlus[j+1] = imPlus;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", number[i]);
        }

    }
}
