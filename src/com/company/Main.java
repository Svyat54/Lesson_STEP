package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1
//        System.out.println("Fall seven times ");
//        System.out.println("and stand up eight");
//        // Задание 2
//        System.out.println("\"Your time is limited, ");
//        System.out.println("\t so don’t waste it living someone else’s life\"");
//        System.out.println("\t\t\t\t\t\t\t\t\t\t\tSteve Jobs.");
//        //Задание 3
//        Scanner x = new Scanner(System.in);
//                float number1;
//                float number2;
//                System.out.print("Введите первое число: ");
//                number1 = x.nextInt();
//                System.out.print("Введите второе число: ");
//                number2 = x.nextInt();
//                System.out.println("Плюс " + (number1 + number2));
//                System.out.println("Минус " + (number1 - number2));
//                System.out.println("Умножение " + (number1 * number2));
//                System.out.println("Деление " + (number1 / number2));
//        //Задание 4
//        Scanner y = new Scanner(System.in);
//        int numb1;
//        int numb2;
//                        System.out.print("Введите число: ");
//                numb1 = y.nextInt();
//                System.out.print("Введите %: ");
//                numb2 = y.nextInt();
//                System.out.println("Процент от числа "+ numb1 +" = " + (numb1*numb2/100));
//        //Задание 5
//       Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.print("Введите размер стороны квадрата: ");
//        num = sc.nextInt();
//        System.out.println("Площадь равна: "+ Math.pow(num, 2));

        // Самоучитель Java - начало
//        JOptionPane. //- Вывод консоли
//                showMessageDialog(null, "Всем большой привет!"); //- текст на консоли

//        String name;
//        name=JOptionPane.showInputDialog("Добрый день! Как Вас зовут?"); // вывод консоли с запросом ввода имени
//        JOptionPane.showMessageDialog(null, "Приятно познакомиться,\n"+name+"!"); // вывод приветствия

//        String name="Иванов Иван Иванович";
//        int age=60;
//        char category='B';
//        String text="Водитель: "+name;
//        text=text+"\n"+"Возраст: "+age+" лет";
//        text=text+'\n'+"Права категории: "+category;
//        JOptionPane.showMessageDialog(null,text);


//        int Number=321;
//        String NotANumber="123";
//        int ANumber=Integer.parseInt(NotANumber);
//        String title1="Команда Number+NotANumber";
//        String title2="Команда Number+ANumber";
//        int type1=JOptionPane.ERROR_MESSAGE;
//        int type2=JOptionPane.WARNING_MESSAGE;
//        JOptionPane.showMessageDialog(null,Number+NotANumber,title1,type1);
//        JOptionPane.showMessageDialog(null,Number+ANumber,title2,type2);

//
//        int number=Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
//        String text=number%2==0?"четное":"нечетное";
//        JOptionPane.showMessageDialog(null,"Вы ввели "+text+" число!");


//        double x,y; // Числа (числитель и знаменатель):
//        String title="Деление чисел"; // Заголовок окна:
//        String text="Результат деления: "; // Текст сообщения (начальное значение):
//        int type; // Переменная определяет тип сообщения:
//        x=Double.parseDouble(JOptionPane.showInputDialog("Числитель:")); // Считывание числителя:
//        y=Double.parseDouble(JOptionPane.showInputDialog("Знаменатель:")); // Считывание знаменателя:
//// Условный оператор: равен ли нулю знаменатель?
//        if(y!=0){type=JOptionPane.PLAIN_MESSAGE; // Знаменатель не равен нулю
//            text=text+x+"/"+y+"="+x/y;}
//        else{type=JOptionPane.ERROR_MESSAGE; // Знаменатель равен нулю
//            text=text+"деление на ноль!";}
//        JOptionPane.showMessageDialog(null,text,title,type); // Отображение окна с сообщением:

        // Текстовые переменные для считывания ввода пользователя
        // и записи текста, выводимого в диалоговом окне:
//        String text,str;
//        text=JOptionPane.showInputDialog("Введите целое число:"); // Считывание текста (числа), введенного пользователем:
//        if(text==null){System.exit(0);} // Проверка корректности ввода:
//        int num=Integer.parseInt(text); // Определение числа (преобразование текста в число):
//        if(num<0){str="Вы ввели отрицательное число!";} // Вложенные условные операторы:
//        else if(num>100){str="Это очень большое число!";}
//        else if(num>10){str="Число, большее десяти!";}
//        else{str="Число в пределах от 0 до 10!";}
//        JOptionPane.showMessageDialog(null,str); // Отображение диалогового окна:


//        int count,i=1,j=1,s1=0,s2=0; // Граница суммы, индексные переменные и переменные для записи суммы:
//        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы")); // Считывание границы суммы:
//        String text="Сумма натуральных чисел от 1 до "+count+".\n"; // Текстовые переменные:
//        String str1="Оператор while: ";
//        String str2="Оператор do-while: ";
//// Вычисление суммы оператором while:
//        while(i<=count){
//            s1+=i;
//            i++;}
//// Вычисление суммы оператором do-while:
//        do{
//            s2+=j;
//            j++;
//        }while(j<=count);
//        str1+=s1+"\n"; // Уточнение текста для сообщения:
//        str2+=s2;
//        JOptionPane.showMessageDialog(null,text+str1+str2); // Вывод окна сообщения на экран:

//        int count,i,s=0;
//        count=Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы")); // Считывание границы суммы:
//        // Текстовая переменная:
//        String text="Сумма натуральных чисел от 1 до "+count+": ";
//// Вычисление суммы оператором for:
//        for(i=1;i<=count;i++){
//            s+=i;}
//        JOptionPane.showMessageDialog(null,text+s); // Вывод окна сообщения на экран:


//        int n,m; // Размеры массива:
//        String text="Двумерный массив случайных чисел:"; // Текст для отображения в окне:
//        n=Integer.parseInt(JOptionPane.showInputDialog("Строк в массиве:"));
//        m=Integer.parseInt(JOptionPane.showInputDialog("Столбцов в массиве:")); // Считывание размеров массива:
//        int[][] nums=new int[n][m]; // Создание массива:
//        for(int i=0;i<n;i++){
//            text+="\n";
//            for(int j=0;j<m;j++){
//                nums[i][j]=(int)(10*Math.random()); // Заполнение массива случайными числами:
//                text+=nums[i][j]+" ";}}
//        JOptionPane.showMessageDialog(null,text); // Вывод окна сообщения с элементами массива:


//        int size=2+(int)(Math.random()*3);
//        int n; // Переменная для записи количества элементов строке массива:
//        char s='a'; // Начальная буква для заполнения массива:
//        String text="\"Рваный\" символьный массив:"; // Текст для вывода на экран в окне сообщения:
//        char[][] symbs=new char[size][]; // Создание массива - задано количество строк:
//        // Добавление строк в массив:
//        for(int k=0;k<size;k++){
//            n=1+(int)(Math.random()*8); // Случайное число от 1 до 8:
//            symbs[k]=new char[n];} // Создание строки случайной длины:
//        // Заполнение массива буквами:
//        for(int i=0;i<symbs.length;i++){
//            text+="\n| "; // Переход на новую строку и символ вертикальной черты:
//        // Переменная j для разных значений i имеет разные ограничения:
//            for(int j=0;j<symbs[i].length;j++){
//                symbs[i][j]=s; // Заполнение элемента символом:
//                s++; // Следующий символ:
//                text+=symbs[i][j]+" | ";} // Добавление записи в текст:
//        }
//        JOptionPane.showMessageDialog(null,text); // Вывод сообщения на экран:

//        class MyClass{
//            int num;
//            char symb;
//            String text;
//            // Метод класса для отображения сообщения:
//            void showText(){
//                String str="Значения полей объекта:\n"; // Локальная текстовая переменная:
//// Формирование результата (значения локальной переменной):
//                str+="num="+num+"\n";
//                str+="symb="+symb+"\n";
//                str+="text="+text;
//                JOptionPane.showMessageDialog(null,str);} // Метод отображает окно сообщения:
//            // Метод класса для присваивания значений полям:
//            void set(int n,char s,String str){
//                num=n; // Заполнение полей:
//                symb=s;
//                text=str;}}
//// Главный класс программы:
//        public class ClassDemo3{
//            public static void main(String[] args){
//                MyClass obj1=new MyClass(); // Создание объектов:
//                MyClass obj2=new MyClass();
//// Заполнение полей объектов:
//                obj1.set(10,'A',"Всем привет!");
//                obj2.set(200,'b',"Еще раз, привет!");
//                obj1.showText();
//                obj2.showText();} // Отображение окон:

        // Конструкторы
        //Конструктор создается практически так же, как и обычный метод класса, но
        //есть некоторые ограничения.
        //• Имя конструктора совпадает с именем класса.
        //• Конструктор не возвращает результат, а в сигнатуре конструктора не
        //указывается идентификатор типа возвращаемого результата – никакой!
        //• У конструктора могут быть аргументы, которые описываются так же, как
        //и аргументы обычного метода.

        // Описание класса:
//        class MyClass{
//            int num;
//            char symb;
//            String text;
//            // Конструктор класса с тремя аргументами:
//            MyClass(int n,char s,String str){
//                set(n,s,str); // Заполнение полей:
//                showText();} // Отображение сообщения с информацией об объекте:
//            // Метод класса для отображения сообщения:
//            void showText(){
//                String str="Значения полей объекта:\n"; // Локальная текстовая переменная:
//                str+="num="+num+"\n";
//                str+="symb="+symb+"\n";
//                str+="text="+text; // Формирование результата (значения локальной переменной):
//                    // Метод отображает окно сообщения:
//                    JOptionPane.showMessageDialog(null,str);}
//// Метод класса для присваивания значений полям:
//                void set(int n,char s,String str){
//                    num=n;
//                    symb=s;
//                    text=str;}}  // Заполнение полей:
//            // Главный класс программы:
//            public class ClassDemo4{
//                public static void main(String[] args){
//                    MyClass obj=new MyClass(15,'Ы',"Просто текст.");}}// Создание объекта с передачей аргументов конструктору:

        // Перегрузка методов и конструкторов
        // Описание класса:
//        class MyClass{
//            int num;
//            char symb;
//            String text;
//            // Конструктор класса без аргументов:
//            MyClass(){
//                set(); // Заполнение полей:
//                showText();} // Отображение сообщения с информацией об объекте:
//            // Конструктор класса с целочисленным аргументом:
//            MyClass(int n){
//                set(n); // Заполнение полей:
//                showText();} // Отображение сообщения с информацией об объекте:
//            // Конструктор класса с символьным аргументом:
//            MyClass(char s){
//                set(s); // Заполнение полей:
//                showText();} // Отображение сообщения с информацией об объекте:
//            // Конструктор класса с тремя аргументами:
//            MyClass(int n,char s,String str){
//                set(n,s,str); // Заполнение полей:
//                showText();} // Отображение сообщения с информацией об объекте:
//            // Метод класса для отображения сообщения:
//            void showText(){
//                String str="Значения полей объекта:\n"; // Локальная текстовая переменная:
//                str+="num="+num+"\n";
//                str+="symb="+symb+"\n";
//                str+="text="+text; // Формирование результата (значения локальной переменной):
//                JOptionPane.showMessageDialog(null,str);} // Метод отображает окно сообщения:
//            // Метод класса для присваивания значений полям (нет аргументов):
//            void set(){
//                num=0;
//                symb='a';
//                text="Нет аргументов.";} // Заполнение полей:
//            // Метод класса для присваивания значений полям (целочисленный аргумент):
//            void set(int n){
//                num=n;
//                symb='b';
//                text="Целочисленный аргумент.";} // Заполнение полей:
//            // Метод класса для присваивания значений полям (символьный аргумент):
//            void set(char s){
//                num=1;
//                symb=s;
//                text="Символьный аргумент.";} // Заполнение полей:
//            // Метод класса для присваивания значений полям (три аргумента):
//            void set(int n,char s,String str){
//                num=n;
//                symb=s;
//                text=str;}} // Заполнение полей:
//        // Главный класс программы:
//        public class ClassDemo5{
//            public static void main(String[] args){
//                MyClass obj1=new MyClass();
//                MyClass obj2=new MyClass(2);
//                MyClass obj3=new MyClass('Z');
//                MyClass obj4=new MyClass(3,'A',"Три аргумента.");}} // Создание объектов:
//        //В классе MyClass описаны такие варианты конструктора:
//        //• Без аргументов.
//        //• С одним целочисленным аргументом.
//        //• С одним символьным аргументом.
//        //• С тремя аргументами (целочисленный, символьный и текстовый).
//
//
//        //объектная переменная – это не сам объект,а всего лишь ссылка на него.
//        class AssignObj{
//            String text; // Текстовое поле класса:
//            // Конструктор класса (без аргумента):
//            AssignObj(){
//                text="Новый объект!";}
//            // Конструктор класса (с одним аргументом):
//            AssignObj(String str){
//                text=str;}
//            // Метод для отображения текста:
//            void show(){
//                JOptionPane.showMessageDialog(null,text);}}
//        public class AssignObjDemo{
//            public static void main(String[] args){
//                AssignObj objA=new AssignObj();
//                AssignObj objB=new AssignObj("Второй объект!"); // Создание объектов:
//                objA.show();
//                objB.show(); // Отображение текстовых полей объектов:
//                objA=objB; // Присваивание объектов:
//                objA.show(); // Текстовое поле первого объекта:
//                objB.text="Изменен второй объект!"; // Изменение поля второго объекта:
//                objA.show();}} // Текстовое поле первого объекта:

        // Создание копий
//        class MakeObjCopy {
//            String name; // Текстовое поле класса:
//            int number; // Числовое поле класса:e
//            // Конструктор класса (два аргумента):
//            MakeObjCopy(String str, int num) {
//                name = str;
//                number = num;}
//            // Конструктор создания копии:
//            MakeObjCopy(MakeObjCopy obj) {
//                name = obj.name;
//                number = obj.number;}
//            // Метод для создания копии объекта:
//            MakeObjCopy copy() {
//                MakeObjCopy tmp = new MakeObjCopy(name, number); // Создание объекта-копии:
//                return tmp;}// Возвращение результата:
//            // Метод для вывода информации об объекте:
//            void show() {
//                String text = "Поля объекта:\n";
//                text += "name: " + name + "\nnumber: " + number;
//                System.out.println(text); // Вывод на консоль:
//            }}
//        public class MakeObjCopyDemo {
//            public static void main(String[] args) {
//                // Создание объектов:
//                MakeObjCopy objA = new MakeObjCopy("Первый объект", 100);
//                MakeObjCopy objB = new MakeObjCopy(objA);
//                // Отображение информации об объектах:
//                objA.show();
//                objB.show();
//                // Изменение второго объекта:
//                objB.name = "Второй объект";
//                objB.number = 200;
//                // Отображение информации об объектах:
//                objA.show();
//                objB.show();
//                // "Копирование" объектов:
//                objA = objB.copy();
//                // Отображение информации об объекте:
//                objA.show();
//                // Изменение второго объекта:
//                objB.name = "Второй объект изменен!";
//                objB.number = 300;
//                // Отображение информации об объектах:
//                objA.show();
//                objB.show();
//            }
//        }

        //Статические методы
        // Класс со статическим полем и статическим методом:
//        class MyMath{
//            // Статическая константа:
//            final static double PI=3.14159265;
//            // Статический метод для вычисления синуса:
//            static double sin(double x,int n){
//        // Локальные переменные:
//                double s=0,q=x;
//                int i;
//        // Оператор цикла для вычисления ряда Тейлора для синуса:
//                for(i=1;i<=n;i++){
//                    s+=q;
//                    q*=(-1)*x*x/(2*i)/(2*i+1);}
//        // Результат:
//                return s+q;}
//            // Класс с главным методом:
//            class StatMethDemo{
//                public static void main(String[] args){
//            // Текст для отображения в окне сообщения:
//                    String text="Значения ряда Тейлора для синуса.";
//            // Оператор цикла для вычисления синуса (несколько значений):
//                    for(int k=0;k<5;k++){
//                        text+="\nСлагаемых "+(k+1)+": ";
//                        text+="sin(pi/4)="+MyMath.sin(MyMath.PI/4,k);}
//            // Отображение окна сообщения:
//                    JOptionPane.showMessageDialog(null,text);}
//            }
//        }

        //Передача аргументом объекта
//        class MyClass{
//            // Поля класса:
//            int number;
//            char symb;
//            // Конструктор класса:
//            MyClass(int number,char symb){
//            // Для различения полей и аргументов используем
//            // ключевое слово this:
//                this.number=number;
//                this.symb=symb;}
//            // Метод для отображения значений полей объекта:
//            void show(){
//                System.out.println("Поля объекта: "+number+" и "+symb);}}
//        public class ArgsDemo{
//            // Перегруженный статический метод.
//            // Аргумент - объект:
//            static void MakeChange(MyClass obj){
//                // Изменение полей объекта - аргумента метода:
//                obj.number++;
//                obj.symb++;
//                // Текст для отображения:
//                String text="Аргумент-объект: поля "+obj.number+" и "+obj.symb;
//                // Вывод сообщения на консоль:
//                System.out.println(text);}
//            // Перегруженный статический метод.
//            // Аргументы - переменные базовых типов:
//            static void MakeChange(int number,char symb){
//            // Изменение аргументов метода:
//                number++;
//                symb++;
//            // Текст для отображения:
//                String text="Аргументы базовых типов: значения "+number+" и "+symb;
//            // Вывод сообщения на консоль:
//                System.out.println(text);}
//            // Главный метод программы:
//            public static void main(String[] args){
//            // Создание объекта:
//                MyClass obj=new MyClass(1,'a');
//            // Значения полей объекта:
//                obj.show();
//            // Изменение объекта:
//                MakeChange(obj);
//            // Значения полей объекта:
//                obj.show();
//            // Изменение полей объекта:
//                MakeChange(obj.number,obj.symb);
//            // Значения полей объекта:
//                obj.show();}}

        //Использование ссылочного аргумента
//        class MyClass{
//            // Имя объекта (текстовое поле):
//            String name;
//            // Конструктор класса:
//            MyClass(String name){
//                this.name=name;}
//            // Метод для отображения имени объекта:
//            void show(){
//                System.out.println("Объект с именем \""+name+"\".");}
//        }
//        public class MoreArgsDemo{
//            // Статический метод для изменения ссылки на объект:
//            static void ChangeRef(MyClass obj){
//            // Создается локальный объект:
//                MyClass tmp=new MyClass("Локальный Объект");
//            // Ссылка на локальный объект присваивается аргументу метода:
//                obj=tmp;
//            // Проверка имени объекта, на который ссылается аргумент:
//                obj.show();}
//            public static void main(String[] args){
//            // Создание объекта:
//                MyClass obj=new MyClass("Основной Объект");
//            // Проверка имени объекта:
//                obj.show();
//            // Попытка изменить ссылку на объект:
//                ChangeRef(obj);
//            // Проверка результата:
//                obj.show();}}
    }
}
