package qa.amishra.jackson.read;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import qa.amishra.jackson.read.JsonPojoClasses.School;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ashutosh on 29-05-2017.
 */
public class ReadJsonToJavaObject {

    public static void main(String[] args) {
        ReadJsonToJavaObject obj = new ReadJsonToJavaObject();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        try {

            //Read Json from file to Object
            School school = mapper.readValue(new File("ReadJsonToJavaObject.json"), School.class);
            System.out.println(school.getName());
            System.out.println(school.getAge());
            System.out.println(school.getClassroom());
            System.out.println(school.getMarks());
            System.out.println(school.getSubjects());


            //PrettyPrinter()
            String schoolJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(school);
            System.out.println(schoolJson);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}