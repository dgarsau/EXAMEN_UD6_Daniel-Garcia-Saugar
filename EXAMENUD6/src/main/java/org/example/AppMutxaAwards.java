package org.example;

import java.util.ArrayList;

public class AppMutxaAwards {

    public static void main(String[] args) {

        ArrayList<MutxaAwards> asistentes = new ArrayList<>();

        // crear 1 presentador para la edicion de 2025 y obtenerDetalles()
        Presentador p_paco = new Presentador(2025, "Pepe");
        p_paco.obtenerDetalles();
        asistentes.add(p_paco);

        separador();

        // crear 5 artistas para la edicion de 2025
        Artista a_pepe = new Artista(2025, "Pepe");
        Artista a_juan = new Artista(2025, "Juan");
        Artista a_maria = new Artista(2025, "María");
        Artista a_eustaquio = new Artista(2025, "Eustaquio");
        Artista a_ana = new Artista(2025, "Ana");

        asistentes.add(a_pepe);
        asistentes.add(a_juan);
        asistentes.add(a_maria);
        asistentes.add(a_eustaquio);
        asistentes.add(a_ana);

        // todos los asistentes pasan por la alfombra roja
        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).alfombraRoja();
            }
        }

        separador();

        // todos los asistentes aplauden
        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).aplaudir();
            }
        }

        separador();

        // el presentador empieza a presentar la gala
        p_paco.presentar();

        // el presentador da un discurso "para solidarizarse con los afectados de la DANA"
        p_paco.darDiscurso("solidarizarse con los afectados de la DANA");
        separador();

        // se crea el premio (new) con la categoria MEJOR_ACTOR
        Premio mejoractor = new Premio(2025, Categoria.MEJOR_ACTOR);

        // 4 de los artistas son nominados a la categoria MEJOR_ACTOR y actualizan su lista de categorias

        int contador_nominaciones=0;

        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof Artista){
                ((Artista) asistente).esNominado(Categoria.MEJOR_ACTOR);
                contador_nominaciones++;
            }
            if (contador_nominaciones==4){
                break;
            }
        }

        separador();

        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
        a_juan.ganarPremio(mejoractor);
        separador();

        // se actualiza el atributo ganador en el premio MEJOR_ACTOR
        //Todo esto lo hago en ganarPremio de artista.

        // todos los asistentes aplauden y celebran el premio
        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).aplaudir();
            }
        }

        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).celebrarPremio(mejoractor);
            }
        }

        separador();

        // 1 de los artistas que estaba nominado intenta recoger el premio aunque no lo haya ganado
        try{
            a_eustaquio.recogerPremio(mejoractor);
        } catch (PerdedorException e){
            System.out.println(e.getMessage());
        }
        separador();

        // el artista ganador recoge el premio
        a_juan.recogerPremio(mejoractor);
        separador();

        // el presentador entrega el premio
        p_paco.entregarPremio(mejoractor);
        separador();

        // el artista ganador realiza un discurso "sobre el esfuerzo realizado para rodar la película"
        a_juan.darDiscurso("el esfuerzo realizado para rodar la película");
        separador();

        // todos los asistentes aplauden
        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).aplaudir();
            }
        }

        // PARTE AMARILLA //

        // el presentador da un discurso "para introducir el siguiente premio: MEJOR_PELICULA"
        p_paco.darDiscurso("introducir el siguiente premio: MEJOR PELICULA");
        separador();

        // se crea el premio con la categoria MEJOR_PELICULA
        Premio mejorpelicula = new Premio(2025, Categoria.MEJOR_PELICULA);

        // 4 de los artistas son nominados a la categoria MEJOR_PELICULA y actualizan su lista de categorias
        contador_nominaciones=0;

        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof Artista){
                ((Artista) asistente).esNominado(Categoria.MEJOR_PELICULA);
                contador_nominaciones++;
            }
            if (contador_nominaciones==4){
                break;
            }
        }

        separador();

        // 1 de los artistas nominados gana el premio y actualiza su lista de premios ganados
        // se actualiza el ganador en el premio MEJOR_PELICULA
        a_maria.ganarPremio(mejorpelicula);
        separador();

        // todos los asistentes celebran el premio

        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof AccionesAsistentes){
                ((AccionesAsistentes) asistente).celebrarPremio(mejoractor);
            }
        }
        separador();

        // el artista ganador recoge el premio
        a_maria.recogerPremio(mejorpelicula);
        separador();

        // el presentador entrega el premio
        p_paco.entregarPremio(mejorpelicula);
        separador();

        // el artista ganador realiza un discurso "sobre lo duro que ha sido conseguir financiación"
        a_maria.darDiscurso("lo duro que ha sido conseguir financiación");
        separador();

        p_paco.darDiscurso("despedir la gala");
        separador();

        for (MutxaAwards asistente : asistentes){
            if (asistente instanceof Artista){
                asistente.obtenerDetalles();
            }
        }












    }

    public static void separador(){
        System.out.println("---------------------------------------");
    }

}
