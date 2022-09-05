/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ivan_
 */
public class Empresa {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        //Nomina
    String archivo;
    FileReader f = new FileReader("junio.dat");
    try (BufferedReader b = new BufferedReader(f)) {
        while((archivo = b.readLine())!=null)
        {
        System.out.println(archivo);   
            }
        }
    /*
    def __init__(self , ruta):
        self.archivo = ruta
        entrada = open( self.archivo , 'rt',encoding="latin-1")
        info = entrada.read()
        #print(info)
        print("------------")
        lineas = info.split("\n")
        self.nomina = Arreglo(len(lineas)-1)
        contador = 0 
        for linea in lineas[1::]:
            tmp = linea.split(",")
            trabTemp = Trabajador(int(tmp[0]),tmp[1],tmp[2],tmp[3],int(tmp[4]),int(tmp[5]),int(tmp[6]))
            self.nomina.set_elemento(contador , trabTemp)
            contador += 1
        #print(nomina)
    def listar_sueldos(self):
        for index in range(self.nomina.longitud()):
            emp = self.nomina.get_elemento(index) 
            print(f"Id:{emp.get_numero_trabajador()} Sueldo{emp.calcular_sueldo()}")
  
    def mayor_antiguedad(self ):
        mayor = 2023
        idx = 0
        for index in range(self.nomina.longitud()):
            emp = self.nomina.get_elemento(index)
            if emp.get_anio_ingreso() < mayor:
                idx = index
                mayor = emp.get_anio_ingreso()
        return self.nomina.get_elemento(idx)
*/
    
    }
}
    
    

