import java.util.List;

public class FinancialForecaster {

    private final List<Double> pastRevenue;
    private final int windowSize;

    public FinancialForecaster(List<Double> pastRevenue, int windowSize) {
        this.pastRevenue = pastRevenue;
        this.windowSize = windowSize;
    }

    public double calculateMovingAverage(int startIndex) {
        double sum = 0;
        for (int i = startIndex; i < startIndex + windowSize; i++) {
            sum += pastRevenue.get(i);
        }
        return sum / windowSize;
    }

    public void forecastNext(int months) {
        System.out.println("Past Revenue: " + pastRevenue);
        for (int i = 0; i < months; i++) {
            int start = pastRevenue.size() - windowSize;
            double forecast = calculateMovingAverage(start);
            System.out.printf("Forecast Month %d: ₹%.2fK%n", pastRevenue.size() + 1, forecast);
            pastRevenue.add(forecast);  // Add for next forecast calculation
        }
    }
}
