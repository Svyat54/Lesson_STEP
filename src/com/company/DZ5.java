 package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class DZ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - done
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = 0;
//        while (f3 <= 10000000) {
//            System.out.printf("Фибоначчи: %d\n", f3);
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;}

        //2 - done
//        int numb;
//        for (int i = 2; i <= 1000; i++){
//            numb = 0;
//            for (int j = 2; j <=i && numb < 2; j++){
//                if (i%j==0){
//                    numb++;}}
//            if (numb<2){
//                System.out.println(i);
//            }}

        //3 - Показать на экране все числа Армстронга в диапазоне от
        //10 до 1 000 000.
        //Например:
        //153 = 13 + 53 + 35
//        int delit = 0;
//        int number = 0;
//        int summ = 0;
//        for (int i = 150; i <= 155; i++){
//            number = i;
//            if (number !=0){
//              delit = number%10; // 0 , 1 ,2 ,3, 4,5
//              summ = summ + delit*delit*delit;
//                System.out.println(summ);
//              number /= 10;}
//            if (summ == i){
//                System.out.println(summ);
//            }
//        }




//        int a, b, c;
//        for (int i = 100; i < 155; i++) {
//            int sum = 0, f = 0;
//            for (a = i; a > 1; a = a / 10) {
//                f++;
//            }
//            c = i;
//            while (c > 1) {
//                b = (int) Math.pow(c % 10, f);
//                sum = sum + b;
//                c = c / 10;
////                System.out.println(sum);
//            }
//            if (sum == i) {
////                System.out.println(i);
//            }
//        }



            //4
//        int a;
//        int b;//1000000;
//        int sum;
//        for (int a = 0; a <= 100; a++) {
//            int sum = 0;
//            for (int b = 1; b <= a/2; b++){
//                if (a % b == 0);{
//                    sum +=b;}
//                if (sum == a){
//            System.out.println(a);
//            }
//            }
//        }

//        int i,j,s;
//        for (i = 0; i <= 1000; i++){
//            s=0;
//            for(j = 1;j <= i/2; j++){
//                if (i % j == 0){
//                    s+=j;}
//                if (s==i){
//                    System.out.println(i);
//                }
//            }
//        }

            //5 - оучить нужно
//        String inputString, reversedString = "";
//               Scanner scannerQ = new Scanner(System.in);
//               int stringLength;
//               System.out.println("Введите число или строку");
//               inputString = sc.nextLine();
//               stringLength = inputString.length();
//               for (int x = stringLength -1; x>=0; x--) {
//                       reversedString = reversedString + inputString.charAt(x);}
//               System.out.println("перевернутое значение: " + reversedString);
//               if(inputString.equals(reversedString))
//                       System.out.println("Введенное значение является палиндромом");
//               else
//                       System.out.println("Введенное значение не является палиндромом");

            //6 - не готово
//        int count = 0;
//        for (int i = 10000000; i < 99999999; ++i)
//        {
//            char[] charArray = Integer.toString(1).toCharArray();
//            Arrays.sort(charArray);
//            for (int j = 0; j < charArray.length-2; ++j)
//            {
//                if (charArray[i] == charArray[i+1])
//                {
//                    break;
//                }
//                if (i % 12345 == 0)
//                {
//                    System.out.println(i);
//                    ++count;
//                }
//            }
//        }
//        System.out.println(String.format("Общее количество найденных чисел %d.", count));

            //7 - done.  Показать битовое представление значения переменной  типа int, используя только один цикл, управляющую переменную, вывод на консоль и битовые операции
//        int number = 17;
//        int module = (int) Math.pow(2, 30);
//        while(module > number) {
//            module>>=1;}
//        System.out.print("Номер " + number + " в битовом представлении: ");
//        while (module > 0) {
//            System.out.print(number/module > 0 ? 1 : 0);
//            number%=module;
//            module>>=1;}

            //8 - done
//        int b = 0;
//        for (int h = 0; h <24; h++){
//            for (int m = 0; m<=59;m++)
//            if (h/10%10==m%10 && h%10==m/10%10){
////                System.out.println(h + " " + m);
//                b++;
//            }
//        }
//        System.out.println("Совпадений - "+b);

            //9 - done
//        int numb = 0;
//        int sum = 0;
//        for (int i = 0; i < 1000;i++){
//            if (i % 3 == 0 || i % 5 == 0){
//                numb = i;
//                sum+=numb;
//            }
//        }
//        System.out.println("Сумма чисел кратна 3 и 5: "+sum);

            //10 - done
//        double numb = 0; // 2520
//        for (int i = 1; i <= 300000000; i++){
//            if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 10 == 0  && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0){
//                numb = i;
//                System.out.println(i); // 232792560
//            }
//
//        }

            //11 - done
//        for (int i = 1; i <= 1000;i++){
//            if (i % 3 == 0 && i % 5 == 0 && i % 15 ==0){
//                System.out.println(i+"-hiss");}
//            else if (i % 3 == 0){
//                System.out.println(i+"-fizz");}
//            else if (i % 5 == 0) {
//                System.out.println(i+"-buzz");}
//            else{System.out.println(i);}
//        }

            //12
//        double x = 10;
//        int y = sc.nextInt();
//        int d = 1;
//        while (true){
//            if (x<y){
//                x=x+(x * 0.1);
//                d+=1;
//            } else {
//                break;}
//        }
//        System.out.println(d);


    }
}
