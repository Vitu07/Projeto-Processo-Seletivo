package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Marcelo", "Maria", "Luiza", "Clara"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");


        }while (continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Marcelo", "Maria", "Luiza", "Clara"};
        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
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
