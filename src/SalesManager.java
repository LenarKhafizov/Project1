public class SalesManager {
    protected long[] sales;

    public SalesManager (long[] sales){
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales){
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int middle() {
        int max = sales[0];
        int min = sales[0];
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
        }
        sum = sum - min - max;
        return sum / (sales.length - 2);
    }
}
