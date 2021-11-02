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
        - Última modificación: 31/10/2021

    Multimedia auditiva que expresa un mensaje. Hereda de multimedia.
    */

    //---------------------------PROPIEDADES-------------------------
    protected int sampleRate;
    protected int bitDelph;

    //---------------------------MÉTODOS-----------------------------
    
    public Audio(String usuario, String fecha, String hora, String hashtags, String url, int tamano, int sampleRate, int bitDelph) {
        super(usuario, fecha, hora, hashtags, url, tamano);
        this.sampleRate = sampleRate;
        this.bitDelph = bitDelph;
    }

    public String reproducir() {
        String reproducir = "";
        reproducir += "voy a SONAR este audio ... con " + sampleRate + " de sample rate y " + bitDelph + " de bit depth";
        return reproducir;
    }


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
}
