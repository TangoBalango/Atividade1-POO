public class Main {
    public static void main(String[] args) {
        
        FitaVideo fita1 = new FitaVideo("O Poderoso Chefão", 5.50);
        FitaVideo fita2 = new FitaVideo("Matrix", 4.75);
        FitaVideo fita3 = new FitaVideo("Clube da Luta", 6.25);

        System.out.println(" Catálogo de Fitas ");
        System.out.println(fita1);
        System.out.println(fita2);
        System.out.println(fita3);

        
        int diasAluguel = 3;
        System.out.println("\n Cálculo de Aluguéis (" + diasAluguel + " dias) ");
        System.out.println("Aluguel de '" + fita1.getTitulo() + "': R$" + fita1.getValorAluguel(diasAluguel));
        System.out.println("Aluguel de '" + fita2.getTitulo() + "': R$" + fita2.getValorAluguel(diasAluguel));
        System.out.println("Aluguel de '" + fita3.getTitulo() + "': R$" + fita3.getValorAluguel(diasAluguel));
    }
}
