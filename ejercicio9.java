package com.example.ejercicio9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ejercicio9 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ejercicio9.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Cliente micliente = new Cliente(39, "Pepita", "999 666 777", 4000.0);
        Trabajador micurrito = new Trabajador(31, "Horacio", "654 321 098", 1100.5);

        System.out.println("Mi cliente es " + micliente.getNombre() + ", tiene "
                + micliente.getEdad() + " años, su teléfono es el "
                + micliente.getTelefono() + " y su crédito es de "
                + micliente.getCredito() + " Euros.");

        System.out.println("Mi trabajador es " + micurrito.getNombre() + ", tiene "
                + micurrito.getEdad() + " años, su teléfono es el "
                + micurrito.getTelefono() + " y su salario es de "
                + micurrito.getSalario()+ " Euros.");
    }

    public static class Cliente extends Persona {
        private double credito;

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }

        public Cliente(int edad, String nombre, String telefono, double credito) {
            super();
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.credito = credito;

        }
    }

    public static class Trabajador extends Persona {
        private double salario;

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public Trabajador(int edad, String nombre, String telefono, double salario) {
            super();
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.salario = salario;

        }
    }

    public static abstract class Persona {
        int edad;
        String nombre;
        String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public Persona() {
        }
    }

}