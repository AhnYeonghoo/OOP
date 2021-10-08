public class Refresh {

}

interface Bank {

    final int MAX_INTEGER = 10000000;
    //인출메서드
    void withDraw(int price);
    //입금 메서드
    void deposit(int price);

    default String findDormancyAccount(String custId){
        System.out.println("금즁개정법안");
        System.out.println("금융결제원");
        return "00은행 000-000-0000-00";
    }
    static void BCAuth(String bankName) {
        System.out.println(bankName + "에서 블록체인");
    }

}