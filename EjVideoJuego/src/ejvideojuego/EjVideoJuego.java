// Ejercicio Integrador video Juegos TodoCode
package ejvideojuego;

import ejvideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjVideoJuego {

    public static void main(String[] args) {
      
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        VideoJuego video1 = new VideoJuego(123,"banjo", "nintendo", 4, "plataforma" );
        VideoJuego video2 = new VideoJuego(124, "pacman", "nintendo", 2, "plataforma");
        VideoJuego video3 = new VideoJuego(125, "mario", "nintendo", 2, "plataforma");
        VideoJuego video4 = new VideoJuego(126, "counter", "pc", 2, "shooter");
        VideoJuego video5 = new VideoJuego(127, "age empira", "nintendo", 1, "estrategia");
        
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);
        
        for (VideoJuego video : listaVideoJuegos){
            System.out.println("Titulo: " + video.getTitulo() + " consola: " + video.getConsola()+
                   " cantidad de jugadores: " + video.getCantJugadores()+ " categoria: " + video.getCategoria()); 
        }
        System.out.println("==============="); 
        video1.setTitulo("banjo2");
        video1.setCantJugadores(10);
        video3.setConsola("sega");
        
        for (VideoJuego video : listaVideoJuegos){
            if (video.getConsola().equals("pc")){
                System.out.println(video.toString());
            }
        }
       
    }
    
}
