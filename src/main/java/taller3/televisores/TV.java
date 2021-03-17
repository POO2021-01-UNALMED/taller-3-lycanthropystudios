package taller3.televisores;

public class TV {
    public Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    public Control control;
    public static int numTV;
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        this.canal ++;
    }

    public void canalDown(){
        this.canal --;
    }

    public void volumenUp(){
        this.volumen ++;
    }

    public void volumenDown(){
        this.volumen --;
    }

    public boolean getEstado(){
        return this.estado;
    }
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }
    public static int getNumTV() {
        return numTV;
    }
}
