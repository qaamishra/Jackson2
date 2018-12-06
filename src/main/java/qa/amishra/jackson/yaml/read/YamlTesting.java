package qa.amishra.jackson.yaml.read;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import qa.amishra.jackson.yaml.yamlpojoclasses.Address;
import qa.amishra.jackson.yaml.yamlpojoclasses.Person;

import java.io.File;

public class YamlTesting {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Person person = mapper.readValue(new File("person.yaml"), Person.class);


            System.out.println(ReflectionToStringBuilder.toString(person, ToStringStyle.JSON_STYLE));

            System.out.println("=======");
            System.out.println(ReflectionToStringBuilder.toString(person, ToStringStyle.MULTI_LINE_STYLE));
            System.out.println("=======");
            System.out.println(person.getAddress().getCity());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
