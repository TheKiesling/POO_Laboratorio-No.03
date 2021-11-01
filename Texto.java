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
        - Última modificación: 31/10/2021

    Post que tiene contenido alfanumérico con extensión limitada. Hereda de post
    */

    //---------------------------PROPIEDADES-------------------------
    protected String texto;

    //---------------------------MÉTODOS-----------------------------
    
    public Texto(String usuario, String fecha, String hora, String hashtags, String texto) {
        super(usuario, fecha, hora, hashtags);
        this.texto = texto;
    }

    public String toString(){
        String post = "";
        post += this.usuario + "." + this.fecha + ":" + this.hora + "likes: " + this.likes + "\n";
        for (int i = 0; i < hashtags.length; i++)
            post += "#" + hashtags[i];
        post +=  "\n" + "(texto) " + this.texto + "\n";
        for (int i = 0; i < comentarios.size(); i++)
            post += "(" + i + 1 + ") " + comentarios.get(i) + "\n";
        return post;
    }
}
