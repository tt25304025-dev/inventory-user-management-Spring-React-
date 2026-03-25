package edu.TTss.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class InventoryModel {
    @Id
    @GeneratedValue
    private Long id;
    private String itemName;
    private String itemImage;
    private String itemCategory;
    private String itemQty;
    private String itemDetails;
}
