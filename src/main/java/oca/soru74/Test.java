package oca.soru74;

public class Test {
    void readCard(int cardNo) {
        System.out.println("Reading card");
    }
    void checkCard(int carNo)   {
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {
        Test ex = new Test();
        int carNo = 12344;
        ex.readCard(carNo);
        ex.checkCard(carNo);
    }

    }

