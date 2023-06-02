public class Main {
    public static void main(String[] args)
    {
        double taxRate = .05;
        double priceOfPurchase = 35.17;
        double salesTax = priceOfPurchase * taxRate;
        double totalCost = priceOfPurchase + salesTax;
        totalCost = Math.round(totalCost * 100) / 100.00;
        salesTax = Math.round(salesTax * 100.0) / 100.0;
        System.out.println("The sales tax on your purchase is " + salesTax + " dollars"
        + " and the price of purchase was " + priceOfPurchase + " dollars so the total is " +
                totalCost + " dollars.");
    }
}