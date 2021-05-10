package ge.badri.web_sockets_demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatBotService {
    public static String answer(String question) throws Exception {
        String result;

        switch (question) {
            case "გამარჯობა":
                result = "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
                break;
            case "joke":
                result = get();
                break;
            case "რომელი საათია?":
                result = "10";
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

//        result = switch (question) {
//            case "გამარჯობა" -> "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
//            case "რომელი საათია?" -> "10";
//            default yeild "ამ კითხვაზე პასუხი არ მაქვს";
//        }

        return result;
    }

    public static String get() throws Exception {
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        String res = " ";
        System.out.println("Output from Server :  \n");
        while ((output = br.readLine()) != null) {
            res += output;
        }
        conn.disconnect();
        return res.substring(res.indexOf("value") + 7);
    }
}

