public class Circulo {
    private double raio;
    private static final double PI = 3.141516;

   
    public Circulo(double raio) {
        this.raio = raio;
    }

    
    public double calcularArea() {
        return (PI * raio * raio);
    }

    
    public double calcularPerimetro() {
        return (2 * PI * raio);
    }

   
    public void exibirdados() {
        System.out.println("Dados do Círculo:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    
}