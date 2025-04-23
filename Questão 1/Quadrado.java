public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void exibirdados() {
        System.out.println("Dados do quadrado");
        System.out.println("lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("perimetro: " + calcularPerimetro());
    }
    
    
}