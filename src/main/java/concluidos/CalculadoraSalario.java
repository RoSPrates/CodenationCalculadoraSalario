package concluidos;

public class CalculadoraSalario {

    public long calcularSalarioLiquido(double salarioBase) {
        salarioBase -= calcularInss(salarioBase);
        salarioBase -= calcularIrrf(salarioBase);
        return Math.round(salarioBase);
    }


    //Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
    private double calcularInss(double salarioBase) {
        if(salarioBase > 4000)
            return 0.11 * salarioBase;
        else if(salarioBase > 1500)
            return 0.09 * salarioBase;
        return 0.08 * salarioBase;
    }

    private  double calcularIrrf(double salario){
        if(salario > 6000)
            return 0.15 * salario;
        else if (salario > 3000)
            return (7.5/100) * salario;
        return 0;
    }

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar!
*/