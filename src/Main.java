public class Main {
    public static void main(String[] args) {

        double purchasePrice = 22.99;
        double salesTax = 0;
        double priceWithTax = 0;

        salesTax = purchasePrice * 0.05;
        System.out.println("The sales tax is " + salesTax);
        priceWithTax = purchasePrice + salesTax;
        System.out.println("The total prices with tax is " + priceWithTax);


    }
}