/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Comentario extends Texto{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Comentario.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Texto con extensión limitada que reacciona a un post. Hereda de texto
    */

    //---------------------------PROPIEDADES--------------------------
    protected Post post;

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * Comentario: instancia los valores
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param texto
     */
    public Comentario(String usuario, String fecha, String hora, String hashtags, String texto) {
        super(usuario, fecha, hora, hashtags, texto);
    }
    //****************************************************************

    /*****************************************************************
     * toString: muestra el texto del mensaje
     */
    public String toString(){
        return texto;
    }
    //****************************************************************
}
