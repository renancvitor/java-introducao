import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 3800.6;
        altura = 1.72;
        genero = 'F';
        nome = "Lulinha da Silva";

        System.out.println("O ladrão " + nome + " aos seus " + idade + " anos recusou a quantia de R$ "
                + String.format("%.2f", salario) + " de uma pessoa do sexo " + genero + " com uma altura de "
                + String.format("%.2f", altura) + ".");

        System.out.println("Idade: " + idade);
        System.out.println("Salario:  " + String.format("%.2f", salario));
        System.out.println("Altura:  " + String.format("%.2f", altura));
        System.out.println("Genero:  " + genero);
        System.out.println("Nome:  " + nome);*/



        //Próximo exemplo:

        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Digite uma hora do dia!");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
        sc.close();*/



        //Próximo exemplo:

        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double salario1, salario2;
        int idade;
        char sexo;

        System.out.print("Digite o nome da primeira pessoa:  ");
        nome1 = sc.nextLine();
        System.out.print("Digie o salário da primeira pessoa:  ");
        salario1 = sc.nextDouble();

        System.out.print("Digite o nome da segunda pessoa;  ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Digite o salário da segunda pessoa:  ");
        salario2 = sc.nextDouble();

        System.out.print("Digite uma idade:  ");
        idade = sc.nextInt();
        System.out.print("Digite um sexo (F/M):  ");
        sc.nextLine();
        sexo = sc.next().charAt(0);

        System.out.println();
        System.out.println("Nome da primeira pessoa:  " + nome1);
        System.out.println("Salário da primeira pessoa:  " + String.format("%.2f", salario1));
        System.out.println();
        System.out.println("Nome da segunda pessoa:  " + nome2);
        System.out.println("Salário da segunda pessoa:  " + String.format("%.2f", salario2));
        System.out.println();
        System.out.println("Idade digitada:  " + idade);
        System.out.println("Gênero sexual digitado:  " + sexo);

        sc.close();*/



        //Próximo exemplo:

        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?  ");
        int nums = sc.nextInt();

        double[] vetor = new double[nums];

        for (int i = 0; i < nums; i++) {
            System.out.print("Digite um número:  ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Números digitados:");
        for (int i = 0; i < nums; i++) {
            System.out.println(String.format("%.1f", vetor[i]));
        }

        sc.close();*/



        //Próximo exemplo:

        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter a matriz?  ");
        int linha = sc.nextInt();
        System.out.print("Quantas colunas vai ter a matriz?  ");
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Elemento [" + i + "," + j + "]:  ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz digitada:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0" + matriz[i][j] + "  ");
                }
                else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println();
        }

        sc.close();*/

    }
}
