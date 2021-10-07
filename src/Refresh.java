public class Refresh {
    public static void func(People people) {
        people.printInfo();
        if(people instanceof Man)
            ((Man)people).enlist();
        if(people instanceof Woman)
            ((Woman)people).makeUp();
    }
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        func(man);
        System.out.println();
        func(woman);
    }
}

class People {
    public void printInfo() {
        System.out.println("나는 사람입니다.");}
}

class Woman extends People {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("그리고 여자입니다.");
    }
    public void makeUp() {
        System.out.println("화장");
    }
}
class Man extends People {
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("그리고 남자입니다.");
    }
    public void enlist() {
        System.out.println("내일 군대를 갑니다.");
    }
}

