public class ArticuloCientifico {
    private String titulo;
    private String autor;
    private String[] palabrasClaves;
    private String publicacion;
    private int año;
    private String resumen;

    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String titulo, String autor,String[] palabrasClaves, String publicacion, int año) {
        this(titulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.año = año;
    }

    public ArticuloCientifico(String titulo, String autor,String[] palabrasClaves,String publicacion, int año,String resumen) {
        this(titulo, autor, palabrasClaves, publicacion, año);
        this.resumen = resumen;
    }

    public String imprimir() {
        String texto = "";
        texto += "Título: " + titulo + "\n";
        texto += "Autor: " + autor + "\n";
        if (palabrasClaves != null) {
            texto += "\nPalabras clave:\n";
            for (int i = 0; i < palabrasClaves.length; i++) {
                texto += "- " + palabrasClaves[i] + "\n";
            }
            texto += "\nPublicación: " + publicacion + "\n";
            texto += "Año: " + año + "\n";
        }
        if (resumen != null && !resumen.isEmpty()) {
            texto += "\nResumen:\n" + resumen;
        }
        return texto;
    }
}