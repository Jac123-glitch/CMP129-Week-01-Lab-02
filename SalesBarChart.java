
import java.util.Scanner;

public class SalesBarChart {
public static void main (String [] args){
Scanner keyboard = new Scanner(System.in);
int num_stores = 5;
int num_asterisk=0;
int [] sales = new int[num_stores];
for(int i = 0; i < num_stores; i++){
    System.out.print("Enter today's sales for stores "+(i+1)+": ");
    sales [i] = keyboard.nextInt();
    num_asterisk = sales[i]/100;
}
    System.out.println("\nSales Bar Chart");
    System.out.println("(Each * = $ 100)");


for(int i = 0; i < num_stores; i++){
    System.out.print("Stores "+(i+1)+": ");
     
}
for(int j = 0; j < num_asterisk; j++){ 
    System.out.println("*");
}













}



}

    

