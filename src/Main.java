public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы класса SalesManager");
        long[] sales = {5, 7, 12, 9, 15, 8, 10};
        SalesManager salesManager = new SalesManager(sales);
        System.out.print("Наибольшее число продаж: ");
        System.out.println(salesManager.max());
        System.out.print("Обрезанное среднее число продаж: ");
        System.out.println(salesManager.middle());
    }
}
