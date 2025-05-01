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
        especie3.cantidadDisponible = 30;
        especie3.cantidadVendida = 0;

        especie especie4 = new especie();
        especie4.nombre = "Guacamaya roja";
        especie4.vidaPromedio = 25;
        especie4.claseAnimal = "Ave";
        especie4.precioVenta = 130;
        especie4.cantidadDisponible = 300;
        especie4.cantidadVendida = 0;

        especie1.Informacion();
        especie2.Informacion();
        especie3.Informacion();
        especie4.Informacion();

        especie1.Vender(30);
        especie2.Vender(50);
        especie3.Vender(40);
        especie4.Vender(30);
    }

}
