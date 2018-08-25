# Jackson2

This project talks about how to convert the json from (String,URL,File) to Java object and vice versa.

To convert a json to java pojo use the below websites :
#1: http://pojo.sodhanalibrary.com/
#2: http://www.jsonschema2pojo.org/

Tip :
If you have hybrid data in the key while filling the map use key a object type
Map<String, Object>
Later on while fetching you can always typecast the object to required type
e.g.
ArrayList<String> list = (ArrayList<String>) map.get("subjects");

For Json array viewing
http://jsonviewer.stack.hu/
http://www.jsoneditoronline.org/

More :
http://www.baeldung.com/jackson

XML tips <br>
1.Declare the start of XML of root element with annotation @JacksonXmlRootElement(localName = "root")<br>
2.All the nodes which are array declare it with annotation  @JacksonXmlElementWrapper(localName = "elements", useWrapping = false) <br>
3.Declare all the nodes with the annotation @JacksonXmlProperty(localName = "element")<br> 