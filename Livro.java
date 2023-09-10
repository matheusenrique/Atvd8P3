public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        if(anoPublicacao > 0) {
            System.out.println("Digite um ano válido.");
        }
        else
            this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getAnoPublicacao() {return anoPublicacao;}
       
}
