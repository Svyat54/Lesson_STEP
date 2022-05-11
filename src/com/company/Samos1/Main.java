package com.company.Samos1;
//Создать класс Товар, имеющей переменные имя, цена, рейтинг
//Создать класс Категория, имеющей переменные имя и массив товаров. Создать несколько объектов класса категория
//Создать класс Баскет, создать массив купленных товаров.
//Создать класс Юсер, содержащий логин, пароль и объект класса баскет. Создать объект класса юсер
public class Main {
    public static void main(String[] args) {
//    Product[] arrToys = new Product[] {new Product("car", 10, 1), new Product("moto", 8, 2)};
//    Product[] arrVegetables = new Product[] {new Product("Tomato",2,1), new Product("potato",1,2)};
//
//    Category cat1 = new Category("Toys", arrToys);
//    Category cat2 = new Category("Vegetables",arrVegetables);
//
//    Product[] basket1 = new Product[]{arrToys[0], arrVegetables[0]};
//    Product[] basket2 = new Product[]{arrToys[1], arrVegetables[1]};
//
//    Basket bask1 = new Basket(basket1);
//    Basket bask2 = new Basket(basket2);
//
//    User Galya = new User("Galya", "qwerty", bask2);
//    User Tolya = new User("Tolya", "12345", bask1);

//    for (var userBye : Galya.getBasket().getArrBuyProduct()) {
//        for (var category1 : category){
//            for (var categoryProduct : category.getArrProduct()){
////                if
//            }
//
//
//        }
//    }
//for (var userProducts : user1.getBasketUser().getBuyProduct()){
//    for (var category : categoryes){
//        for (var categoryProduct : category.getProducts())
//    }
//    }

        int[] arr = new int[]{8, 10, 0, 16, 20, 17};
        Array array = new Array(arr);
        System.out.println(array.Max()+ " " + array.Min()+ " " + array.Avg());
        array.SortAsc();
        array.SortDesc();


    }
}
