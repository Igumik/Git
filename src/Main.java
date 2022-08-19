public class Main {
    public static void main(String[] args) {
        SalesManager sale = new SalesManager(new int[] {3, 4, 5, 1, 2});
        System.out.println("Максимальное количество сделок за неделю: " + sale.max());

    }
}
