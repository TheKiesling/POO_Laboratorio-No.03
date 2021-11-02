/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Texto extends Post{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Texto.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Post que tiene contenido alfanumérico con extensión limitada. Hereda de post
    */

    //---------------------------PROPIEDADES--------------------------
    protected String texto;

    //---------------------------MÉTODOS------------------------------
    
    /*****************************************************************
     * Texto: asigna valores a las propiedades
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param texto
     */
    public Texto(String usuario, String fecha, String hora, String hashtags, String texto) {
        super(usuario, fecha, hora, hashtags);
        this.texto = texto;
    }
    //****************************************************************

    /****************************************************************
     * toString: concatena las propiedades y las enseña con formato String
    */
    public String toString(){
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + " likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++){
            if (hashtags[i] != "")
                post += "#" + hashtags[i] + " ";
        }
        post +=  "\n" + "(texto) " + this.texto + "\n";
        post += "---> comentarios:" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + ") " + comentarios.get(i) + "\n";
        return post;
    }
    //****************************************************************
}
