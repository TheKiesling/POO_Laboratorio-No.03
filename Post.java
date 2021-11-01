import java.util.ArrayList;

/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public abstract class Post {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Post.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 31/10/2021

    Clase que tendrá las propiedades de un post y servirá como padre para cada tipo de post
    */ 

    //---------------------------PROPIEDADES-------------------------
    protected String usuario;
    protected String fecha;
    protected String hora;
    protected int likes;
    protected ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
    protected String[] hashtags;
    
    //---------------------------MÉTODOS-----------------------------

    public Post(String usuario, String fecha, String hora, String hashtags){
        //Asignación de atributos
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
        likes = 0;
        comentarios = null;
        this.hashtags = hashtags.split("#");
    }

    public String getFecha(){
        return this.fecha;
    }

    public String[] getHashtags(){
        return this.hashtags;
    }

    public abstract String toString();
}
