import java.util.*;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner scnId = new Scanner(System.in);
        Scanner scnPw = new Scanner(System.in);

        String userId, userPw;
        String sysId = "Admin";
        String sysPw = "Password";

        System.out.println("Digite o ID de Login.");
        userId = scnId.nextLine();

        System.out.println("Digite a senha de acesso");
        userPw = scnPw.nextLine();

        if (userId.equals(sysId) && userPw.equals(sysPw)){
            System.out.println("Bem vindo ao Sistema " + sysId);
        } else {
            System.out.println("Usuario ou senha invalidos.");
        }

        scnId.close();
        scnPw.close();


    }
}
