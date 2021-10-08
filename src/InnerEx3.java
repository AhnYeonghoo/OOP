public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner3 {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner3 {
        static int scv = outerCv; // 스태틱 클래스에선 스태틱 맴버만 허용
    }

    void myMethod3() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
