package qa.amishra.jackson.json.simple.read;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import qa.amishra.jackson.json.jsonpojoclasses.School;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ashutosh on 29-05-2017.
 */
public class ReadJsonToJavaObject {

    public static void main(String[] args) {
        ReadJsonToJavaObject readJsonToJavaObject = new ReadJsonToJavaObject();
        readJsonToJavaObject.process();
    }

    private void process() {
        ObjectMapper mapper = new ObjectMapper();

        try {

            //ReadTree Json from file to Object
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
