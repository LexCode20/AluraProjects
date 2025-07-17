public class Aluno2 {
    private String nome, nome2, nome3;
    private double nota, nota2, nota3;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome2() {
        return nome2;
    }

    public String getNome3() {
        return nome3;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularMedia(String nome, double nota, String nome2, double nota2, String nome3, double nota3){
        double media = (nota + nota2 + nota3)/3;
        System.out.println("O aluno "+nome+" teve nota: "+nota+"\nO aluno "+nome2+" teve nota: "+nota2+"\nO aluno "+nome3+" teve nota: "+nota3);
        System.out.println("A media dos alunos é: "+media);
    }
}
