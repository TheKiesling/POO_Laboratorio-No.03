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

public class Red {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 01/11/2021

    Controlador de los posts, su objetivo es actuar sobre los posts según el usuario lo desee.
    */

    //---------------------------PROPIEDADES-------------------------
    
    private ArrayList<Post> posts = new ArrayList<Post>();

    //---------------------------MÉTODOS-----------------------------
    public Red(){

    }

    public boolean ingreso(Post post){
        posts.add(post);
        return true;
    }

    public String busqueda(int opcion, String busqueda){
        String posts = "********************************" + "\n";
        if(opcion == 1)
            posts += busquedaFecha(busqueda);
        if(opcion == 2)
            posts += busquedaHashtag(busqueda);
        posts += "********************************";
        return posts;
    }

    private String busquedaFecha(String fecha){
        String posts = "";
        for (int i = 0; i < this.posts.size(); i++)
            if(this.posts.get(i) != null)
                if (this.posts.get(i).getFecha().equals(fecha))
                    posts += "(" + i + ")" +  this.posts.get(i) + "\n";
        return posts;
    }

    private String busquedaHashtag(String hashtag){
        String posts = "";
        for (int i = 0; i < this.posts.size(); i++)
            if(this.posts.get(i) != null)
                for (int j = 0; j < this.posts.get(i).getHashtags().length; j++)
                if (this.posts.get(i).getHashtags()[j].equals(hashtag))
                    posts += "(" + i + ") " +  this.posts.get(i) + "\n";
        return posts;
    }

    public String reproducir(int post){
        String reproductor = "";
        reproductor = posts.get(post).reproducir();
        return reproductor;
    }

    public boolean like(int post){
        posts.get(post).like();
        return true;
    }

    public boolean comentar(int post, String comentario){
        Comentario postComentario = new Comentario("", "", "", "", comentario);
        posts.get(post).comentario(postComentario);
        return true;
    }
}
