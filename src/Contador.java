import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTADOR:\n");

        System.out.print("Digite o primeiro parâmetro: ");
        int parameterOne = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parameterTwo = scanner.nextInt();

        System.out.println();

        try {
            count(parameterOne,parameterTwo);
            System.out.println("*** Final do Primeiro Teste (Input) ***\n");
            count(1,10);
            System.out.println("*** Final do Segundo Teste ***\n");
            count(11,10);
            System.out.println("*** Final do Terceiro Teste ***\n");

        } catch (InvalidParameterExceptionPersonal exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro !!!");
        }
        scanner.close();
    }

    static void count (int parameterOne, int parameterTwo) throws InvalidParameterExceptionPersonal {
        if (parameterOne > parameterTwo) {
            throw new InvalidParameterExceptionPersonal();
        }
        int counter = parameterTwo - parameterOne;
        for (int i = 1; i <= counter; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
