public class especie {
    String nombre;
    int vidaPromedio;
    String claseAnimal;
    int cantidadDisponible;
    int precioVenta;
    int cantidadVendida;

    void Informacion(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Vida Promedio:"+vidaPromedio);
        System.out.println("Clase:"+claseAnimal);
        System.out.println("Cantidad Disponible:"+cantidadDisponible);
        System.out.println("Precio:"+precioVenta);
        System.out.println("");
    }
    void Vender(int cantidadCompra){
        if(cantidadDisponible<cantidadCompra){
            System.out.println("La venta no se puede realizar");
        }else if(cantidadCompra>50){
            System.out.println("La Cantidad maxima es 50 unidades");
        }else{
            cantidadDisponible=cantidadDisponible-cantidadCompra;
            cantidadVendida=cantidadVendida+cantidadCompra;
            System.out.print("Ahora se disponen "+cantidadDisponible);
            System.out.println(" "nombre);
        }
    }
    void Comprar(int cantidadComprar){
        cantidadDisponible=cantidadDisponible+cantidadComprar;
    }
}
