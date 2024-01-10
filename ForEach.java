public class ForEach {
    public static void main(String[] args) {
        String[] cidades = {"Londrina", "Cambe", "Rolandia"};
        System.out.println("Voce tem "+ cidades.length + " cidades cadastradas");
        for (int c = 0; c < cidades.length; c++) {
            System.out.println("Cidades: "+ cidades[c] + " conferida com sucesso.");
        }
    }
}
