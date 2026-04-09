package org.example;
import java.util.Scanner; // 1. Importando a classe Scanner

public class Main {

    public static void main(String[] args) {
        //comentário
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        int opcao = 0;
        System.out.println("Seu nome é:" + nome); //Não necessita de for por precisar apenas de um print do nome, e o nome mostrado não é uma variavel e sim um texto apenas
        while (opcao != 3) {
            try {
                System.out.println("========== Escolha as Opções a Baixo: ==========");
                System.out.println("1 - Para Soma \n2 - Para Subtração \n3 - Para Sair");
                opcao = leitor.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = leitor.nextInt();

                        System.out.print("Digite o segundo número: ");
                        numero2 = leitor.nextInt();

                        int soma = numero1 + numero2; //Operador lógico errado

                        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
                        break;
                    case 2:
                        System.out.print("Digite o primeiro número: ");
                        numero1 = leitor.nextInt();

                        System.out.print("Digite o segundo número: ");
                        numero2 = leitor.nextInt();

                        float subtracao = numero1 - numero2; //operador lógico errado /

                        System.out.println("A subtração de " + numero1 + " e " + numero2 + " é: " + subtracao);
                        break;
                    case 3:
                        System.out.println("Saindo.."); //outro for desnecessário
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }

            }catch (Exception e){
                System.out.println("digite apenas números.");
                leitor.nextLine();
            }
        }
        leitor.close();
    }
}