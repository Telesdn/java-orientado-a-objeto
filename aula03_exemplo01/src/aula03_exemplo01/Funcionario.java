package aula03_exemplo01;


public class Funcionario extends Pessoas {
    
    private int matricula;
    private float salario;
    
    public Funcionario(){
        super();
        this.matricula = 0;
        this.salario = 0;
    }

    public Funcionario(int matricula, float salario, String nome, String endereco) {
        super(nome, endereco);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String showInfo(){
        return super.showInfo() + "\nMatrícula: " + this.matricula
                + "\nSalario: " + this.salario;
    }
    

    
}
