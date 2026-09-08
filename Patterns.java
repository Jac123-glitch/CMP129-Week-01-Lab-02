

public class Patterns {
    public static void main(String [] args){
    int num_row = 10;
    //Pattern A that increase plus sign 
    for (int i = 1; i<= num_row;i++){
        for(int j = 1; j<=i; j++){
            System.out.print("+");
        }
        System.out.println();
    }
    
    System.out.println();
    // Pattern B decreasing plus sign
    for (int i = num_row; i>=1;i--){
        for(int j = 1; j<=i; j++){
            System.out.print("+");
        }
        System.out.println();
    }



    



}


    
}
