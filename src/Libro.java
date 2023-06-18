public class Libro extends Producto {
    private Persona autorLibro;

    public Libro(String nombreAutor, String apellidoAutor, String tituloProducto, float precioProducto) {
        super(tituloProducto, precioProducto);
        autorLibro = new Persona(nombreAutor, apellidoAutor);
    }

    public Persona getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Persona autorLibro) {
        this.autorLibro = autorLibro;
    }

    public void esIgual(Persona p) {
        if (autorLibro.esIgual(p)) {
            System.out.println("Los nombres son iguales.");
        } else {
            System.out.println("Los nombres no son iguales.");
        }
    }

    @Override
    public String toString() {
        return "\nLibro: " + getTituloProducto() +
                "\nLibro ID: " + getProductoId() +
                "\nAutor: " + autorLibro.getNombre() + " " + autorLibro.getApellido() +
                "\nPrecio €: " + getPrecioProducto() +
                "\n__________________________________________";
    }
}
