public class Main {
    public static void main(String[] args) {
        int mayor = encontrarMayor(10, 20, 5);
        System.out.println("El número mayor es: " + mayor);
    }

    public static int encontrarMayor(int a, int b, int c) {
        int mayorTemporal = compararDos(a, b); 
        int mayorFinal = compararDos(mayorTemporal, c); 
        return mayorFinal; 
    }

    public static int compararDos(int x, int y) {
        if (x > y) {
            return x; 
        } else {
            return y; 
        }
    }
}