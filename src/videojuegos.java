public class videojuegos {

    private String titulo;
    private int horas_estimadas;
    private String estado;
    private String genero;
    private String compania;



    public videojuegos() {

    }

    public videojuegos(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    public void verVideoJuegos(videojuegos[] vect ){
        for(int i = 0; i< vect.length; i++){
            System.out.println(vect[i]);

        }
    }
    @Override
    public String toString() {
        return "videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", horas_estimadas=" + horas_estimadas +
                ", estado='" + estado + '\'' +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

}
