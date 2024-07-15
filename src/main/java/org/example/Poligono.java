package org.example;

class Poligono {
    int numeroDeLados;
    double tamanhoDoLado;

    public Poligono(int numeroDeLados, double tamanhoDoLado) {
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public double calcularArea() {
        if (numeroDeLados == 3) {
            return (Math.pow(tamanhoDoLado, 2) * Math.sqrt(3)) / 4;
        } else if (numeroDeLados == 4) {
            return Math.pow(tamanhoDoLado, 2);
        }
        return 0;
    }

    @Override
    public String toString() {
        String tipo = (numeroDeLados == 3) ? "Triângulo" : "Quadrado";
        return tipo + " de lado " + tamanhoDoLado + " cm e área " + String.format("%.2f", calcularArea()) + " cm²";
    }
}
