package pesoapp;

import java.io.IOException;
import java.util.ArrayList;

public class PesoApp {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        ArrayList<Clase> list = new ArrayList<>();
        FileThings ft = new FileThings();
        list = ft.leer();
        
        new InterfazPrincipal(list);
        
    }   
}
