/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author ivan_
 */
public class Trabajador {
    double HORA_EXTRA = 276.5;
    private int Num_trab;
    private String nombre;
    private String paterno;
    private String materno;
    private double horas_extra;
    private double sueldo_base;
    private int anio_ingreso;
    private double total;
    
    public Trabajador(int nt,String nom,String pat,String mat,float he,double sue, int anio){
        Num_trab = nt;
        nombre = nom;
        paterno = pat;
        materno = mat;
        horas_extra = he;
        sueldo_base = sue;
        anio_ingreso = anio;
    }
    public void SetNum_trab(int nt){
        this.Num_trab = nt;
    }
    public int GetNum_trab(){
        return Num_trab;
    
    }
    public void SetNombre(String nom){
        this.nombre = nom;
    }
    public String GetNombre(){
        return nombre;
    
    }
    public void SetPaterno(String pat){
        this.paterno = pat;
    }
    public String GetPaterno(){
        return paterno;
    
    }
    public void SetMaterno(String mat){
        this.materno = mat;
    }
    public String GetMaterno(){
        return materno;
    
    }
    public void SetHoras_extra(double he){
        this.horas_extra = he;
    }
    public double GetHoras_extra(){
        return horas_extra;
    
    }
    public void SetSueldo_base(double sue){
        this.sueldo_base = sue;
    }
    public double GetSueldo_baseo(){
        return sueldo_base;
    
    }
    public void SetAnio_ingreso(int anio){
        this.anio_ingreso = anio;
    }
    public int GetAnio_ingreso(){
        return anio_ingreso;
    
    }
    public void SetCalcular_sueldo(int cs){
        int antiguedad = 2022 - anio_ingreso;
        total = sueldo_base + (sueldo_base*(antiguedad*0.03)) + (horas_extra * HORA_EXTRA);
        this.anio_ingreso = cs;
    }
    public double GetCalcular_sueldo(){
        return total;
    
    }
}
