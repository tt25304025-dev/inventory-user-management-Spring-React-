package edu.TTss.Repository;

import edu.TTss.model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository  extends JpaRepository<InventoryModel,Long> {
    
}
