/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexample;

import java.util.HashMap;



/**
 *
 * @author Estudiante
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, Student> students = new HashMap<String, Student>();
        
         Student s1 = new Student("12342", "Fabian");
        Student s2 = new Student("2234-00", "Ivan");
        Student s3 = new Student("234243", "Valentino");
        
        
        
        
        students.put(s1.getIdNo(), s1);
        students.put(s2.getIdNo(), s2);
        students.put(s3.getIdNo(), s3);
        
        
        String id = "2234-00";
        System.out.println("Lets try to review");
        
        // El Id en este caso es la clave
        Student x = students.get(id);
        
        
        if(x!= null){
            
            System.out.println("Found! Name = "+ x.getName());
            
            
        }
        
        else{
            
            
            System.out.println("Invalid ID: " +id);
        
       
        }
        
        System.out.println("Here Are all of the students");
        System.out.println();
        
        for(Student s: students.values()){
            
            
            System.out.println("ID: " + s.getIdNo());
            System.out.println("Name: "+ s.getName());
            System.out.println();
            
            
            
        }
        
        
        
    }
    
}
