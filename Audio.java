/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Audio extends Multimedia{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Audio.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 02/11/2021

    Multimedia auditiva que expresa un mensaje. Hereda de multimedia.
    */

    //---------------------------PROPIEDADES-------------------------
    protected int sampleRate;
    protected int bitDelph;

    //---------------------------MÉTODOS-----------------------------
    
    /*****************************************************************
     * Audio: asigna valores a las propiedades
     * @param usuario
     * @param fecha
     * @param hora
     * @param hashtags
     * @param url
     * @param tamano
     * @param sampleRate
     * @param bitDelph
     */
    public Audio(String usuario, String fecha, String hora, String hashtags, String url, int tamano, int sampleRate, int bitDelph) {
        super(usuario, fecha, hora, hashtags, url, tamano);
        this.sampleRate = sampleRate;
        this.bitDelph = bitDelph;
    }
    //****************************************************************

    /*****************************************************************
     * reproducir: muestra un mensaje de reproducción
     */
    public String reproducir() {
        String reproducir = "";
        reproducir += "voy a SONAR este audio ... con " + sampleRate + " de sample rate y " + bitDelph + " de bit depth";
        return reproducir;
    }
    //****************************************************************

    /****************************************************************
     * toString: concatena las propiedades y las enseña con formato String
    */
    public String toString() {
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + "likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            if (hashtags[i] != "")
                post += "#" + hashtags[i] + " ";
        post += "\n" + "(audio) " + this.url + "\n";
        post += this.tamano + " kB, " + "SampleRate: " + this.sampleRate + " kHz BitDepth: " + bitDelph + "\n";
        post += "---> comentarios:" + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + ") " + comentarios.get(i) + "\n";
        return post;
    }
    //****************************************************************
}
