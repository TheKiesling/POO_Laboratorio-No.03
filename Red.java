/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.ArrayList;

public class Red {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Controlador de los posts, su objetivo es actuar sobre los posts según el usuario lo desee.
    */

    //---------------------------PROPIEDADES-------------------------
    
    private ArrayList<Post> posts = new ArrayList<Post>();

    //---------------------------MÉTODOS-----------------------------

    /****************************************************************
     * ingreso: añade un post al ArrayList de posts
     * @param post
     * @return
     */
    public boolean ingreso(Post post){
        posts.add(post);
        return true;
    }
    //***************************************************************

    /****************************************************************
     * busqueda: controla la busqueda que se va a hacer y la muestra
     * @param opcion
     * @param busqueda
     * @return
     */
    public String busqueda(int opcion, String busqueda) throws Exception{
        String posts = "********************************" + "\n";
        if(opcion == 1)
            posts += busquedaFecha(busqueda);
        if(opcion == 2)
            posts += busquedaHashtag(busqueda);
        posts += "********************************";
        return posts;
    }
    //***************************************************************

    /****************************************************************
     * busquedaFecha: busca los posts que hayan sido publicados la fecha que pidió el usuario
     * @param fecha
     * @return
     * @throws Exception
     */
    private String busquedaFecha(String fecha) throws Exception{
        String posts = "";
        try{
            for (int i = 0; i < this.posts.size(); i++)
                if(this.posts.get(i) != null)
                    if (this.posts.get(i).getFecha().equals(fecha))
                        posts += "(" + i + ")" +  this.posts.get(i) + "\n";
        } catch(Exception e){
            String s = "ERROR- Tiene que ingresar un número de post valido- red.busquedaFecha" + ": " + e.toString();
            throw new Exception(s);
        }
        return posts;
    }
    //****************************************************************

    /*****************************************************************
     * busquedaHashtag: busca los posts que tengan el hashtag que haya pedido el usuario
     * @param hashtag
     * @return
     * @throws Exception
     */
    private String busquedaHashtag(String hashtag) throws Exception{
        String posts = "";
        try{
            for (int i = 0; i < this.posts.size(); i++)
                if(this.posts.get(i) != null)
                    for (int j = 0; j < this.posts.get(i).getHashtags().length; j++)
                    if (this.posts.get(i).getHashtags()[j].equals(hashtag))
                        posts += "(" + i + ") " +  this.posts.get(i) + "\n";
        } catch(Exception e){
            String s = "ERROR- Tiene que ingresar un número de post valido- red.busquedaFecha" + ": " + e.toString();
            throw new Exception(s);
        }
        return posts;
    }
    //****************************************************************

    /*****************************************************************
     * reproducir: reproduce el post que ha indicado el usuario
     * @param post
     * @return
     * @throws Exception
     */
    public String reproducir(int post) throws Exception{
        String reproductor = "";
        try{
            reproductor = posts.get(post).reproducir();
        } catch(Exception e){
            String s = "ERROR- Tiene que ingresar un número de post valido- red.reproducir" + ": " + e.toString();
            throw new Exception(s);
        }
        return reproductor;
    }
    //****************************************************************

    /*****************************************************************
     * like: le da like al post que quiere el usuario
     * @param post
     * @return
     * @throws Exception
     */
    public boolean like(int post) throws Exception {
        try{
            posts.get(post).like();
        } catch(Exception e){
            String s = "ERROR- Tiene que ingresar un número de post valido- red.like" + ": " + e.toString();
            throw new Exception(s);
        }
        return true;
    }
    //****************************************************************

    /*****************************************************************
     * comentar: comenta el post que quiere el usuario
     * @param post
     * @param comentario
     * @return
     * @throws Exception
     */
    public boolean comentar(int post, String comentario) throws Exception{
        try{
            Comentario postComentario = new Comentario("", "", "", "", comentario);
            posts.get(post).comentario(postComentario);
        } catch(Exception e){
            String s = "ERROR- Tiene que ingresar un número de post valido- red.comentario" + ": " + e.toString();
            throw new Exception(s);
        }
        return true;
    }
    //****************************************************************
}
