public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("MobileApp " + appName + " received update: " + stockName + " is now Rs." + stockPrice);
    }
}
