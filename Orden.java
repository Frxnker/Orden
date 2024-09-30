public class Orden {
    public static void main(String[] args) {

        System.out.println("Introduce tres números enteros: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());

        if ((a > b) && (a > c)) {
            if ((b > c)) {
                System.out.println("El mayor es: " + a + " el mediano es: " + b + " y el menor es: " + c);
            }
        }
        if ((a < b ) && (a < c)) {
            if ((b > c)) {
                System.out.println("El mayor es: " + b + " el mediano es: " + c + " y el menor es: " + a);
            }
        }
        if ((a < b) && (a < c)) {
            if ((b < c)) {
                System.out.println("El mayor es: " + c + " el mediano es: " + b + " y el menor es: " + a);
            }
        }
    }
}
