//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String busClase;
        String vidProm;
        String precioM;
        String menosV;
        especie especie1 = new especie();
        especie1.nombre = "Cacatua Blanca";
        especie1.vidaPromedio = 20;
        especie1.claseAnimal = "Ave";
        especie1.precioVenta = 100;
        especie1.cantidadDisponible = 300;
        especie1.cantidadVendida = 0;

        especie especie2 = new especie();
        especie2.nombre = "Boa Constrictor";
        especie2.vidaPromedio = 10;
        especie2.claseAnimal = "Reptil";
        especie2.precioVenta = 300;
        especie2.cantidadDisponible = 300;
        especie2.cantidadVendida = 0;

        especie especie3 = new especie();
        especie3.nombre = "Titi Dorado";
        especie3.vidaPromedio = 5;
        especie3.claseAnimal = "Mamifero";
        especie3.precioVenta = 80;
        especie3.cantidadDisponible = 300;
        especie3.cantidadVendida = 0;

        especie especie4 = new especie();
        especie4.nombre = "Guacamaya roja";
        especie4.vidaPromedio = 25;
        especie4.claseAnimal = "Ave";
        especie4.precioVenta = 130;
        especie4.cantidadDisponible = 300;
        especie4.cantidadVendida = 0;

        void BuscarClase;(String busClase){
            if (busClase == especie1.nombre) {
                especie1.Informacion();
            } else if (busClase == especie2.nombre) {
                especie2.Informacion();
            } else if (busClase == especie3.nombre) {
                especie3.Informacion();
            } else if (busClase == especie4.nombre) {
                especie4.Informacion();
            } else {
                System.out.println("No se dispone esta clase");
            }
        }
        void BuscarVidaPromedio (String vidProm){
            if (vidProm == especie1.vidaPromedio) {
                especie1.Informacion();
            } else if (vidProm == especie2.vidaPromedio) {
                especie2.Informacion();
            } else if (vidProm == especie3.vidaPromedio) {
                especie3.Informacion();
            } else if (vidProm == especie4.vidaPromedio) {
                especie4.Informacion();
            } else {
                System.out.println("No se dispone con este promedio de vida");
            }
        }
        void BuscarPreciom (String precioM){
            if (precioM == especie1.precioVenta) {
                especie1.Informacion();
            } else if (precioM == especie2.precioVenta) {
                especie2.Informacion();
            } else if (precioM == especie3.precioVenta) {
                especie3.Informacion();
            } else if (precioM == especie4.precioVenta) {
                especie4.Informacion();
            } else {
                System.out.println("No se dispone con este precio");
            }
        }
        void BuscarMenosV (String menosV){
            if (menosV == especie1.precioVenta) {
                especie1.Informacion();
            } else if (menosV == especie2.precioVenta) {
                especie2.Informacion();
            } else if (menosV == especie3.precioVenta) {
                especie3.Informacion();
            } else if (menosV == especie4.precioVenta) {
                especie4.Informacion();
            } else {
                System.out.println("No se dispone con este precio");
            }
        }
    }
}