
package Logic;

import Persistence.PersistenceController;
import java.util.Date;

public class Item {

    public void createData(String itemName, int item_num, int itemCode, String itemType, Date date) {
        Inventory inventory = new Inventory(itemName, item_num, itemCode, date, itemType);
        
        PersistenceController con =  new PersistenceController();
        con.createInventory(inventory);
        
        
    }
    
}
