package ejercicio3.ConversorUnidadesGenerico;

public class Conversor<T extends Number> {
    @SuppressWarnings({"unchecked", "UnnecessaryBoxing"})
    // Método de conversión
    public T convertir(Unidad<T> unidad, String unidadDestino) {
        String unidadOrigen = unidad.getTipoUnidad().toLowerCase();
        double valorNumerico = unidad.getValor().doubleValue(); //Momentaneamente cambiamos a tipo double para hacer las operaciones
        double resultado;

        // Longitud
        if (unidadOrigen.equals("metros") && unidadDestino.equals("pies"))
            resultado = valorNumerico * 3.28084;
        else if (unidadOrigen.equals("pies") && unidadDestino.equals("metros"))
            resultado = valorNumerico / 3.28084;
        else if (unidadOrigen.equals("pies") && unidadDestino.equals("pulgadas"))
            resultado = valorNumerico * 12;
        else if (unidadOrigen.equals("pulgadas") && unidadDestino.equals("pies"))
            resultado = valorNumerico / 12;
        else if (unidadOrigen.equals("metros") && unidadDestino.equals("pulgadas"))
            resultado = valorNumerico * 39.3701;
        else if (unidadOrigen.equals("pulgadas") && unidadDestino.equals("metros"))
            resultado = valorNumerico / 39.3701;

        // Masa
        else if (unidadOrigen.equals("kilogramos") && unidadDestino.equals("libras"))
            resultado = valorNumerico * 2.20462;
        else if (unidadOrigen.equals("libras") && unidadDestino.equals("kilogramos"))
            resultado = valorNumerico / 2.20462;


        // Si no coincide con ninguna regla, devolvemos el mismo valor
        else
            resultado = valorNumerico;
        
        return (T) Double.valueOf(resultado); //Regresamos a tipo <T>
    }

    // Retorna una nueva Unidad<T> con el valor convertido
    public Unidad<T> convertirUnidad(Unidad<T> unidad, String unidadDestino) {
        T valorConvertido = convertir(unidad, unidadDestino);
        return new Unidad<>(valorConvertido, unidadDestino);
    }    

}
