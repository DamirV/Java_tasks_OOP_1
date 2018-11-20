package ControlStructures;

import java.util.Arrays;

public class Main {

    public static void main(String[] argv) {
        long time;
        String[] str = new String[5];
        str[0] = "monday";
        str[1] = "tuesday";
        str[2] = "wednesday";
        str[3] = "thursday";
        str[4] = "friday";

        time = System.nanoTime();
        for(int i = 0; i < 5; i ++) {
            switch (str[i]) {

                case "monday":
                    System.out.println("monday");
                    break;

                case "tuesday":
                    System.out.println("tuesday");
                    break;

                case "wednesday":
                    System.out.println("wednesday");
                    break;

                case "thursday":
                    System.out.println("thursday");
                    break;

                case "friday":
                    System.out.println("friday");
                    break;
            }
        }
        time = System.nanoTime() - time;
        System.out.println("Время для switch: " + time + " нс\n");

        time = System.nanoTime();
        for(int i = 0; i < 5; i++){

            if(str[i] == "monday"){
                System.out.println("monday");
            }
            else if(str[i] == "tuesday"){
                System.out.println("tuesday");
            }
            else if(str[i] == "wednesday"){
                System.out.println("wednesday");
            }
            else if(str[i] == "thursday"){
                System.out.println("thursday");
            }
            else if(str[i] == "friday"){
                System.out.println("friday");
            }
        }
        time = System.nanoTime() - time;
        System.out.println("Время для else-if: " + time + " нс");

        System.out.println("------------------------------------------------------------");
        int[] arr = new int[50];
        int[] res = new int[11];

        for(int i = 0; i < 11; i++){
            res[i] = 0;
        }

        for(int i = 0; i < 50; i++){
            arr[i] = (int)(Math.random()*11);
        }

        time = System.nanoTime();
        for(int i = 0; i < 50; i++){

            switch (arr[i]){

                case 0:
                    res[0]++;
                    break;

                case 1:
                    res[1]++;
                    break;

                case 2:
                    res[2]++;
                    break;

                case 3:
                    res[3]++;
                    break;

                case 4:
                    res[4]++;
                    break;

                case 5:
                    res[5]++;
                    break;

                case 6:
                    res[6]++;
                    break;

                case 7:
                    res[7]++;
                    break;

                case 8:
                    res[8]++;
                    break;

                case 9:
                    res[9]++;
                    break;

                case 10:
                    res[10]++;
                    break;
            }
        }
        time = System.nanoTime() - time;
        System.out.println("Время для switch: " + time + " нс");
        System.out.println(Arrays.toString(res));
        System.out.println();

        for(int i = 0; i < 11; i++){
            res[i] = 0;
        }

        time = System.nanoTime();
        for(int i = 0; i < 50; i++){

            if(arr[i] == 0){
                res[0]++;
            }
            else if(arr[i] == 1){
                res[1]++;
            }
            else if(arr[i] == 2){
                res[2]++;
            }
            else if(arr[i] == 3){
                res[3]++;
            }
            else if(arr[i] == 4){
                res[4]++;
            }
            else if(arr[i] == 5){
                res[5]++;
            }
            else if(arr[i] == 6){
                res[6]++;
            }
            else if(arr[i] == 7){
                res[7]++;
            }
            else if(arr[i] == 8){
                res[8]++;
            }
            else if(arr[i] == 9){
                res[9]++;
            }
            else if(arr[i] == 10){
                res[10]++;
            }

        }
        time = System.nanoTime() - time;
        System.out.println("Время для else-if: " + time + " нс");
        System.out.println(Arrays.toString(res));
    }
}
