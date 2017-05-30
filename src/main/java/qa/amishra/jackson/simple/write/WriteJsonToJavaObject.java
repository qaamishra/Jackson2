package qa.amishra.jackson.simple.write;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import qa.amishra.jackson.JsonPojoClasses.School;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashutosh on 29-05-2017.
 */
public class WriteJsonToJavaObject {

    public static void main(String[] args) throws JsonProcessingException {
        WriteJsonToJavaObject writeJsonToJavaObject = new WriteJsonToJavaObject();
        writeJsonToJavaObject.process();
    }

    private void process() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        School school = createSchoolObject();

        try {
            // Java object(School) to Json file
            mapper.writeValue(new File("school.json"), school);

            // Java object(School) to Json String
            String jsonInString = mapper.writeValueAsString(school);
            System.out.println(jsonInString);

            // Java object(School) to Json Console Pretty Printer
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(school);
            System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private School createSchoolObject() {

        School school = new School();

        school.setName("qaamishra");
        school.setAge(30);
        school.setClassroom("stdV");
        school.setMarks(new BigDecimal("72.36"));

        List<String> subjects = new ArrayList();
        subjects.add("science");
        subjects.add("maths");

        school.setSubjects(subjects);

        return school;

    }

}
