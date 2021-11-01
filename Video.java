/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Video extends Multimedia{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 29/10/2021

    Multimedia que se reproduce por medio de imágenes. Hereda de multimedia
    */

    //---------------------------PROPIEDADES-------------------------
    protected int frameRate;

    //---------------------------MÉTODOS-----------------------------
    public Video (String usuario, String fecha, String hora, String hashtags, String url, int tamano, int frameRate){
        super(usuario, fecha, hora, hashtags, url, tamano);
        this.frameRate = frameRate;
    }

    public String reproducir() {
        String reproducir = "";
        reproducir += "voy a MOSTRAR este video ... con " + frameRate + " fps";
        return reproducir;
    }


    public String toString() {
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + "likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            post += "#" + hashtags[i];
        post += "\n" + "(video) " + this.url + "\n";
        post += this.tamano + " kB, FrameRate: " + this.frameRate + " fps" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + 1 + ") " + comentarios.get(i) + "\n";
        return post;
    }

}
