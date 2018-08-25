package qa.amishra.jackson.json.jsonmap.ReadToMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class JsonToJavaMap {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> map = mapper.readValue(
                    new File("school.json"),
                    new TypeReference<Map<String, Object>>() {
                    });


            System.out.println(map.get("name"));
            System.out.println(map.get("age"));
            ArrayList<String> list = (ArrayList<String>) map.get("subjects");

            for (String sub : list) {
                System.out.println(sub);
            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
