package com.company.Stepik;
// циклы
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Stepik2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1 - Пользователь вводит натуральное число. Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.
//        int n = sc.nextInt();
//        int square = 1;
//        while (Math.pow(square,2) <= n){
//            System.out.printf("Корень квадратный числа %d - равен %d \n", square, (int)Math.pow(square,2));
//            square++;
//        }

        // 2 - Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
        // вводим 1 и 3 получаем 6
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int summ = 0;
//        while (a<=b){summ = a+summ;a++;}
//        {
//            System.out.println(summ);
//        }

        // 3 - Вводится 2 целых числа a и b (a <= b). Необходимо вычислить количество всех чисел кратных 3, но не кратных 5 от а до b включительно.
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int summ = 0;
//        while (a <= b)
//        {
//            if ((a % 3 == 0) && (a % 5 != 0)) {
//               summ +=1;
//            } a++;
//                    }
//        System.out.println(summ);

        // 4 - Пользователь с клавиатуры вводит действительные числа до 0. Необходимо вычислить их среднее арифметическое. Гарантируется, что он введёт хотя бы одно ненулевое число.
//        double sum = 0; // сумма введёных чисел
//        double avg = 0; // среднее арифметическое
//        double numberOfNumbers = 0; // подсчёт кол-ва чисел введёных с клавиатуры
//        while(true){
//            System.out.println("ведите число:");
//            double number = Double.valueOf(sc.nextLine()); // записывает в переменную число с клавиатуры
//            numberOfNumbers = numberOfNumbers+1; // если ввели число не 0, Записывает кол-во цифр
//            if(number != 0){
//                sum = sum+number; // 0 + 3, 0 + 2, 0 + 1
//                avg = (sum/numberOfNumbers)*1.00; // 6/3 = 2 *1 = 2
//            }
//            if(number == 0){
//                break;
//            }
//        }
//        System.out.println("Среднее арифметическое чисел: " + avg);

        // 5 - Последовательность состоит из различных натуральных чисел и завершается числом 0. Определите значение максимального элемента в этой последовательности.
//        int a;
//        int max1 = 0;
//        int max2 = 0;
//        while (true){
//            a = sc.nextInt(); //вводим число 2 3 4 5 8 7 4 0
//            if ( a != 0) {  // если а не равно нулю
//                if (a > max1) {  // а > макс1, да
//                    max1 = a; // макс 1 = а
//                    max2 = max1; // записывает значение max 1 в max2
//                } else if (a > max2 && a < max1) { // если а > макс 2 и а < макс 1
//                    max2 = a;} // макс2 = а
//            }
//            else {break;}
//        }
//        System.out.println(max2);

        //6 - Вводятся целые числа a и b. Гарантируется, что a не превосходит b. 1 и 9 выведет - 2.4.6.8
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        while (a<=b){
//        if (a%2==0) {
//            System.out.println(a);
//        }a++;}

        //7 - Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.
//        int a = sc.nextInt();
//        int b = 1;
//        while (b<=a){
//            b++;
//            if (a%b==0){
//                System.out.println(b);
//                break;
//            }
//        }

        //8 - По данному натуральному n вычислите сумму 12+22+...+n2.
//        int a = 3; // Вводим с клавиатуры
//        int b = 1; // числа которые будем возводить в квадрат, по условию начинаем с единицы
//        double summ = 0; // в переменную записываем числа возведённые в степень
//        while (true){
//            if(b<=a){ // проверяем цикл если b меньше или равно а
//            summ += Math.pow(b,2); // то запысываем числа 1, 2, 3 и тд и возводим их в степень 2
//            b++; // повторяем цикл увеличивая на 1, чтоб на 95 строке записывалось новое число
//            }
//           else {
//            break;
//        }}
//        System.out.println(summ);

        //9 -В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
        // По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
//        double x = 10;
//        int y = 20;
//        int d = 1;
//        while (true){
//            if (x<y){
//                x=x+(x * 0.1);
//                d+=1;
//            } else {
//                break;}
//        }
//        System.out.println(d);

        //10 - Дано натуральное число N. Напишите програму, вычисляющую сумму цифр числа N. 1234 = 10
//        int n = 1234;
//        int sum =0;
//        while (n !=0){
//            sum += n % 10;
//            n/=10;}
//        System.out.println(sum);

        //11-Последовательность состоит из натуральных чисел и завершается числом 0.
        // Определите, сколько элементов этой последовательности больше предыдущего элемента. Гарантируется ввод хотя бы двух ненулевых чисел.
        // не готово
//        int prev;
//        int max = 0;
//        int numb = 0;
//        int ansver = 0;
//        while (true) {
//            prev = sc.nextInt(); // вводим число 8 11 21 0
//            if (prev != 0){
//                if (prev > max){
//                    max = prev;
//                    numb = max;
//                    System.out.println(numb);
////                    max = prev;
//            }else if (prev > numb && prev < max){
//                numb = prev;}
//        }
//            if (prev == 0) {
//                break;}
//        }ansver++;
//        System.out.println(numb);
//        System.out.println(ansver);

        //12- Последовательность состоит из различных натуральных чисел и завершается числом 0. Определите значение второго по величине элемента в этой последовательности.
//        int a;
//        int max1 = 0;
//        int max2 = 0;
//        while (true){
//            a = sc.nextInt(); //вводим число 2 3 4 5 8 7 4 0
//            if ( a != 0) {  // если а не равно нулю
//                if (a > max1) {  // а > макс1, да
//                    max2 = max1; // максимум 2 = макс 1
//                    max1 = a; // макс 1 = а
//                } else if (a > max2 && a < max1) { // если а > макс 2 и а < макс 1
//                    max2 = a;} // макс2 = а
//            }
//            else {break;}
//        }
//        System.out.println(max2);

        // Цикл FOR
        // Задание 1 - Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
//        int n = sc.nextInt(); // 3
//        int sum =0;
//        for (int i = 1;i <= n; i++){ // 7 2 9 = 18
//            int a = sc.nextInt();
//            sum += a;
//            if(a==0){
//                break;
//            }
//        }
//        System.out.println(sum);

        // Задание 2 - Пользователь вводит с клавиатуры натуральное число n. Затем вводит n целых чисел. Необходимо найти и вывести на экран количество чётных.
//        int n = sc.nextInt();// 3 7 2 9
//        int count = 0;
//        for (int i = 1; i <= n; i++){
//            int a = sc.nextInt();
//            if (i%2==0){
//                count++;
//            }if (a==0){break;}
//        }
//        System.out.println(count);

        //Задание 3 - Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
//        int a = sc.nextInt();//1
//        int b = sc.nextInt();//3
//        int sum = 0;
//        for(int i = a; i<=b; i++){
//            sum+=i;}
//        System.out.println(sum);//6

        //Задание 4 - Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7.
        // Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется). Во время решения задачи воспользуемся break и continue.
//        int numb = 0;
//        for (int i = sc.nextInt();true; i = sc.nextInt()){ // 1, 2, 17, 27, 14, 37, 45, 12
//            if (i % 7 ==0){
//                break;
//            }if (i % 10 == 7){
//                numb+=i;
//            }
//        }
//        System.out.println(numb);

        // Пример 1
//        int n = sc.nextInt(); // ввести число цикла
//        for (int i = 0; i < n; i++){ // создаём цикл
//            int a = sc.nextInt(); // вводим числа пока не наберём 0
//            if (a == 0){ // если равно 0 выход из цикла
//                System.out.println("YES");
//                break;
//            }
//        }
        // Пример 2
//        int n = sc.nextInt(); // число цикла
//        boolean is_0 = false; // переменная булиан = лож
//        for (int i = 0; i < n; i++){
//            int a = sc.nextInt();
//            if (a == 0){
//                is_0 = true; // если введённое число 0 булеан = правда и выведет Да, если 0 не будет нет
//                break;}}
//        if (is_0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");

        // Задание 5 - Пользователь вводит слова до тех пор, пока не введёт "СТОП". Необходимо выяснить, было ли среди введённых слов слово "Куб".
        // Если да, то выведите "YES", если нет, то  "NO".
        // Привет Я люблю рисовать круги и Куб Это Прикольно) СТОП
//        boolean is_ = false;
//        for (;true;){
//            String s = sc.nextLine();
//            if (s.equals("Куб")) {
//                is_ = true;
//            }if (s.equals("СТОП")){break;}
//        }
//        if (is_)
//            System.out.println("YES");
//        else
//            System.out.println("NO");

        // Задание 5 - Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
        // Необходимо определить и вывести на экран минимальное и максимальное из них.
        // 5 - 6, 10, -7, 13, 4
//        int n = sc.nextInt();
//        int max = 1;
//        int min = 1;
//        for (int i = 1; i <= n; i++){
//            int a = sc.nextInt();
//            if(a > max){
//                max = a;
//            } else if (a < min) {
//                min = a;}
//        }
//        System.out.println(min);
//        System.out.println(max);

        // Задание 6 - Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
        // 5 - 1*2*3*4*5 = 120
//        int n = sc.nextInt();
//        int sum = 1;
//        for (int i =1; i <= n; i++){
//            sum *= i;
//        }System.out.println(sum);

        // Задание 7 - Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
        // Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
//        int n = sc.nextInt(); // число цикла
//        int prois = 1;
//        boolean isZero = false;
//        for (; true; ) {
//            String s = sc.next(); //3,0,2,4 STOP
//            if (s.equals("STOP")) {
//                break;
//            } else {
//                int n = Integer.parseInt(s);
//                if (n != 0) {
//                    prois *= n;
//                    isZero = true;}}}
//        if (!isZero) {
//            System.out.println("Не найдено");
//        } else {
//            System.out.println(prois);}

        // Задание 8 - По данному целому числу a и натуральному n вычислите сумму 1+a+a2+...+an, не используя формулу суммы геометрической прогрессии.
        // Время работы программы должно быть пропорционально n.
//        int a ; //вводится 2,2 = 7 (1+2+4 = 7)
//        int n = 2;
//        int b=1;
//        for (a = 1; a <= n; a++){
//            b =b+a*n;}
//        System.out.println(b);

        //Задание 9 Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
//        int number = 19;
//        int module = (int) Math.pow(2, 30);
//        while(module > number) {
//            module>>=1;}
//        System.out.print("Номер " + number + " в битовом представлении: ");
//        while (module > 0) {
//            System.out.print(number/module > 0 ? 1 : 0);
//            number%=module;
//            module>>=1;}

        // Задание 10 - Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом".
        // Слова-паразиты не считаются нормальными словами. Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите, каким по счёту нормальным словом оно было введено.
        // В противном случае выведите на экран слово "NO".
//        int a = 0;
//        boolean is_ = false;
//        for (;true;){
//            String s = sc.nextLine();  // Привет, эээээ, Я, люблю , рисовать, круги, и , Куб, Это , Прикольно), СТОП
//            a++;
//            System.out.println(a);
//            if (s.equals("Куб")) {
//                is_ = true;
//                }if (s.equals("СТОП")){break;}
//        }
//        if (is_)
//            System.out.println("YES");
//        else
//            System.out.println("NO");

        // Задание 11 - Последовательность состоит из натуральных чисел и завершается числом 0. Всего вводится не более 10000 чисел (не считая завершающего числа 0).
        // Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//        int max = 1;
//        int sum = 0;
//        for (int i = 1; i <= 10000; i++){
//            int a = sc.nextInt();//1,2,4,5,2,5,3,0 = 2
//            if(a > max){
//                max = a;}
//            else if (max==a) {
//                sum++;}
//            else if (a==0) {break;
//            }
//        }
//        System.out.println(sum);
//        System.out.println(max);
    }
}

