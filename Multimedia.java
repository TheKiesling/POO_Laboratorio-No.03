/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public abstract class Multimedia extends Post{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Multimedia.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Post que tiene contenido multimedia. Hereda de Post. Clase abstracta
    */

    //---------------------------PROPIEDADES--------------------------
    protected String url;
    protected int tamano;

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * Multimedia: asigna valores a las propiedades
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param url
     * @param tamano
     */
    public Multimedia(String usuario, String fecha, String hora, String hashtags, String url, int tamano) {
        super(usuario, fecha, hora, hashtags);
        this.url = url;
        this.tamano = tamano;
    }
    //****************************************************************

    /*****************************************************************
     * reproducir: muestra un mensaje de reproducción
     */
    public abstract String reproducir();
    //****************************************************************

    /****************************************************************
     * toString: concatena las propiedades y las enseña con formato String
    */
    public abstract String toString();
    //****************************************************************
}
