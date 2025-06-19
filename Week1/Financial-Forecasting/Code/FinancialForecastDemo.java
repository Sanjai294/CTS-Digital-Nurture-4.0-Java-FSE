import java.util.ArrayList;
import java.util.List;

public class FinancialForecastDemo {
    public static void main(String[] args) {
        List<Double> revenueData = new ArrayList<>();
        revenueData.add(120.5);
        revenueData.add(130.2);
        revenueData.add(125.0);
        revenueData.add(140.3);
        revenueData.add(150.0);
        revenueData.add(160.5);
        revenueData.add(155.2);

        FinancialForecaster forecaster = new FinancialForecaster(revenueData, 3);
        forecaster.forecastNext(3);
    }
}
