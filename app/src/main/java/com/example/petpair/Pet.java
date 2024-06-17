package com.example.petpair;

public class Pet {
    private String name;
    private String tipo;

    public Pet(String name, String tipo) {
        this.name = name;
        this.tipo = tipo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

