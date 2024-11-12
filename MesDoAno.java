import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) throws Exception {
               Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 12 para saber o mês correspondente: ");
        int numeroMes = scanner.nextInt(); 
        String nomeMes;
        switch (numeroMes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "Número inválido! Insira um valor entre 1 e 12.";
                break;
        }
        System.out.println("O mês correspondente ao número " + numeroMes + " é: " + nomeMes);
        scanner.close();
    }
}
