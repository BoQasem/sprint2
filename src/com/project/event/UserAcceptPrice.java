public class UserAcceptPrice extends Event{ 
    private String userName;

    public UserAcceptPrice(String eventTime) {
        this.eventTime = eventTime;
        //this.userName = obj.getName();
    }

    @Override
    public void showEvent() {
        System.out.println("\nActions Type: User accepts the captain price\n"
                + "Event Time: " + this.eventTime+ "\n"
                + "Ride's Name: " + this.userName);
    }

    
}
