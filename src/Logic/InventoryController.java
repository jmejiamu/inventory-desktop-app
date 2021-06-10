
package Logic;

import Persistence.PersistenceController;
import java.util.Date;
import java.util.List;

public class InventoryController {

    public void createData(String itemName, int item_num, int itemCode, String itemType, Date date) {
        Inventory inventory = new Inventory(itemName, item_num, itemCode, date, itemType);
        
        PersistenceController con =  new PersistenceController();
        con.createInventory(inventory);
        
        
        
        
    }
    // fix this
    public void getAllItem() {
        PersistenceController con =  new PersistenceController();
        List<Inventory> inventoryList = con.getAllData();
        for(Inventory in : inventoryList){
            in.getItem_name();
            System.out.println("<><><" + in.getItem_name());
        }
        
    }
    
    
    
}
