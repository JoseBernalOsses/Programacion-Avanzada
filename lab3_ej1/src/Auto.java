public class Auto {
    int auto;
    Estanque estanque = new Estanque();
    int kilometros;

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getAuto() {
        return auto;
    }

    public Auto(int auto) {
        this.auto = auto;
        switch(auto) {
            case 1:
                estanque.setEstanque(40);
                break;
            case 2:
                estanque.setEstanque(20);
                break;
            case 3:
                estanque.setEstanque(60);
                break;
        }

    }

}
