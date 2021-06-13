package Logic;

import Persistence.PersistenceController;
import java.util.Date;
import java.util.List;

public class InventoryController {

    PersistenceController con = new PersistenceController();
    Inventory inventory = new Inventory();
    

    public void createData(String itemName, int item_num, int itemCode, String itemType, Date date) {
        
        inventory.setItem_name(itemName);
        inventory.setItem_num(item_num);
        inventory.setItem_code(itemCode);
        inventory.setItem_type(itemType);
        inventory.setDate(date);
        
        con.createInventory(inventory);

    }

    // fix this-- this is not in used
    
    public void getAllItem() {
        PersistenceController con = new PersistenceController();
        List<Inventory> inventoryList = con.getAllData();
        for (Inventory in : inventoryList) {
            in.getItem_name();
            System.out.println(">" + in.getItem_name());
        }

    }

    public void updateInventory(String id, Date itemDate, int code, String itemName, int itemNum, String itemType) {
        inventory.setId(Long.parseLong(id));
        inventory.setDate(itemDate);
        inventory.setItem_code(code);
        inventory.setItem_name(itemName);
        inventory.setItem_num(itemNum);
        inventory.setItem_type(itemType);
             
        con.updateStackedData(inventory);
    }

    public void deletItem(String id) {
        con.deleteAItem(Long.parseLong(id));
    }

}
