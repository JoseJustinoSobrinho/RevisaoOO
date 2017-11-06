
package exemplos;


public class Pessoa {
    private String nome;
    private Integer idade;
    private Character sexo;
    private Double altura;
    private double peso;

    public Pessoa(String nome, Integer idade, Character sexo, Double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

 

    public String getNome() {
        return nome;
    }

   public void setNome(String nome) {  // muito bom esse
        if(!nome.trim().equals("")){
              this.nome = nome;
        }
    }
   

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

        
        
    }
    
   
    
    

