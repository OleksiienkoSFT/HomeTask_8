package Lesson_8;

public class Goods {
    String name;
    int price;
    int rating;

    public Goods(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

class Category {
    String nameCategoryGoods;
    Goods [] arrayCategory_Goods;

    public Category(String nameCategoryGoods, Goods[] arrayCategory_Goods) {
        this.nameCategoryGoods = nameCategoryGoods;
        this.arrayCategory_Goods = arrayCategory_Goods;
    }
}
class Basket{
    Goods[] boughtGoods;

    public Basket(Goods[] boughtGoods) {
        this.boughtGoods = boughtGoods;
    }
}
class User {
    String login;
    String password;
    Goods[] goods_In_Basket;

    public User(String login, String password, Goods[] goods_In_Basket) {
        this.login = login;
        this.password = password;
        this.goods_In_Basket = goods_In_Basket;
    }

    public void catalog (User userCatalog){
        for (int i = 0; i < userCatalog.goods_In_Basket.length; i++) {
            System.out.println(userCatalog.goods_In_Basket[i].name + " ");
        }
    }
}
