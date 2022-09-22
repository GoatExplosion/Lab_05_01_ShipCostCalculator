public class Main {
    public static void main(String[] args)
    {
        double itemCost = 160.99;
        double tax = (itemCost * .02);
        double totalCost = (itemCost + tax);

        if (itemCost <= 100)
        {
            System.out.println("Your item shipping fee is " + tax + " so your total is " + totalCost);
        }
        else
        {
            System.out.println("Your shipping fee is free! Your total is " + itemCost);
        }

    }
}