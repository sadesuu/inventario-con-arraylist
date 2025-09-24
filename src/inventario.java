import java.util.ArrayList;
import java.util.List;

public class inventario {
    private ArrayList<producto> productos;

    public inventario(ArrayList<producto> productos) {
        this.productos = productos;
    }
//Complejidad(oN)
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (producto p : productos) {
            builder.append(p.toString()).append("\n");
        }
        return builder.toString();
    }
    //Complejidad(o1)
    public void añadirproducto(producto p) {
        productos.add(p);
    }
    //Complejidad(oN)
    public void actualizarStock(String nombre, int stock) {
        for (producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                p.setStock(stock);
            }
        }
    }
    //Complejidad(oN)
    public void venderproducto(String nombre, int cantidad) {
        for (producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                if (p.getStock() >= cantidad) {
                    p.setStock(p.getStock() - cantidad);
                    System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
                } else {
                    System.out.println("Stock insuficiente para " + nombre);
                }
            } else {
                System.out.println("Producto con nombre " + nombre + " no encontrado.");
            }
        }
    }
    //Complejidad(oN)
    public void buscarProducto(String nombre) {
        for (producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                System.out.println("Producto encontrado: " + nombre);
            } else {
                System.out.println("Producto no encontrado: " + nombre);
            }
        }
    }
    //Complejidad(oN)
    public List<producto> filtrarPorCategoria(categoria.categorias categoria) {
        List<producto> productosFiltrado = new ArrayList<>();
        for (producto p : productos) {
            if (p.getCategoria().equals(categoria)) {
                productosFiltrado.add(p);
            }
        }
        return productosFiltrado;
    }
    //Complejidad(oN)
    public void precioTotal() {
        double total = 0;
        for (producto p : productos) {
            total += p.getPrecio() * p.getStock();
        }
        System.out.println("Precio total del producto: " + total);
    }
    //Complejidad(oN)
    public void tamanoInventariioPorStock() {
        int totalItems = 0;
        for (producto p : productos) {
            totalItems += p.getStock();
        }
        System.out.println("Total de items en el inventario: " + totalItems);
    }
    //Complejidad(oN)
    public void mostrarInventario() {
        System.out.println("Inventario completo: ");
        for (producto p : productos) {
            System.out.println(p.toString());
        }
    }
}

