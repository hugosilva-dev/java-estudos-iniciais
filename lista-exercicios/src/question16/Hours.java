package question16;

import java.util.Scanner;

public class Hours {
    static double tempo;

    public static void main(String[] args) {
        System.out.print("Digite o número em segundos: ");
        leitura();
        imprimirResultado();
    }

    public static void leitura() {
        Scanner leitura = new Scanner(System.in);
        tempo = leitura.nextDouble();
    }

    public static int conversaoEmHoras() {
        return (int) (tempo / 3600);
    }

    public static int conversaoEmMinutos() {
        return (int) ((tempo / 3600 - conversaoEmHoras()) * 60);
    }

    public static int conversaoEmSegundos() {
        return (int) ((((tempo / 3600 - conversaoEmHoras()) * 60) - conversaoEmMinutos()) * 60);
    }

    public static void imprimirResultado() {
        System.out.printf("O tempo foi de %d horas, %d minutos e %d segundos",
                conversaoEmHoras(), conversaoEmMinutos(), conversaoEmSegundos());

    }

}
