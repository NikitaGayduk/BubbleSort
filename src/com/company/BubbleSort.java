package com.company;
import java.util.Random;

public class BubbleSort {
    int arraySize;
    int arrayInt[] = new int[arraySize];

    BubbleSort(int size){
        arraySize = size;
    }

    void initializeRandomNumbers(){
        Random random = new Random();
        for(int index = 0; index<arraySize; index++){
            arrayInt[index]=random.nextInt(100)+1;
        }
    }

    void showArray(){
        for(int index = 0; index<arraySize; index++){
            System.out.println(arrayInt[index]);
        }
    }
}
