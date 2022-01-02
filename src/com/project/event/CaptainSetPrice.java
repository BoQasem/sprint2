public class CaptainSetPrice extends Event{ 
    private double price;
    private String driverName;

    public CaptainSetPrice(String eventTime, double price) {
        this.eventTime = eventTime;
        this.price = price;
        //this.driverName = obj.getName();
    }

    @Override
    public void showEvent() {
        System.out.println("\nActions Type: Captain set a price for ride\n"
                + "Event Time: " + this.eventTime + "\n"
                + "Captain's Name: " + this.driverName
                + "\nPrice: " + this.price);
    }

    
}
