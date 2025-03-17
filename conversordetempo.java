import java.util.Scanner;

public class Exercicioscomesemparametrosfuncoes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de tempo");
        System.out.println("1 Digite a quantidade de minutos: ");
        System.out.println("2 Digite a quantidade de horas:");

        int escolha = scanner.nextInt();

        if(escolha == 1) {
            System.out.println("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();
            int horas = converterMparaH(minutos);
            System.out.println(minutos + " minutos, é o equivalente a " + horas + " horas.");
        }

        else if(escolha == 2) {
            System.out.println("Digite a quantidade de horas: ");
            int horas = scanner.nextInt();
            int minutos = converterHparaM(horas);
            System.out.println(horas + " horas, é o equivalente a " + minutos + " minutos.");  
        }

        else {
            System.out.println("Opção inválida!");
        }
        scanner.close();
    }