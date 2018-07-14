package heranca.cenario2;

import java.util.Date;

public class Cliente {
    private String nome;
    private String sobrenome;
    private long cpf;
    private String endereco;
    private Date dataNasc;
    private String email;
    private String telefone;
    private String razaoSocial;
    private String nomeFantasia;

    public boolean isPessoaFisica() {
        return false;
    }
}
