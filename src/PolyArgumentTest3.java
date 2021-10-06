import java.util.*;
class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
    Product3() {
        price = 0;
        bonusPoint = 0;
    }
}
class Tv3 extends Product3 {
    Tv3() { super(100); } // 티비의 가격은 100만원
    public String toString () { return "Tv"; }
}
class Computer3 extends Product3 {
    Computer3() { super(200); }
    public String toString() { return "Computer";}
}
class Audio3 extends Product3 {
    Audio3 () { super(50); }
    public String toString() { return "Audio"; }
}
class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 vector 객체

    void buy(Product3 P) {
        if (money < P.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= P.price;
        bonusPoint += P.bonusPoint;
        item.add(P);
        System.out.println(P+ "을/를 구매하였습니다.");
    }

    void refund(Product3 P) {
        if (item.remove(P)) {
            money += P.price;
            bonusPoint -= P.bonusPoint;
            System.out.println(P +"의 환불이 완료되었습니다.");
        } else {
            System.out.println("해당 제품을 구매하신 적이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product3 p = (Product3) item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 = " + sum + "만원입니다.");
        System.out.println("구입하신 물품들은 " + itemList + "입니다.");
    }
}
public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv3 tv = new Tv3();
        Computer3 com = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv); // void buy(Product P)니까 tv 참조변수를 보내면 Product형으로 자동형변환 되어 인스턴스 전달
        b.buy(com); //자손을 조상에게 형변환 할 때는 형변환 자동으로 되기 때문
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();


    }

}

