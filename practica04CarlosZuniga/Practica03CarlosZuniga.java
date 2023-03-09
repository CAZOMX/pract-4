/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04CarlosZuniga;

import java.util.Scanner;

/**
 *
 * @author ivanc
 */
public class Practica03CarlosZuniga
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Equipo[] d = new Equipo[20];
        Scanner lector = new Scanner(System.in);
        int opc = 1;
        int i = 0;
        int buscar = 1;
        UI ui = new UI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);

        while (opc > 0 && opc < 5)
        {
            System.out.println("\n1.Registrar\n2.Buscar\n3.Consultar\n4.Salir");
            opc = lector.nextInt();
            switch (opc)
            {
                case 1:
                    if (i >= d.length)
                    {
                        System.out.println(
                                "Se ha terminado el espacio disponible :(");
                    } else
                    {
                        equipo[i] = new Equipo();
                        System.out.print("Codigo del dispositivo: ");
                        d[i].setCodigo(lector.nextInt());
                        System.out.print("Nombre del dispositivo: ");
                        d[i].setNombre(lector.next());
                        System.out.print("Serial del dispositivo: ");
                        d[i].setSerial(lector.next());
                        System.out.flush();
                        i++;
                    }
                    break;
                case 2:
                    boolean encontrar = false;
                    int e = 0;
                    if (d[e] == null && d[e + 1] == null)
                    {
                        System.out.println("Memoria llena");
                    } else
                    {
                        System.out.println("Codigo de dispositivo: ");
                        buscar = lector.nextInt();
                        for (Equipo actual : d)
                        {
                            if (actual == null)
                            {
                                encontrar = false;
                            } else if (actual.getCodigo() == buscar)
                            {
                                System.out.println("\nCodigo de dispositivo:");
                                System.out.println(actual.getCodigo());
                                System.out.println("Nombre del dispositivo:");
                                System.out.println(actual.getNombre());
                                System.out.println("Serial del dispositivo:");
                                System.out.println(actual.getSerial());
                                encontrar = true;
                                break;
                            }
                        }
                        if (!encontrar)
                        {
                            System.out.println("No existe");
                        }

                    }
                    break;
                case 3:
                    int g = 0;
                    if (d[g] == null && d[g + 1] == null)
                    {
                        System.out.println("Debes registrar un dispositivo");
                    } else
                    {
                        System.out.print("Codigo del dispositivo \t");
                        System.out.print("Nombre del dispositivo \t");
                        System.out.print("Serial del dispositivo  \t");
                        System.out.println();
                        for (Equipo actual : d)
                        {
                            if (actual == null)
                            {
                                break;
                            } else
                            {
                                System.out.print(actual.getCodigo() + "\t\t\t");
                                System.out.print(actual.getNombre() + "\t\t\t");
                                System.out.print(actual.getSerial() + "\t\t\t");
                                System.out.println();
                                lector.nextLine();
                            }

                        }
                    }
                    break;

            }
        }
    }

}
