public class Exam {
    public static void main(String[] args) {
        int [] sibal = new int[] {
                89,92,61,76,94,84,77,62,87,58,58,83,78,64,77,77,61,79,66,64,79,32,77,60,72,67,84,56,70
                ,82,62,73,74,71,59,71,74,57,75,84
        };
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int result : sibal) {
            if(result >= 30 && result <= 42) {
                count1++;
            } else if (result >= 43 && result <= 55) {
                count2++;
            } else if( result >= 56 && result <= 68) {
                count3++;
            } else if (result >= 69 && result <=81) {
                count4++;
            } else
                count5++;
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);



    }
}
