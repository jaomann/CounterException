import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scan =  new Scanner(System.in);

        System.out.print("---Counter---\nInforme o primeiro número da contagem:");
        int firstNumber = scan.nextInt();
        System.out.print("Informe o segundo número:");
        int secondNumber = scan.nextInt();
        scan.close();
        try{
            Contar(firstNumber, secondNumber);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O primeiro valor deve ser menor que o segundo!");
        }
    }
    static void Contar(int first, int second) throws ParametrosInvalidosException{
        if(second<first){
            throw new ParametrosInvalidosException();
        }else{
            for(int i = first + 1; i < second; i++){
                System.out.println(i);
            }
        }
    }

}
