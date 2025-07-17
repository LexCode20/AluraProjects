public class NumerosPrimos {
    private boolean primo = true;
    public void verificarPrimalidade(int num) {
        if (num <= 1){
            primo = false;
        }else {
            for(int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    primo = false;
                    break;
                }
            }
        }
        if (primo){
            System.out.println("O número: " +num+" é primo!");
        }else {
            System.out.println("O número: "+num+" não é primo.");
        }

    }

    public void listarPrimos(){

    }
}
