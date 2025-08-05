package armazenamento;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;
    public void adiciona(int posicao, Aluno aluno){
        for(int i = totalDeAlunos - 1; i >= posicao; i-=1){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
        //recebe um aluno
    }

    public Aluno pega(int posicao){
        //recebe uma posição e devolve o aluno
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posição invalida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao){
        //remove pela posicao
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < totalDeAlunos; i++){
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        //descobre se o aluno está ou não na lista
        return false;
    }

    public int tamanho(){
        //devolve a quantidade de alunos
        return totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
