import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de funcionarios que deseja cadastrar: ");
            int qtd = Integer.parseInt(entrada.nextLine());
            ArrayList<Funcionario> funcList = new ArrayList<>(qtd);

            for (int i = 0; i < qtd; i++) {
                String ce;
                System.out.println("Contratado ou Executivo (c ou e)? ");
                ce = entrada.nextLine().trim().toLowerCase();

                while (!ce.equals("c") && !ce.equals("e")) {
                    System.out.println("Contratado ou Executivo (c ou e)? Digite c ou e.");
                    ce = entrada.nextLine().trim().toLowerCase();
                }

                System.out.println("Nome do empregado: ");
                String nomeemp = entrada.nextLine();

                System.out.println("Codigo: ");
                String codigo = entrada.nextLine();

                System.out.println("Salario: ");
                float salario = Float.parseFloat(entrada.nextLine());

                System.out.println("Numero de dependentes: ");
                int dep = Integer.parseInt(entrada.nextLine());

                if (ce.equals("c")) {
                    FuncCntrd funccntrd = new FuncCntrd(nomeemp, codigo, salario, dep);
                    funcList.add(funccntrd);
                } else {
                    System.out.println("Gratificacao: ");
                    float grat = Float.parseFloat(entrada.nextLine());
                    FuncExct funcexct = new FuncExct(nomeemp, codigo, salario, dep, grat);
                    funcList.add(funcexct);
                }
            }

            System.out.println("\n--- Relatorio dos Funcionarios ---\n");
            for (Funcionario f : funcList) {
                System.out.println(f.toString());
                System.out.println("-----------------------------");
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Voce precisa digitar um numero.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}