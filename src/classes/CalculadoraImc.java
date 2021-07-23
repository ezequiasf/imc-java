package classes;

public class CalculadoraImc {


    private static double calc (Paciente pessoa)
    {
        return pessoa.getPeso()/Math.pow(pessoa.getAltura(),2);
    }

    public static String diagnostico (Paciente pessoa)
    {
        double resultado = calc(pessoa);

        if (resultado<16){
            return String.format("Seu imc deu %.2f. Baixo peso muito grave.",resultado);
        }else if ((16 <= resultado)&&(resultado < 16.99)){
            return String.format("Seu imc deu %.2f. Baixo peso grave.",resultado);
        }else if ((17 <= resultado)&&(resultado < 18.49)){
            return String.format("Seu imc deu %.2f. Baixo peso.",resultado);
        }else if ((18.5 <= resultado)&&(resultado < 24.99)){
            return String.format("Seu imc deu %.2f. Peso normal.",resultado);
        }else if ((25 <= resultado)&&(resultado < 29.99)){
            return String.format("Seu imc deu %.2f. Sobrepeso.",resultado);
        }
        return String.format("Seu imc deu %.2f. Obesidade Grau I.",resultado);
    }
}
