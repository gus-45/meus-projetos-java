class Pessoa {
  private String nome;
  private int diaNascimento;
  private int mesNascimento;
  private int anoNascimento;
  private char sexo;
  private int idade;
  
  public Pessoa(){
  }
  
  public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, char sexo) {
    this.nome = nome;
    this.diaNascimento = diaNascimento;
    this.mesNascimento = mesNascimento;
    this.anoNascimento = anoNascimento;
    this.sexo = sexo;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getdiaNascimento() {
    return diaNascimento;
  }
  
  public void setdiaNascimento(int diaNascimento) {
    this.diaNascimento = diaNascimento;
  }
  
  public int getmesNascimento() {
    return mesNascimento;
  }
  
  public void setmesNascimento(int mesNascimento) {
    this.mesNascimento = mesNascimento;
  }
  
  public int getanoNascimento() {
    return anoNascimento;
  }
  
  public void setanoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
  }
  
  public char getSexo() {
    return sexo;
  }
  
  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
    idade = anoAtual - anoNascimento;
      if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
        idade--;
    }
  }    
  
  
  public void exibeDados() {
    System.out.println("Dados da pessoa: ");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}
  