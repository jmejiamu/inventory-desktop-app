
package Persistence;

import Logic.Inventory;
import Persistence.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    
    InventoryJpaController inventoryJpa =  new InventoryJpaController();
    
    public void createInventory(Inventory inventory){
        inventoryJpa.create(inventory);
    }
    
}
