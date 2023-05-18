import javax.swing.*;

public class tienda {
    public static void main(String[] args) {
         int opcion;
         int cantidad_videjuego;


         do{
             opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenid@ a la Tienda de VideoJuegos Maryem\n"
             + "1. insertar videojuegos\n"+ "2. borrar videojuego\n"+ "3, editar videojuego\n"+ "4. Ver lista de videojuegos\n"+ "5. Ranking de videojuegos mas largos\n"+ "6. Salir"));
            switch (opcion){
                case 1:
                    cantidad_videjuego= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de videojuegos"));
                    videojuegos[] vec= new videojuegos[cantidad_videjuego];
                    videojuegos juego= new videojuegos();
                    for ( int i=0; i< vec.length; i++){
                        String titulo1=JOptionPane.showInputDialog("Dime el Titulo del videojuego ["+(i+1)+"]");
                        juego.setTitulo(titulo1);

                        int duracion=Integer.parseInt(JOptionPane.showInputDialog("ingrese la duracion del videojuego"));
                        juego.setHoras_estimadas(duracion);

                        String genero1=JOptionPane.showInputDialog("Dime el genero del videojuego ");
                        juego.setGenero(genero1);

                        String compania1=JOptionPane.showInputDialog("Dime a que compañia pertenece el videojuego");
                        juego.setCompania(compania1);

                        vec[cantidad_videjuego]= new videojuegos(juego.getTitulo(), juego.getHoras_estimadas(), juego.getGenero(),juego.getCompania());


                    }
                    break;
                case 4:
                    videojuegos juego1= new videojuegos();
                    juego1.verVideoJuegos(videojuegos[] vec);






            }


         }while(opcion !=6 );






    }
}
