package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoDeCandidatos();
    }
    static void selecaoDeCandidatos() {
        //Array candidatos
        String [] candidatos = {"João", "Marcelo", "Maria", "Luiza", "Clara", "Roberto", "José", "Vera", "lais", "Larissa"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidatos " + candidato + " Foi selecionado para a vaga" );
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase= 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGURADANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
