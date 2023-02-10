package FileManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Json_userinput_IN_Reg {
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        char ch='y';
        String fileName="./src/main/resources/Reg.json";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));

        JSONObject studentObj = new JSONObject();
        Scanner input = new Scanner(System.in);

        System.out.println("Input Full Name : ");
        studentObj.put("Name :", input.next());

        System.out.println("Input Email : ");
        studentObj.put("Email :", input.next());

        System.out.println("Input Password : ");
        studentObj.put("Password :", input.next());

        System.out.println("Input Address : ");
        studentObj.put("Address :", input.next());

        System.out.println("Input MobileNo: ");
        studentObj.put("Mobile No :", input.next());

        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.add(studentObj);
        System.out.print(jsonArray);

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();

        System.out.println("Saved!");

        System.out.print(jsonArray);


    }

}
