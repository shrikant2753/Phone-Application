public class Landline implements PhoneInterface {

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isPowerOn = true;
        this.isRinging = false;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if (isPowerOn==true){
            System.out.println("you are dialing a no "+phoneNo);
        }
        else
            System.out.println("your Landline is off");
    }

    @Override
    public void receivedCall(String phoneNo) {
        if(isPowerOn && this.myPhoneNo.equals(phoneNo)){
            isRinging = true;
            System.out.println("hey, "+phoneNo+" your receiving a call");
        }
        else
            System.out.println("Call not received");
    }

    @Override
    public boolean answerCall() {
        if(this.isRinging){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
