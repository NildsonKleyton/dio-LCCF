package br.com.dio.lccf;

public class ControleFluxo {

    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }
    //funções
    public static void ifFlecha() {
        // não e uma boa prática
        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Feverei");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Desembro");
                                                    } else{
                                                        System.out.println("Não é um mês valido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ifSemFlecha() {
        // está é a forma correta de usar o if ,else if
        int mes =5;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Feverei");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Desembro");
        }else{
            System.out.println("Não é um mês valido");
        }
    }

    public static void ifFerias() {
        String deFerias = "julho";
        if (deFerias == "julho" || deFerias == "dezembro" || deFerias == "janeiro") {
            System.out.println("Boas Férias");
        }
    }

    public static void ifMenor() {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        //Este tamanho de if deve ser evitado
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário pode receber auxilio.");
        }

        // para o if não ficar muito grande, podemos criar duas variáveis
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        System.out.println("O salarário Mensar e menor que a media Salario? " + salarioBaixo);
        System.out.println("A quante dade de dependentes e menor ou igaul a media de dependentes? " + muitosDependentes);

        // assim fica mais legível e já estaria bom
        if(salarioBaixo && muitosDependentes){
            System.out.println("Funcionário pode receber o auxilio.");
        }

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;
        System.out.println("O Funcionário pode receber o auxilio? " + recebeAuxilio);
        // também poderia ser assim
        // Caso houvesse mas 3 ou 4 deveria ser assim
        if (recebeAuxilio) {
            System.out.println("Funcionário pode receber o auxilio.");
        } else {
            System.out.println("Funcionário não pode receber o auxilio.");
        }
    }

    public static void switchSemana() {
        String dia = "terça";
        switch (dia) {
            case "domingo":
                System.out.println(1);
                break;
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quita":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    public static void switchNumero() {
        int numero = 2;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }

//        if (numero == 1 || numero == 2 || numero == 3){
//            System.out.println("Certo");
//        } else if (numero == 4){
//            System.out.println("Errado");
//        }else if (numero == 5){
//            System.out.println("Talvez");
//        } else{
//            System.out.println("Valor Indefinido");
//        }
    }

    public static void switchFerias() {
        String mes = "dezembro";

        switch (mes){
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Boas Férias");
                break;
            default:
                System.out.println("Este mês não é de Férias");
                break;
        }
    }
}

