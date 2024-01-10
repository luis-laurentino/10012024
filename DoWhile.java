public class DoWhile {
    public static void main(String[] args) {
        int tempoTotal = 1;
        int minutoContado = 0;
        int segundoContado = 0;

        while (minutoContado <=tempoTotal) {
            try{
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minutos e "+ segundoContado + " segundos.");
                Thread.sleep(1000);
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado++;
                    segundoContado = 0;                   
                }
            } catch (Exception e){
                System.out.println("Ops! Ocorreu o  erro");
            }
        }
        System.out.println("Filme Encerrado.");

    }
}
