package qa.amishra.jackson.json.jsontree;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.awt.image.ImageWatched;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Ashutosh on 30-05-2017.
 */
public class ComplexJsonTreeToJava {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> map = mapper.readValue(
                    new File("Employee.json"),
                    new TypeReference<Map<String, Object>>() {
                    });


            System.out.println(map.get("id"));
            System.out.println(map.get("name"));
            System.out.println(map.get("contact"));
            System.out.println(map.get("electronics"));


            System.out.println("\n=================\n");
            LinkedHashMap<String, Object> nameList = (LinkedHashMap<String, Object>) map.get("name");

            System.out.println(nameList.get("first"));
            System.out.println(nameList.get("last"));

            System.out.println("\n=========Nested Array for Electronics========\n");
            List<LinkedHashMap<String, Object>> arrayList = new ArrayList<LinkedHashMap<String, Object>>();
            arrayList = (List<LinkedHashMap<String, Object>>) map.get("electronics");

            //Map<String, Object> electronic=new LinkedHashMap<String, Object>();
            LinkedHashMap<String, Object> electronic;

            for (int i = 0; i < arrayList.size(); i++) {

                electronic = arrayList.get(i);

                ArrayList<LinkedHashMap<String, Objects>> electDetail = new ArrayList<LinkedHashMap<String, Objects>>();
                electDetail = (ArrayList<LinkedHashMap<String, Objects>>) electronic.get("mobile");

                for (int k = 0; k < electDetail.size(); k++) {

                    System.out.println(electDetail.get(i).get("brand1"));
                    System.out.println(electDetail.get(i).get("brand2"));
                    System.out.println(electDetail.get(i).get("brand3"));

                }
                System.out.println("===================\n");
                electDetail = (ArrayList<LinkedHashMap<String, Objects>>) electronic.get("computer");
                for (int k = 0; k < electDetail.size(); k++) {

                    System.out.println(electDetail.get(i).get("brand1"));
                    System.out.println(electDetail.get(i).get("brand2"));
                    System.out.println(electDetail.get(i).get("brand3"));

                }
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
