import java.util.*;

public class IfElse1 {
    public static void main(String[] args) {
        Boolean sair = false;
        Scanner scnPalavra = new Scanner(System.in);
        String texto = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String palavra;
        int posicaoPalavra;
        Boolean sairLoop = false;
        while (sair == false) {
            System.out.println(texto);
            System.out.println("Digite uma palavra a ser pesquisada no texto acima e confirme com 'Enter'");
            palavra = scnPalavra.nextLine();
            posicaoPalavra = texto.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println(
                        "A palavra " + palavra + " foi encontrada na posição " + posicaoPalavra + " no texto acima.");
            } else {
                System.out.println("Ops! Palavra não encontrada.");
            }

            while (sairLoop != true) {
                System.out.println("Digite 'C' para continuar ou 'S' para sair, depois tecle enter");
                if (scnPalavra.nextLine().equals("S")) {
                    sair = true;
                }
                if (scnPalavra.nextLine().equals("")) {
                    System.out.println("Opção Invalida.");
                }
            }

            scnPalavra.close();

        }

    }
}
