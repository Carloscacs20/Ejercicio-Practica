import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Universiad ");
        String Universidad = sc.nextLine();
        System.out.println("Nota1   Nota2  Nota3");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        System.out.println(n1 + "-" + n2 + "-" + n3 );
         

    }
}

// Crea todo con un codigo