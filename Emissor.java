package notafiscal;

// Classe que herda os atributos de pessoa

public class  Emissor extends Pessoa {

// Método para retorna inscrição estadual e regime tributário

    int inscricaoEstadual;
    int regimeTributario;    

    public int inscricaoEstadual() {
        return inscricaoEstadual;
    }

    public int regimeTributario() {
        return regimeTributario;
    }

}
