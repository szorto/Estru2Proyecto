package estru2proyecto;

public class Campo {
    private String nombre, tipo;
    private int longitud;
    boolean llavePrimaria;

    public Campo() {
    }

    public Campo(String nombre, String tipo, int longitud, boolean llavePrimaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.llavePrimaria = llavePrimaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isLlavePrimaria() {
        return llavePrimaria;
    }

    public void setLlavePrimaria(boolean llavePrimaria) {
        this.llavePrimaria = llavePrimaria;
    }
    
    
}
