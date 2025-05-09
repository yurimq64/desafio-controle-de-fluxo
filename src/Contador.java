import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = 0;
        int parametroDois = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
                entradaValida = true;
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, tente novamente");
            }
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        if (parametroUm == parametroDois) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser iguais");
        }

        int quantidade = parametroDois - parametroUm;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}