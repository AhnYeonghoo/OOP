public class PointTest2 {
    public static void main(String[] args) {
        Point3d p3 = new Point3d();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point2 {
    int x = 10;
    int y = 20;
    Point2(int x, int y) {
        super() // 최상위 조상 클래스의 생성자 Object()를 호출
        this.x = x;
        this.y = y;
    }
}
class Point3d extends Point2 {
    int z;
    Point3d() {
        this(100, 200, 300);
    }
    Point3d(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
}
