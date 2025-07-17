public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public int mostrarTabuada(int num) {
        for (int i = 0; i <= num; i++){
            System.out.println(+i+" x "+num+" = "+i * num);
        }
        return 0;
    }
}
