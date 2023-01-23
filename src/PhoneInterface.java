public interface PhoneInterface {
    void powerOn();
    void callNumber(String phoneNo);
    void receivedCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
