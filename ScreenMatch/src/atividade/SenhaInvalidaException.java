package atividade;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;

    public SenhaInvalidaException(String messagem) {
        this.mensagem = messagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
