package com.company.Lesson.Lesson1_10;

public class Lesson5 {
    public static void main(String[] args) {
    // Создание Массива
//        int[] nums = new int[4];
//// устанавливаем значения элементов массива
//        nums[0] = 1; //1
//        nums[1] = 2;//2
//        nums[2] = 4;//3
//        nums[3] = 100;//4
//// получаем значение третьего элемента массива
//        System.out.println(nums[4]);    //Итог 4

        // Длина массива

//        int[] nums = {1, 2, 3, 4, 5};
//        int length = nums.length;
//        System.out.println(length);

        // Многомерные массивы

//        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 }; // Одномерный массив
//
//        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } }; // Многомерный массив
//
//        nums2[1][0]=44;
//        System.out.println(nums2[1][0]);

//        int[][][] nums3 = new int[2][3][4]; // трехмерный массив, не вывел на консоль
//        nums3[2][3][4] = 50;
//        System.out.println(nums3[2][3][4]);

//    }

        //Зубчатый массив

//        int[][] nums = new int[3][];
//        nums[0] = new int[2];
//        nums[1] = new int[3];
//        nums[2] = new int[5];

        // foreach

//        int[] array = new int[] { 1, 2, 3, 4, 5 };
//        for (int i : array){
//
//            System.out.println(i);
//        }
        // или

//        int[] array = new int[] { 1, 2, 3, 4, 5 };
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }


        //Перебор многомерных массивов в цикле:
        //Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки.
        //Подобным образом можно перебрать и трехмерные массивы и наборы с большим количеством размерностей.

//        int[][] nums = new int[][]
//                {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}
//                };
//        for (int i = 0; i < nums.length; i++){
//            for(int j=0; j < nums[i].length; j++){
//
//                System.out.printf("%d ", nums[i][j]);
//            }
//            System.out.println();
//        }

        // Начало урока
//        int [] arr = {9, 7, 6, 10}; // Создание массива
//        int sum = 0;
//        float averageMark;
//        for(int i = 0; i < arr.length; i++)//Вывод массива на экран
//        {
//            sum += arr[i];
//        }
//        averageMark = (float)sum / arr.length;
//        System.out.println(averageMark);

//        int[] arr = {9,7,6,10};
//        int min = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if(min < arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);

//        int[] arr = {9,7,6,10};
//        int min = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i]<arr[0]){
//                min = i;
//            }
//        }
//        System.out.println(min);


    }
}
