package com.company;
import java.util.Random;

public class BubbleSort {

    int arrayInt[];

    BubbleSort(int size){
        arrayInt = new int[size];
    }

    void initializeRandomNumbers(){
        Random random = new Random();
        for(int index = 0; index<arrayInt.length; index++){
            arrayInt[index]=random.nextInt(10)+1;
        }
    }

    void sortArray(){
        for(int begin = 0; begin<arrayInt.length-1; begin++){
            if(arrayInt[begin]>arrayInt[begin+1]){
                int tmp = arrayInt[begin];
                arrayInt[begin] = arrayInt[begin+1];
                arrayInt[begin+1] = tmp;
            } else continue;
        }
    }

    void showArray(){
        System.out.println("Array: ");
        for(int index = 0; index<arrayInt.length; index++){
        System.out.println(arrayInt[index]);
        }
    }
}
