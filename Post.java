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
    protected ArrayList<Comentario> comentarios;
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
        hashtags = recorrerArreglo(this.hashtags);
        this.hashtags = hashtags.split(",");
        comentarios = new ArrayList<Comentario>();
    }

    public String getFecha(){
        return this.fecha;
    }

    public String[] getHashtags(){
        return this.hashtags;
    }

    public String reproducir(){
        return "no se puede reproducir este post";
    }

    public void like(){
        this.likes++;
    }

    public void comentario(Comentario comentario){
        comentarios.add(comentario);
    }

    /****************************************************************
     * recorrerArreglo: recorre un arreglo en busca de elementos repetidos y los concatena solo una vez
     * @param arreglo
     * @return cadena
     */
    private String recorrerArreglo(String[] arreglo){
        String cadena = "";
        if (arreglo.length > 0){
            cadena += arreglo[0]  + ","; 
            for (int i = 1; i < arreglo.length; i++){
                if (arreglo[i].equals(arreglo[i-1])){}
                else 
                    cadena += arreglo[i] + ",";
            }
        }
        return cadena;
    }
    //***************************************************************

    public abstract String toString();
}
