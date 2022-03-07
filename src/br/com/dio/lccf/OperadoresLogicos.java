package br.com.dio.lccf;

public class OperadoresLogicos {
    public static void main(String[] args) {
    // operação logicos
        System.out.println("operação logicos");
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        //comjução (e)
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println();
        //dijução (ou)
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println();
        //dijução exclusiva (xor)  Ele retorna true se ambos os valores forem diferentes
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));
        System.out.println();
        //negação
        System.out.println(!b1);
        System.out.println(!b4);

    // operação Aritimetico e logico
        System.out.println("Operação Aritimetico e Logico");
        int i1 = 10;
        int i2 = 5;
        float f1 = 20F;
        float f2 = 50F;
        //
        System.out.println("((i1 + i2) < (f2 + f1)) && true: " + (((i1 + i2) < (f2 + f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1)));

    // Boas práticas - criar variável intermediaria para facilitar o entendimento.

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        // redução para melhor entendimento
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        System.out.println((salarioBaixo) && (muitosDependentes));

        // redução para melhor entendimento
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebe auxilio? "+recebeAuxilio);

    }
}
