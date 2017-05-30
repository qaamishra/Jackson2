package qa.amishra.jackson.jsonmap.WriteToMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class JavaMapToJson {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            String json = "";

            List<Object> subjects = new ArrayList();
            subjects.add("Maths");
            subjects.add("Science");
            subjects.add("Social");

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", "qaamishra");
            map.put("age", 30);
            map.put("Subjects", subjects);


            json = mapper.writeValueAsString(map);

            System.out.println(json);

            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

            // pretty print
            System.out.println(json);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
