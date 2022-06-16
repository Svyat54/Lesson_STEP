package com.company.Stepik.OOP;
import java.util.*;

public class Stepik9Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Hashif (str.equalsIgnoreCase(secret))Map<String, String> human = new HashMap<String, String>();
//        human.put("name", "Wlad");
//        human.put("secondName", "Kowalew");
//        human.put("age", "25");
//        human.put("proffesion", "teacher");
//
//        System.out.println("-----------------------------");
//        System.out.println("Size: " + human.size());
//        System.out.println(human.isEmpty() ? "empty" : "not empty");
//        System.out.println(human.getOrDefault("age", "None"));
//        System.out.println(human.getOrDefault("Rge", "None"));
//        System.out.println("-----------------------------");
//
//        for (String key: human.keySet()){
//            System.out.println(key + ": " + human.get(key));
//        }
//        human.remove("name");
//        System.out.println("-----------------------------");
//        for (String key: human.keySet()){
//            System.out.println(key + ": " + human.get(key));
//        }

        //Task1
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        ArrayList<String> number = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            number.add(String.valueOf(i));
//        }
//        for (int i = 0; i < k; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            number.add(y, String.valueOf(x));
//        }
//        System.out.println(String.join(" ",number));

        //Task2 - Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
        //Для слова из словаря, записанного в последней строке, определите его синоним.
        //Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.
//        int n = sc.nextInt();
//        HashMap<String, String> hash = new HashMap<String, String >();
//        for (int i = 0 ; i < n; i++){
//            String w1 = sc.next();
//            String w2 = sc.next();
//            hash.put(w1,w2);
//            hash.put(w2,w1);
//        }
//        String str = sc.next();
//        System.out.println(hash.get(str));

        //Task3 - Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего.
        // Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
//        int n = sc.nextInt();
//        int count = 0;
//        String maxWord = "";
//        HashMap<String, Integer> hash = new HashMap<String, Integer>();
//        for (int i = 0; i < n; i++){
//            String s = sc.next();
//            if (hash.containsKey(s)){
//                hash.put(s, hash.get(s) + 1); // если значение переменной s повторяется счётчик плюсует один
//            }else{
//                hash.put(s, 1); // счётчик считает слова, если посторяется не считает
//            }
//        }
//        for (String key: hash.keySet()){
//            if(hash.get(key) > count){
//                count = hash.get(key);
//                maxWord = key;
//            }
//        }
//        System.out.println(maxWord);
        //решение через Stream
//        System.out.println(Stream.generate(sc::next).limit(sc.nextInt())//считываем значения в стрим
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))//группируем по частоте слов и помещаем в Map
//                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());//из полученного Map стримом вытаскиваем максимальное значение и берем его ключ

        //Task4 - Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия. Определите, сотрудников какой профессии больше всего.
        // Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились.
        // Гарантируется, что будет введено не более 100 сотрудников.
//        int n = sc.nextInt();
//        int count = 0;
//        String maxWord = "";
//        String name = "";
//        HashMap<String, Integer> hashkey = new HashMap<String, Integer>();
//        HashMap<String,String> hashvalue = new HashMap<String, String>();
//        HashSet<String> hashname = new HashSet<String>();
////        if (n < 100) {
//            for (int i = 0; i < 3; i++) {
//                String w1 = sc.next();
//                String w2 = sc.next();
////                hashvalue.put(w2, w1);
//                hashvalue.put(w1, w2);
//                if (hashkey.containsKey(w2)) {
//                    hashkey.put(w2, hashkey.get(w2) + 1); // если значение переменной s повторяется счётчик плюсует один
//                } else {
//                    hashkey.put(w2, 1); // счётчик считает слова, если посторяется не считает
//                }
//            }
//        }else if(n > 100){
//            return;
//        }
//        for (String key : hashkey.keySet()) {
//            if (hashkey.get(key) > count) {
//                count = hashkey.get(key);
//                maxWord = key;
//            }
//        }
//        System.out.println(count);
//        System.out.println(maxWord);



//        hashname.add(hashvalue.get(maxWord));
//        for (String name1 : hashname){
//            System.out.println(name1 + " name");
//        }
//        name = hashvalue.get(maxWord);
//        hashname.add(name);
//        System.out.println(hashname);
//
//        System.out.println(hashvalue.get(maxWord));
//
//        for (Map.Entry<String, String> item : hashvalue.entrySet()){
//            System.out.println(item.getValue());
//        }


//        for (String value : hashvalue.values()){
//            if(hashkey.get(key))
//        }
//        System.out.println(count);
//        System.out.println(maxWord);
//        System.out.println(hashvalue.getOrDefault(maxWord, hashvalue.get(maxWord)));
//        for (String value : hashvalue.values()){
//            if (hashvalue.containsKey(maxWord)){
//                System.out.println(hashvalue.getOrDefault(maxWord, value));
//            }
//        }
//        Collection<String> value = hashvalue.values();
//        System.out.println(value);





        //Task5 - Вводится число n, затем n целых чисел. Определите, сколько различных чисел было введено.
//        int n = sc.nextInt();
//        HashSet<Integer> hash = new HashSet<Integer>(n);
//        for (int i = 0; i < n; i++){
//            int numb = sc.nextInt();
//            hash.add(numb);
//        }
//        System.out.println(hash.size());

        //Task6 - Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке), если это число ранее встречалось в последовательности или NO,  если не встречалось.
//        int n = sc.nextInt();
//        HashSet<Integer> hash = new HashSet<Integer>(n);
//        for (int i = 0; i < n; i++){
//            int numb = sc.nextInt();
//            if(hash.add(numb)){
//                System.out.println("NO");
//            }else{
//                System.out.println("YES");
//            }
//        }


    }
}
