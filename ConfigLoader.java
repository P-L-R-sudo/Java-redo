import java.io.*;

public class ConfigLoader {
    public String loadConfig() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
        String line = reader.readLine(); // can throw IOException
        reader.close();
        return line;
    }
}

public class BankApp {
    public void initialize() throws IOException {
        ConfigLoader loader = new ConfigLoader();
        String config = loader.loadConfig(); // ducks IOException
        System.out.println("Config loaded: " + config);
    }
}

public class Main {
    public static void main(String[] args) {
        BankApp app = new BankApp();
        try {
            app.initialize(); // this is where exception is finally handled
        } catch (IOException e) {
            System.out.println("Failed to start the app: " + e.getMessage());
        }
    }
}
