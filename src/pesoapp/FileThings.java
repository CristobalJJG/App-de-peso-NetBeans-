package pesoapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Nano
 */
public class FileThings {
    protected ArrayList<Clase> leer() throws FileNotFoundException, IOException {
        String cadena;
        ArrayList<Clase> res = new ArrayList<>();
        FileReader f = new FileReader("C:/Users/crist/OneDrive/Escritorio/PesoApp/log.txt");
        try (BufferedReader b = new BufferedReader(f)) {
            while((cadena = b.readLine())!=null) {
                String palabras[] = cadena.split("; ");
                if(cadena.equals("")){break;}
                res.add(new Clase(palabras[0], Double.parseDouble(palabras[1])));
            }
            f.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
	}
        return res;
    }  
        
    protected void escribir(ArrayList<Clase> list) {
	try {
            PrintWriter pw = new PrintWriter("C:/Users/crist/OneDrive/Escritorio/PesoApp/log.txt");
            for(int i = 0; i < list.size(); i++){ pw.write(list.get(i).getFecha() + "; " + list.get(i).getPeso() + "\n");}
            pw.close();
	} catch (IOException e) { System.out.println(e.getMessage());}
    }    
}
