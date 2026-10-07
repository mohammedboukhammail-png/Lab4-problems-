
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numPeople = scan.nextInt();
        int[] sales = new int[numPeople];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        int sum = 0;
        int maxSales = sales[0];
        int index = 1;
        int minSales = sales[0];
        int minIndex = 1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            if(sales[i]>maxSales){
                maxSales = sales[i];
                index= i+1 ;
            }
            if(sales[i]<minSales){
                minSales = sales[i];
                minIndex = i+1;
            }
            sum += sales[i];
        }
        System.out.println("Salesman" + index + "has the highest sale" + maxSales);
        System.out.println("Salesman" + minIndex + "has the lowest sale" + minSales);
        System.out.println("\nTotal sales: " + sum);
        double average = (float)sum/sales.length;
        System.out.println("Average sale: " + average);
        System.out.print("Enter a sales value: ");
        int x = scan.nextInt();
        int compteur = 0;
        for(int i=0;i<sales.length;i++){
            if(x<sales[i]){
                compteur++;
                int id = i+1;

            System.out.println("salesman" + id+ "amount" + sales[i]);
            }
        }
        System.out.println("total number of salespeople whose sales exceeded the value entered:" + compteur);
    }
    
}