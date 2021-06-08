
package Logic;

import GUI.MainWindow;
import Persistence.PersistenceController;
import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        
        //Creation of the main window object
        MainWindow mainWindow =  new MainWindow();
        
        //Display window 
        mainWindow.setVisible(true);
        
         //Center window
        mainWindow.setLocationRelativeTo(null);
        
        Inventory inventory = new Inventory("test", 0, 0, new Date("06/06/1991"), "electronics");
        
        PersistenceController con =  new PersistenceController();
        con.createInventory(inventory);
    }
    
}
