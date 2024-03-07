package figuras;

public class Circunferencia {
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    private double radio;
    private String color;
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public void imprimir() {
        color = "rojo";
        System.out.println("Diámetro: " + (int)(2 * getRadio()));
        System.out.println("Color: " + color);
        System.out.println(2 * Math.PI * getRadio() * getRadio());
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
