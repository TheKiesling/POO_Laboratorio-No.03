/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Imagen extends Multimedia {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Imagen.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 31/10/2021

    Multimedia visual que representa una figura. Hereda de multimedia.
    */

    //---------------------------PROPIEDADES-------------------------
    protected String formato;
    protected int resolucion;

    //---------------------------MÉTODOS-----------------------------
    public Imagen (String usuario, String fecha, String hora, String hashtags, String url, int tamano, String formato, int resolucion){
        super(usuario, fecha, hora, hashtags, url, tamano);
        this.formato = formato;
        this.resolucion = resolucion;
    }

    public String reproducir() {
        String reproducir = "";
        reproducir += "estoy mostrando esta imagen ... con " + resolucion + " megapixeles de resolucion";
        return reproducir;
    }


    public String toString() {
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + " likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            if (hashtags[i] != "")
                post += "#" + hashtags[i] + " ";
        post += "\n" + "(imagen) " + this.url + "\n";
        post += this.tamano + " kB, " + this.formato + ", " + this.resolucion + " Megapixeles" + "\n";
        post += "---> comentarios:" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + ") " + comentarios.get(i) + "\n";
        return post;
    }
}
