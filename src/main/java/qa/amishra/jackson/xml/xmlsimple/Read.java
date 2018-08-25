package qa.amishra.jackson.xml.xmlsimple;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;
import qa.amishra.jackson.xml.xmlpojosimple.Employees;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new XmlMapper();
        Employees employees = objectMapper.readValue(
                              StringUtils.toEncodedString(Files.readAllBytes(Paths.get("employees.xml")), StandardCharsets.UTF_8),
                Employees.class);
        System.out.println(employees.getEmployee()[1].toString());
    }
}
