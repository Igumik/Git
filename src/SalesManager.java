public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long avg() {
        long total = 0;
        long max = -1;
        long min = 100;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
            if (sale < min) {
                min = sale;
            }
            if (sale > 0) {
                total += sale;
            }
        }
        return (total - max - min) / (sales.length - 2);
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
