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
    public long middle() {
        long max = sales[0];
        long min = sales[0];
        long sum = 0;
        for (long sale : sales) {
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
