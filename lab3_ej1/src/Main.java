import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arriendo = 1;
        Random km = new Random(System.currentTimeMillis());
        Random car = new Random(System.currentTimeMillis());
        ArrayList<Auto> Autos = new ArrayList<Auto>();
        ArrayList<Espacio> Puesto = new ArrayList<Espacio>();
        for (int i = 0; i < 11; i = i + 1) {
            Autos.add(new Auto(car.nextInt(3) + 1));
            Autos.get((i)).setKilometros(km.nextInt(2001));
            Puesto.add(new Espacio(1));
        }
        while (arriendo != 0) {
            System.out.println(">>>BIENVENIDO A HERTZ CARS<<<");
            System.out.println("¿Desea arrendar? si/no");
            Scanner arrendarscan = new Scanner(System.in);
            String arrendar;
            arrendar = arrendarscan.nextLine();
            if (arrendar.equals("si")) {
                Random puesto = new Random(System.currentTimeMillis());
                int intpuesto = puesto.nextInt(10);
                if (Puesto.get(intpuesto + 1).getEspacio() == 1) {
                    Puesto.get(intpuesto + 1).setEspacio(0);
                    switch (Autos.get(intpuesto + 1).getAuto()) {
                        case 1:
                            System.out.println("Usted ha arrendado un automóvil marca : Peugeot 207, con capacidad de combustible de: " + Autos.get(intpuesto + 1).estanque.getEstanque() + " con " + Autos.get(intpuesto + 1).getKilometros() + " kilometraje , por favor al término de su jornada estacionar/devolver el automóvil en el lugar " + (intpuesto + 1) + ".");
                            break;
                        case 2:
                            System.out.println("Usted ha arrendado un automóvil marca : Mazda 2, con capacidad de combustible de: " + Autos.get(intpuesto + 1).estanque.getEstanque() + " con " + Autos.get(intpuesto + 1).getKilometros() + " kilometraje , por favor al término de su jornada estacionar/devolver el automóvil en el lugar " + (intpuesto + 1) + ".");
                            break;
                        case 3:
                            System.out.println("Usted ha arrendado un automóvil marca : Jeep Full, con capacidad de combustible de: " + Autos.get(intpuesto + 1).estanque.getEstanque() + " con " + Autos.get(intpuesto + 1).getKilometros() + " kilometraje , por favor al término de su jornada estacionar/devolver el automóvil en el lugar " + (intpuesto + 1) + ".");
                            break;
                    }
                }
            }
        }
    }
}