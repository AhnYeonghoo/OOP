class Point1 {
    int x;
    int y;
    String getLocation() {
        return "x :" + x + ", y : " + y;
    }
}

class Point3D extends Point1 {
    int z;

    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Point3D p3d = new Point3D();
        p3d.x = 10; p3d.y = 20; p3d.z = 30;
        System.out.println(p3d.getLocation());

    }
}
