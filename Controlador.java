/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Controlador {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 30/10/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    //---------------------------MÉTODOS-----------------------------

    public static void main(String[] args) throws Exception{
        Vista vista = new Vista();
        Red red = new Red();
        Post post = null;

        try{
            vista.bienvenida();

            int opcion = -1;
            while (opcion != 3){
                opcion = vista.menuOpciones();

                if (opcion == 1){ //Ingresar un post
                    String usuario = vista.pedirUsuario();
                    String fecha = vista.pedirFecha();
                    String hora = vista.pedirHora();
                    String hashtags = vista.pedirHashtags();
                    int opcionPost = vista.menuOpcionesPost();
                    if(opcionPost == 1){ //Texto
                        String texto = vista.pedirTexto();
                        post = new Texto(usuario, fecha, hora, hashtags, texto);
                        boolean ingreso = red.ingreso(post);
                        vista.ingreso(ingreso);
                    }
                    if(opcionPost == 2){ //Multimedia
                        String url = vista.pedirURL();
                        int tamano = vista.pedirTamano();
                        int opcionMultimedia = vista.menuOpcionesMultimedia();
                        if(opcionMultimedia == 1){ //Audio
                            int sampleRate = vista.pedirSampleRate();
                            int bitDelph = vista.pedirbitDelph();
                            post = new Audio(usuario, fecha, hora, hashtags, url, tamano, sampleRate, bitDelph);
                            boolean ingreso = red.ingreso(post);
                            vista.ingreso(ingreso);
                        }
                        if (opcionMultimedia == 2){ //Imagen
                            String formato = vista.pedirFormato();
                            int resolucion = vista.pedirResolucion();
                            post = new Imagen(usuario, fecha, hora, hashtags, url, tamano, formato, resolucion);
                            boolean ingreso = red.ingreso(post);
                            vista.ingreso(ingreso);
                        }
                        if(opcionMultimedia == 3){ //Video
                            int frameRate = vista.pedirFrameRate();
                            post = new Video(usuario, fecha, hora, hashtags, url, tamano, frameRate);
                            boolean ingreso = red.ingreso(post);
                            vista.ingreso(ingreso);
                        }
                    }
                    if(opcionPost == 3){ //Emoticón
                        String emoticon = vista.pedirEmoticon();
                        post = new Emoticon(usuario, fecha, hora, hashtags, emoticon);
                        boolean ingreso = red.ingreso(post);
                        vista.ingreso(ingreso);
                    }
                }

                if(opcion == 2){ //Búsqueda de posts
                    int opcionBusqueda = vista.menuOpcionesBusqueda();
                    String busqueda = "";
                    if(opcionBusqueda == 1) //Fecha de publicacion
                        busqueda = vista.pedirFechaBuscar();
                    if(opcionBusqueda == 2) //Hashtag
                        busqueda = vista.pedirHashtagBuscar();
                    String posts = red.busqueda(opcionBusqueda, busqueda);
                    vista.busqueda(posts);

                    //Interactuar con los posts
                    int opcionInteractuar = vista.menuOpcionesInteraccion();
                    int postInteractuar = vista.pedirPost();
                    if(opcionInteractuar == 1){
                        String reproduccion = red.reproducir(postInteractuar);
                        vista.busqueda(reproduccion);
                    }
                    if(opcionInteractuar == 2){
                        Boolean like = red.like(postInteractuar);
                        vista.reaccion(like);
                        posts = red.busqueda(opcionBusqueda, busqueda);
                        vista.busqueda(posts);
                    }
                    if(opcionInteractuar == 3){
                        String comentario = vista.pedirTexto();
                        Boolean comentar = red.comentar(postInteractuar, comentario);
                        vista.reaccion(comentar);
                        posts = red.busqueda(opcionBusqueda, busqueda);
                        vista.busqueda(posts);
                    }
                }

                if(opcion == 3){
                    vista.despedida();
                }
            }

        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
    //****************************************************************
}
