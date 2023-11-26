package question17;

import java.util.Scanner;

public class Romanos {

    static String numero;
    static String[] charSequence = new String[4];

    public static void main(String[] args) {
        System.out.println("Digite um número decimal de até 03 dígitos: ");
        numero = new Scanner(System.in).nextLine();

        validacao();
        pointID();
        imprimirResultado();

    }

    public static void validacao() {
        if (numero.length() != 4) throw new NumberFormatException("numero inválido");
        else if (!numero.contains(",")) throw new NumberFormatException("numero inválido");
        else if ((numero.indexOf(",", 1) != 1) && numero.indexOf(",", 2) != 2)
            throw new NumberFormatException("numero inválido");
        else if ((numero.indexOf(",", 1) == 1) && numero.indexOf(",", 2) == 2)
            throw new NumberFormatException("numero inválido");
    }

    public static void pointID() {
        for (int i = 0; i < charSequence.length; i++) {
            charSequence[i] = numero.substring(i, i+1);
        }
        if (charSequence[1].contains(",")) {
            conversaoUnidade(0);
            conversaoDezena(2);
            conversaoUnidade(3);
        } else if (charSequence[2].contains(",")) {
            conversaoDezena(0);
            conversaoUnidade(1);
            conversaoUnidade(3);
        }
    }

    public static String conversaoUnidade(int i) {
        return switch (charSequence[i]) {
            case "0" -> charSequence[i] = "0";
            case "1" -> charSequence[i] = "I";
            case "2" -> charSequence[i] = "II";
            case "3" -> charSequence[i] = "III";
            case "4" -> charSequence[i] = "IV";
            case "5" -> charSequence[i] = "V";
            case "6" -> charSequence[i] = "VI";
            case "7" -> charSequence[i] = "VII";
            case "8" -> charSequence[i] = "VIII";
            case "9" -> charSequence[i] = "IX";
            default -> charSequence[i] = "caractere inválido";
        };
    }

    public static String conversaoDezena(int i) {
        return switch (charSequence[i]) {
            case "0" -> charSequence[i] = "0";
            case "1" -> charSequence[i] = "X";
            case "2" -> charSequence[i] = "XX";
            case "3" -> charSequence[i] = "XXX";
            case "4" -> charSequence[i] = "XL";
            case "5" -> charSequence[i] = "L";
            case "6" -> charSequence[i] = "LX";
            case "7" -> charSequence[i] = "LXX";
            case "8" -> charSequence[i] = "LXXX";
            case "9" -> charSequence[i] = "XC";
            default -> charSequence[i] = "caractere inválido";
        };
    }

    public static void imprimirResultado() {
        System.out.println("O número decimal convertido em algarismos romanos é:");
        System.out.println
                (charSequence[0]+charSequence[1]+charSequence[2]+charSequence[3]);
    }
}
