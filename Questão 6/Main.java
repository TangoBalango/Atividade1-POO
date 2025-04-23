public class Main {
    public static void main(String[] args) {
        
        Calendario data1 = new Calendario(15, 5, 2020);  
        Calendario data2 = new Calendario(20, 2, 2021);   

        System.out.println("=== DATAS CRIADAS ===");
        
        
        System.out.print("Data 1: ");
        data1.mostrarData();
        data1.anoBissexto();

        
        System.out.print("\nData 2: ");
        data2.mostrarData();
        data2.anoBissexto();
    }
}