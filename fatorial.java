import java.util.Scanner;

public class fatorial {
    
    public static void main(String[] args){
        int numero =0, fat=0;  
       
        Scanner scanner = new Scanner (System.in);

     System.out.print("Digite um numero");
     numero = scanner.nextInt();

     for (int i = numero; i>1;i--){
        fat = fat *1;
     }
        
     System.out.print("O fatorial de " + numero + "e" + fat);

     scanner.close();
   
    }
}
