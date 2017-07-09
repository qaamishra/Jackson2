package qa.amishra.jackson.jsontree;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import qa.amishra.jackson.JsonPojoClasses.Contact;
import qa.amishra.jackson.JsonPojoClasses.Employee;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class ComplexJsonToJavaObject {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            //JSON from file to Object
            Employee employee = mapper.readValue(new File("Employee.json"), Employee.class);

            System.out.println(employee.getName());

            int employeeLenght= employee.getContact().length;
            for(int i=0;i<employeeLenght;i++){

                System.out.println(employee.getContact()[i].getRef());
                System.out.println(employee.getContact()[i].getType());
            }

            int electronicsLenght= employee.getElectronics().length;
            for(int i=0;i<electronicsLenght;i++){

                System.out.println(employee.getElectronics()[i].getComputer()[i].getBrand1());

            }






        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
