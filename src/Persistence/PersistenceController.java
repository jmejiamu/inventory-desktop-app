
package Persistence;

import Logic.Inventory;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    
    InventoryJpaController inventoryJpa =  new InventoryJpaController();
    
    public void createInventory(Inventory inventory){
        inventoryJpa.create(inventory);
    }

    public List<Inventory> getAllData() {
        List<Inventory> inventoryList = inventoryJpa.findInventoryEntities();
        return inventoryList;
    }

    public void updateStackedData(Inventory inventory) {
        try {
            inventoryJpa.edit(inventory);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
