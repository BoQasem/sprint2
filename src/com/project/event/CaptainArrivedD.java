public class CaptainArrivedD extends Event{ 
    private String driverName;
    private String userName; 

    public CaptainArrivedD(String eventTime) {
        this.eventTime = eventTime;
        //this.driverName = obj.getName();
        //this.userName   = obj.getName();
    }

    @Override
    public void showEvent() {
        System.out.println("\nActions Type: Captain arrived to user destination\n"
                + "Event time: " + this.eventTime + "\n"
                + "Captain's name: " + this.driverName + "\n"
                + "User's name: " + this.userName);
    }

    
}
