package aula03_exemplo01;


public class Pessoas {
  //atributos
    private String nome,endereco;

    public Pessoas() {
      this.nome = "";
      this.endereco = "";
      
    }

    public Pessoas(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String showInfo(){
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco;
    }
    
    
    
}
            