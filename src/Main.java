public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Landline l1 = new Landline("123");
        Landline l2 = new Landline("456");

        l1.callNumber("456");
        l2.receivedCall("123");
        System.out.println(l2.answerCall());
    }
}