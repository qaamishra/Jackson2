package qa.amishra.jackson.xml.xmltree;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;
import qa.amishra.jackson.xml.xmlpojotree.Root;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTree {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new XmlMapper();
        Root root = objectMapper.readValue(
                              StringUtils.toEncodedString(Files.readAllBytes(Paths.get("root.xml")), StandardCharsets.UTF_8),
                Root.class);
        System.out.println(root.getContact().getUsers()[1].getType());
        System.out.println(root.getElectronics().getElements().getComputer().getOrg().getBrand1());

    }
}

