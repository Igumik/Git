public class Main {
    public static void main(String[] args) {
        SalesManager sale = new SalesManager(new int[] {3, 4, 5, 6, 7});
        System.out.println("Максимальное количество сделок за неделю: " + sale.max());
        System.out.println("Среднее количество сделок за неделю: " + sale.avg());

    }
}
