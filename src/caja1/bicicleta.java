package caja1;
public class bicicleta {
    private String marca;
    private int tamaño;


    //cionstructor
    public bicicleta(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }


    //ahora los metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

}








