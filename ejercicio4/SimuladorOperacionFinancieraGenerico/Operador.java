package ejercicio4.SimuladorOperacionFinancieraGenerico;

public class Operador<T extends Number> {

    // Interés simple: IS = Monto * (1 + interes * plazo)
    public double calcularInteresSimple(OperacionFinanciera<T> op) {
        double monto = op.getMonto().doubleValue();
        double interes = op.getTasaInteres().doubleValue();
        int plazo = op.getPlazoDias();

        return monto * (1 + interes * plazo);
    }

    // Interés compuesto: IC = Capital * (1 + interes)^plazo
    public double calcularInteresCompuesto(OperacionFinanciera<T> op) {
        double capital = op.getMonto().doubleValue();
        double interes = op.getTasaInteres().doubleValue();
        int plazo = op.getPlazoDias();

        return capital * Math.pow((1 + interes), plazo);
    }

    // Conversión de moneda
    public double convertirMoneda(double cantidad, String origen, String destino) {
        if (origen.equals("soles") && destino.equals("dolares")) {
            return cantidad / 3.8;
        } else if (origen.equals("soles") && destino.equals("euros")) {
            return cantidad / 4.1;
        } else if (origen.equals("dolares") && destino.equals("soles")) {
            return cantidad * 3.8;
        } else if (origen.equals("dolares") && destino.equals("euros")) {
            return cantidad * 0.92;
        } else if (origen.equals("euros") && destino.equals("soles")) {
            return cantidad * 4.1;
        } else if (origen.equals("euros") && destino.equals("dolares")) {
            return cantidad * 1.09;
        } else {
            return cantidad; // misma moneda
        }
    }
}
