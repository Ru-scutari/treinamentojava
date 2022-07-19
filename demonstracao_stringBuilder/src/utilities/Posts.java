package utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

    private String titulo;
    private Date momento;
    private String conteudo;
    private Integer likes;

    private List<Comments> comentarios = new ArrayList<>();

    public Posts (){

    }

    public Posts(String titulo, Date momento, String conteudo, Integer likes) {
        this.titulo = titulo;
        this.momento = momento;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComentarios() {
        return comentarios;
    }

    public void addComment (Comments comentario) {
        comentarios.add(comentario);
    }

    public void removeComment (Comments comentario){
        comentarios.remove(comentario);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários: \n");
        for (Comments c: comentarios){
            sb.append(c.getComentario() + "\n");
        }
        return sb.toString();
    }
}
