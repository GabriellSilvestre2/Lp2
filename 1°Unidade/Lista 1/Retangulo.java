public class Retangulo extends Quadrilatero{

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
