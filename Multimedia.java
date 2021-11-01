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
        - Última modificación: 31/10/2021

    Post que tiene contenido multimedia. Hereda de Post. Clase abstracta
    */

    //---------------------------PROPIEDADES-------------------------
    protected String url;
    protected int tamano;

    //---------------------------MÉTODOS-----------------------------
    public Multimedia(String usuario, String fecha, String hora, String hashtags, String url, int tamano) {
        super(usuario, fecha, hora, hashtags);
        this.url = url;
        this.tamano = tamano;
    }

    public abstract String reproducir();

    public abstract String toString();
}
