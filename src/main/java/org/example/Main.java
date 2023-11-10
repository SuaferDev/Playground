package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        User Ivan = new User("Ivan", 16, new String[]{"drawing", "swimming"},12);

        SuaferParser jsonParser = new JSONParser();
        jsonParser.parseObject(Ivan, "ivan.json");

        try{
            User Ivan2 = (User) jsonParser.parseFile("ivan.json", User.class);
            Ivan2.say();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        CSVParser csvParser = new CSVParser();
        Test test = new Test("test",12);
        csvParser.parseObject(test,"test.csv");

        try{
            List<Test> l = csvParser.parseFile("test.csv", Test.class);
            for(Test u : l){
                System.out.println(u.getName());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}