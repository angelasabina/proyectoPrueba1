
public class main{
    public static void main (String [ ] args) {

        rectangulo rectangulo1 = new rectangulo(3,4);
        rectangulo rectangulo2 = new rectangulo(7,8);

        System.out.println("voy a imprimir el rectangulo 1");
        System.out.println("el area del rectangulo 1: " + rectangulo1.area());
        System.out.println("el perimetro del rectangulo 1: " + rectangulo1.perimetro());

        System.out.println("voy a imprimir el rectangulo 2");
        System.out.println("el area del rectangulo 2: " + rectangulo2.area());
        System.out.println("el perimetro del rectangulo 2: " + rectangulo2.perimetro());

    }
}
