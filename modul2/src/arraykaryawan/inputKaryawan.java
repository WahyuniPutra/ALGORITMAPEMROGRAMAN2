package arrayKaryawan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputKaryawan {
    public String bacaString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in), 1);
        String string = "";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public int bacaInt() {
        return Integer.parseInt(bacaString());
    }
}
