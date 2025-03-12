package aula03_exemplo01;
import java.util.Scanner;

public class Aula03_Exemplo01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        /* System.out.println("Nome:");
        String nm = teclado.nextLine();
        System.out.println("Endereço:");
        String end = teclado.nextLine();
        
        Pessoas p1 = new Pessoas(nm, end);
        p1.showInfo();*/
        
        System.out.println("Nome: ");
        String nm = teclado.nextLine();
        
        System.out.println("Endereco: ");
        String nend = teclado.nextLine();
        
        System.out.println("Matricula: ");
        int mat = teclado.nextInt();
        
        System.out.println("Salario: ");
        float sal = teclado.nextFloat();
        
        
        Funcionario f1 = new Funcionario();
        f1.setNome(nm);
        f1.setEndereco(nend);
        f1.setMatricula(mat);
        f1.setSalario(sal);
        System.out.println(f1.showInfo());

        
    }
    
}
