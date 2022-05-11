package com.company.Samos1;

public class Basket {
   private Product [] arrBuyProduct;

    public Basket(Product [] arrBuyProduct){
        this.arrBuyProduct = arrBuyProduct;
    }

    public Product[] getArrBuyProduct() {
        return arrBuyProduct;
    }

    public void setArrBuyProduct(Product[] arrBuyProduct) {
        this.arrBuyProduct = arrBuyProduct;
    }


//    public void getInfoBasket(){
//        for(Product prod : arrBuyProduct){
//            prod.getInfoProduct();
//        }
//    }
}
