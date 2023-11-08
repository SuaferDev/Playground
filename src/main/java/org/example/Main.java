package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        User Ivan = new User("Ivan", 16, new String[]{"drawing", "swimming"},12);

        JSONParser jsonParser = new JSONParser();
        jsonParser.objectToJson(Ivan, "ivan.json");

        try{
            User Ivan2 = jsonParser.jsonToObject("ivan.json", User.class);
            Ivan2.say();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        CSVParser csvParser = new CSVParser();
        Test test = new Test("test",12);
        csvParser.objectToCSV(test,"test.csv",";");

        try{
            List<Test> l = csvParser.csvToList("test.csv", Test.class);
            for(Test u : l){
                System.out.println(u.getName());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}