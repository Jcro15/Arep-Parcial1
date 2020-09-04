package edu.escuelaing.arep.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client {
    /**
     * ejecuta el cliente encargado de probar la aplicación web
     * @param args
     */
    public static void main(String[] args) {
        try {
            postTest();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Prueba la conexión con la aplicación en heroku, se utilizan los valores
     * 44,33,266,74,234,23,778,5 y se espera que la suma sea 1457, la media 182.125 y ls lista ordenada
     * 5,23,33,44,74,234,266,778
     * @throws IOException
     */
    public static void postTest() throws IOException {
        URL url = new URL("https://arep-parcial-rojas.herokuapp.com/calcular");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        String inputString = "44,33,266,74,234,23,778,5";
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = inputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());

        }
    }
}
