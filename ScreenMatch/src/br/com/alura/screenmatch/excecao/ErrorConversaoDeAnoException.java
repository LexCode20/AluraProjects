package br.com.alura.screenmatch.excecao;

public class ErrorConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErrorConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
