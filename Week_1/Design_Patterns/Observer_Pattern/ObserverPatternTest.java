public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket googleStock = new StockMarket("GOOGL");

        Observer mobileApp1 = new MobileApp("Stock Tracker");
        Observer webApp1 = new WebApp("Market Watch");

        googleStock.registerObserver(mobileApp1);
        googleStock.registerObserver(webApp1);

        googleStock.setStockPrice(1345.67);
        googleStock.setStockPrice(1367.89);

        googleStock.deregisterObserver(mobileApp1);
        googleStock.setStockPrice(1400.00);
    }
}
