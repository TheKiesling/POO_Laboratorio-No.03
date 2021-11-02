/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Emoticon extends Post {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Post que tiene símbolos que expresan un sentimiento. Heredan de Post
    */

    //---------------------------PROPIEDADES-------------------------
    protected String emoticon;

    //---------------------------MÉTODOS-----------------------------
    
    /*****************************************************************
     * Emoticon: asigna valores a las propiedades
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param emoticon
     */
    public Emoticon(String usuario, String fecha, String hora, String hashtags, String emoticon) {
        super(usuario, fecha, hora, hashtags);
        this.emoticon = emoticon;
    }
    //****************************************************************

    /****************************************************************
     * toString: concatena las propiedades y las enseña con formato String
    */
    public String toString(){
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + " likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            if (hashtags[i] != "")
                post += "#" + hashtags[i] + " ";
        post +=  "\n" + "(emoticon) " + this.emoticon + "\n";
        post += "---> comentarios:" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + ") " + comentarios.get(i) + "\n";
        return post;
    }
    //****************************************************************
}
