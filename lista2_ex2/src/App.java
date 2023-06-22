import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        if(n1 >= 0){
            System.out.println("O numero informado e positivo");
        }
        else{
            System.out.println("O numero informado e negativo");
        }

    }
}
