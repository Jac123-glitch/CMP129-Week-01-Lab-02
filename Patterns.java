

public class Patterns {
    public static void main(String [] args){
    int num_row = 10;
    for (int i = 1; i<= num_row;i++){
        for(int j = 1; j<=i; j++){
            System.out.print("+");
        }
        System.out.println();
    }
    
    System.out.println();
    
    for (int i = num_row; i>=1;i--){
        for(int j = 1; j<=i; j++){
            System.out.print("+");
        }
        System.out.println();
    }



    



}


    
}
