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
        - Última modificación: 02/11/2021

    Multimedia que se reproduce por medio de imágenes. Hereda de multimedia
    */

    //---------------------------PROPIEDADES-------------------------
    protected int frameRate;

    //---------------------------MÉTODOS-----------------------------

    /*****************************************************************
     * Video: asigna valores a las propiedades 
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param url
     * @param tamano
     * @param frameRate
     */
    public Video (String usuario, String fecha, String hora, String hashtags, String url, int tamano, int frameRate){
        super(usuario, fecha, hora, hashtags, url, tamano);
        this.frameRate = frameRate;
    }
    //****************************************************************

    /*****************************************************************
     * reproducir: muestra un mensaje de reproducción
     */
    public String reproducir() {
        String reproducir = "";
        reproducir += "voy a MOSTRAR este video ... con " + frameRate + " fps";
        return reproducir;
    }
    //****************************************************************

    /****************************************************************
     * toString: concatena las propiedades y las enseña con formato String
    */
    public String toString() {
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + " likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            if (hashtags[i] != "")
                post += "#" + hashtags[i] + " ";
        post += "\n" + "(video) " + this.url + "\n";
        post += this.tamano + " kB, FrameRate: " + this.frameRate + " fps" + "\n";
        post += "---> comentarios:" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + ") " + comentarios.get(i) + "\n";
        return post;
    }
    //****************************************************************
}
