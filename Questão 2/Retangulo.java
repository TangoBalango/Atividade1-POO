public class Retangulo{
    private double comprimento;
    private double largura;

  public Retangulo (double comprimento, double largura){
    this.comprimento = comprimento;
    this.largura = largura;
}

   public double calcularArea(){
     return comprimento * largura;
}
 public double calcularPerimetro(){
    return (2 * comprimento) + (2 * largura);
 }
 public void ixibirdados() {
    System.out.println("Detalhes do Retângulo:");
    System.out.println("Comprimento: " + comprimento);
    System.out.println("Largura: " + largura);
    System.out.println("Área: " + calcularArea());
    System.out.println("Perímetro: " + calcularPerimetro());
}

}
  
