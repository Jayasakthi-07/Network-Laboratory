import java.io.*;

class Tracert {
    public static void main(String[] args) throws Exception {
        Process p = Runtime.getRuntime().exec("tracert google.com");

        BufferedReader br = new BufferedReader(
            new InputStreamReader(p.getInputStream()));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
