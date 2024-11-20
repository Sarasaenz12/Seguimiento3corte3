package Filtrado;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Perros {
    private String raza;
    private int edad;

    // Constructor
    public Perros(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    // Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        List<Perros> perros = new ArrayList<>();
        perros.add(new Perros("Dálmata", 7));
        perros.add(new Perros("Pastor Alemán", 10));
        perros.add(new Perros("Perro Salchicha", 3));
        perros.add(new Perros("Cocker", 5));

        // Filtrar perros mayores de 5 años
        List<Perros> perrosMayores = perros.stream()
                .filter(p -> p.getEdad() > 5)
                .collect(Collectors.toList());

        // Imprimir el resultado
        System.out.println("Perros mayores de 5 años: " + perrosMayores);
    }
}
