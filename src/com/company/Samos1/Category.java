package com.company.Samos1;

public class Category {
    private String name;
    private Product [] arrProduct;

    public Category(String name, Product[] arrProduct){
        this.name = name;
        this.arrProduct = arrProduct;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getArrProduct() {
        return this.arrProduct;
    }

    public void setArrProduct(Product[] arrProduct) {
        this.arrProduct = arrProduct;
    }



//    public void getInfoCategory() {
//        System.out.println(this.name+ " :");
//        for(Product prod : this.arrProduct){
//            prod.getInfoProduct();
//        }
//    }
}
