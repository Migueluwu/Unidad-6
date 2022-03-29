/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author miguel
 */
public class GestionHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ale= new Random();
        Hospital hospital=new Hospital("Hospital Central", "Calle Mar de Alboran", 10);
        hospital.contratarEmpleado(crearMedico());
        hospital.contratarEmpleado(crearMedico());
        hospital.contratarEmpleado(crearPersonalPas());
        hospital.contratarEmpleado(crearPersonalPas());
        hospital.contratarEmpleado(crearPersonalPas());
        hospital.ingresarPaciente(crearPaciente());
        hospital.ingresarPaciente(crearPaciente());
        hospital.ingresarPaciente(crearPaciente());
        hospital.ingresarPaciente(crearPaciente());
        hospital.ingresarPaciente(crearPaciente());
        //////////////////////////////////////////77
        ArrayList<Medico>listaMedico=new ArrayList<>();
        for(Empleado emp: hospital.listaEmpleados){
            if(emp instanceof Medico){
                listaMedico.add((Medico)emp);
            }
        }
        
        listaMedico.get(ale.nextInt(listaMedico.size())).
                tratarPaciente(hospital.listaPacientes.get(ale.nextInt(hospital.listaPacientes.size()))
                        , "Paracetamol");
        
        
        for(Empleado emp: hospital.listaEmpleados){
            System.out.println(emp.calcularIRPF());
        }
        
        
        hospital.listaPacientes.get(ale.nextInt(hospital.listaPacientes.size())).renovarNIF(LocalDate.now());
    }
    public static Paciente crearPaciente(){
        Random ale= new Random();
        return new Paciente(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10)
                , RandomStringUtils.randomAlphabetic(10),
                new NIF(String.valueOf(RandomStringUtils.randomNumeric(9)),
                        LocalDate.now().plusDays(ale.nextInt(3650))));
    }
    
    public static Medico crearMedico(){
        Random ale= new Random();
        return new Medico(RandomStringUtils.randomAlphabetic(10),RandomStringUtils.randomNumeric(9)
                ,ale.nextInt(2000)+1000,RandomStringUtils.randomAlphabetic(10) , RandomStringUtils.randomAlphabetic(10),
                new NIF(String.valueOf(RandomStringUtils.randomNumeric(9)),
                        LocalDate.now().plusDays(ale.nextInt(3650))));
        
    }
    
    public static Administrativo crearPersonalPas(){
        Random ale= new Random();
        return new Administrativo(Grupo.values()[ale.nextInt(Grupo.values().length)],
                RandomStringUtils.randomNumeric(9),ale.nextInt(2000)+1000,
                RandomStringUtils.randomAlphabetic(10) , RandomStringUtils.randomAlphabetic(10),
                new NIF(String.valueOf(RandomStringUtils.randomNumeric(9)),
                        LocalDate.now().plusDays(ale.nextInt(3650))));
    }
            
    
}
