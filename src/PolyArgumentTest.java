class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); //보너스포인트는 제품가격의 10%
    }
}

class TV extends Product {
    TV() {
        super(100);
    }
    public String toString() {
        return "TV";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() { return "Computer"; }
}
class Buyer {
    int money = 1000; // 소유금액
    int bonusPoint = 0; //보너스점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구매하였습니다.");
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new TV());
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("혅 보너스 점수는 "+ b.bonusPoint + "점입니다.");
    }
}
