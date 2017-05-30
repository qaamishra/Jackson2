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