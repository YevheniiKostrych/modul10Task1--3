import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserJSONTest {

    public void readFileAndsWriteInJSONForm(File file) {
        File file3 = new File("src/main/resources/user.json");

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             FileWriter writer = new FileWriter(file3)
        ) {
            br.readLine();
            List<User> fullData = readFileAndMapItToUsersList(br);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            writer.write(gson.toJson(fullData));
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private  List<User> readFileAndMapItToUsersList(BufferedReader br) throws IOException {
        List<User> fullData = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("\\s+");
            User user = new User(data[0], Integer.parseInt(data[1]));
            fullData.add(user);

        }
        return fullData;
    }
}

