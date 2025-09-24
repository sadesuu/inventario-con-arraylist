public class producto {

    private String codigo;
    private String nombre;
    private double precio;
    private categoria.categorias categoria;
    private int stock;


    public producto(String codigo, String nombre, double precio, categoria.categorias categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public categoria.categorias getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "codigo='" + codigo + "', nombre='" + nombre + "', precio=" + precio +
                ", categoria=" + categoria + ", stock=" + stock;
    }
}


