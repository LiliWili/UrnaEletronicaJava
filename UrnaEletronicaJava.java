import java.util.Scanner;

public class UrnaEletronicaJava {
    private Candidato[] candidatos;
    private int votosNulos;

    public UrnaEletronicaJava() {
        this.candidatos = new Candidato[5];
        this.votosNulos = 0;
        candidatos[0] = new Candidato("Ada Lovelace", 1);
        candidatos[1] = new Candidato("Alan Turing", 2);
        candidatos[2] = new Candidato("Marie Curie", 3);
        candidatos[3] = new Candidato("Albert Einstein", 4);
        candidatos[4] = new Candidato("Ludwig van Beethoven", 5);
    }

    public boolean receberVoto(String numero) {
        if (numero.length()==2) { 
            int num = Integer.parseInt(numero);
            boolean votoValido = false;
            for (Candidato candidato : candidatos) {
                if (candidato.getNumero() == num) {
                    candidato.incrementarVotos();
                    votoValido = true;
                    break;
                }
            }
            if (votoValido==false) {
                votosNulos++;
            }
            return true;
        }
        return false;
    }
    public void apurarResultados() {
        int totalVotosValidos = 0;
        for (Candidato candidato : candidatos) {
            totalVotosValidos += candidato.getVotos();
        }
        System.out.println("\nResultado da Votação:");
        Candidato vencedor = null;
        boolean empate = false;

        for (Candidato candidato : candidatos) {
            int votos = candidato.getVotos();
            double percentual;
            if (totalVotosValidos > 0) {
                percentual = (votos * 100.0) / totalVotosValidos;
            } else {
                percentual = 0;
            }
            System.out.printf("%s: %d votos (%.2f%%)%n", candidato.getNome(), votos, percentual);
            
            if (vencedor == null || votos > vencedor.getVotos()) {
                vencedor = candidato;
                empate = false;
            } else if (votos == vencedor.getVotos()) {
                empate = true;
            }
        }
        System.out.println("Votos Nulos: " + votosNulos);
        if (empate) {
            System.out.println("Houve empate entre os candidatos com maior número de votos.");
        } else if (vencedor != null) {
            System.out.println("Vencedor: " + vencedor.getNome());}
        }
            public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             UrnaEletronicaJava urna = new UrnaEletronicaJava();
                System.out.printf("Bem-vindo à Urna Eletrônica!\nCandidatos: \n01 - Ada Lovelace\n02 - Alan Turing\n03 - Marie Curie\n04 - Albert Einstein\n05 - Ludwig van Beethoven\n");
                int votosRecebidos = 0;
        
            while (votosRecebidos < 10) {
                System.out.print("Digite o número do seu candidato: ");
                String entrada = scanner.nextLine();
                if (urna.receberVoto(entrada)) {
                    votosRecebidos++;
                } else {
                    System.out.println("Entrada inválida. Digite um número com dois dígitos entre 01 e 05.");
                }
            }
            urna.apurarResultados();
            scanner.close();
    }
}