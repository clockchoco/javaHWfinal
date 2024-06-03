import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {
        StockTradingManager manager = new StockTradingManager(100000);
        manager.addTrade("AAPL", 100, 150.0, "BUY");
        manager.addTrade("AAPL", 50, 150.0, "BUY");
        manager.addTrade("AAPL", 200, 155.0, "SELL");
        manager.addTrade("GOOG", 300, 1000.0, "BUY");
        manager.addTrade("AAPL", 150, 149.0, "BUY");
        manager.addTrade("GOOG", 200, 1100.0, "SELL");
        manager.addTrade("AAPL", 100, 155.0, "SELL");
        System.out.println("\n총 지출: " + manager.getTotalSpent());
        System.out.println("총 수익: " + manager.getTotalEarned());
        System.out.println("순이익 또는 손실: " + manager.getNetProfitOrLoss());
        System.out.println("남은 예산: " + manager.getTotalBudget());
        manager.printCurrentHoldings();
        System.out.println("\nAAPL 주식의 거래 기록:");
        manager.printTradeHistory("AAPL");
        System.out.println("\nGOOG 주식의 거래 기록:");
        manager.printTradeHistory("GOOG");
        System.out.println("\nAAPL의 총 거래량: " + manager.getTotalVolume("AAPL"));
        System.out.println("AAPL의 최고 가격: " + manager.getMaxPrice("AAPL"));
        System.out.println("GOOG의 총 거래량: " + manager.getTotalVolume("GOOG"));
        System.out.println("GOOG의 최고 가격: " + manager.getMaxPrice("GOOG"));
        System.out.println("\n총 거래량: " + manager.getTotalMarketVolume());

    }
}
class StockTradingManager {
    ArrayList<Stock> Stocks;
    int budget;
    StockTradingManager(int b) {
        budget = b;
    }
    void addTrade(String stock, int quantity, double price, String action) {

    }
    double getTotalSpent() {

    }
    double getTotalEarned() {

    }
    double getNetProfitOrLoss() {

    }
    double getTotalBudget() {

    }
    void printCurrentHoldings() {

    }
    void printTradeHistory(String stock) {

    }
    int getTotalVolume(String stock) {


    }
    double getMaxPrice(String stock) {

    }
    int getTotalMarketVolume() {

    }
}
class Stock {
    String stocks;
    double maxPrice;
    int totalVolume;
    double totalSpent;
    double totalEarned;
}