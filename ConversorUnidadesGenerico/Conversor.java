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
            resultado = valorNumerico * 12.0;
        else if (unidadOrigen.equals("pulgadas") && unidadDestino.equals("pies"))
            resultado = valorNumerico / 12.0;
        else if (unidadOrigen.equals("metros") && unidadDestino.equals("pulgadas"))
            resultado = valorNumerico * 39.3701;
        else if (unidadOrigen.equals("pulgadas") && unidadDestino.equals("metros"))
            resultado = valorNumerico / 39.3701;

        // Masa
        else if (unidadOrigen.equals("kilogramos") && unidadDestino.equals("libras"))
            resultado = valorNumerico * 2.20462;
        else if (unidadOrigen.equals("libras") && unidadDestino.equals("kilogramos"))
            resultado = valorNumerico / 2.20462;
        else if (unidadOrigen.equals("kilogramos") && unidadDestino.equals("onzas"))
            resultado = valorNumerico * 35.274;        
        else if (unidadOrigen.equals("onzas") && unidadDestino.equals("kilogramos"))
            resultado = valorNumerico / 35.274;
        else if (unidadOrigen.equals("libras") && unidadDestino.equals("onzas"))
            resultado = valorNumerico * 16.0;
        else if (unidadOrigen.equals("onzas") && unidadDestino.equals("libras"))
            resultado = valorNumerico / 16.0;
        
        // Tiempo
        else if (unidadOrigen.equals("segundos") && unidadDestino.equals("minutos"))
            resultado = valorNumerico / 60.0;
        else if (unidadOrigen.equals("minutos") && unidadDestino.equals("segundos"))
            resultado = valorNumerico * 60.0;
        else if (unidadOrigen.equals("segundos") && unidadDestino.equals("horas"))
            resultado = valorNumerico / 3600;
        else if (unidadOrigen.equals("horas") && unidadDestino.equals("segundos"))
            resultado = valorNumerico * 3600;
        else if (unidadOrigen.equals("minutos") && unidadDestino.equals("horas"))
            resultado = valorNumerico / 60.0;
        else if (unidadOrigen.equals("horas") && unidadDestino.equals("minutos"))
            resultado = valorNumerico * 60.0;

        // Temperatura
        else if (unidadOrigen.equals("celsius") && unidadDestino.equals("fahrenheit"))
            resultado = (valorNumerico * 9 / 5) + 32;
        else if (unidadOrigen.equals("fahrenheit") && unidadDestino.equals("celsius"))
            resultado = (valorNumerico - 32) * 5 / 9;
        else if (unidadOrigen.equals("celsius") && unidadDestino.equals("kelvin"))
            resultado = valorNumerico + 273.15;
        else if (unidadOrigen.equals("kelvin") && unidadDestino.equals("celsius"))
            resultado = valorNumerico - 273.15;
        else if (unidadOrigen.equals("fahrenheit") && unidadDestino.equals("kelvin"))
            resultado = ((valorNumerico - 32) * 5 / 9) + 273.15;
        else if (unidadOrigen.equals("kelvin") && unidadDestino.equals("fahrenheit"))
            resultado = ((valorNumerico - 273.15) * 9 / 5) + 32;

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

