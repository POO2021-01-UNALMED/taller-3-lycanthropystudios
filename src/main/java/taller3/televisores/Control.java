package taller3.televisores;

public class Control {
    TV tv;

    public void turnOn(){
        this.tv.turnOn();
    }
    public void turnOff(){
        this.tv.turnOn();
    }
    public void canalUp(){
        int canal = this.tv.getCanal();
        if (canal >= 0 && canal < 120 && this.tv.getEstado() == true){
            this.tv.canalUp();
        }
    }
    public void canalDown(){
        int canal = this.tv.getCanal();
        if (canal >= 1 && canal <= 120 && this.tv.getEstado() == true){
            this.tv.canalDown();
        }
    }

    public void volumenUp(){
        int vol = this.tv.getVolumen();
        if (vol >= 0 && vol < 7 && this.tv.getEstado() == true){
            this.tv.volumenUp();
        }
    }
    public void volumenDown(){
        int vol = this.tv.getVolumen();
        if (vol >= 1 && vol <= 120 && this.tv.getEstado() == true){
            this.tv.volumenDown();
        }
    }

    public void setCanal(int canal){
        if (canal >= 0 && canal <= 120 && this.tv.getEstado() == true){
            this.tv.setCanal(canal);
        }
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
