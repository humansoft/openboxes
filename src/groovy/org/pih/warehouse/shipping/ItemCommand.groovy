package org.pih.warehouse.shipping

import org.pih.warehouse.inventory.InventoryItem;
import org.pih.warehouse.product.Product;

class ItemCommand implements Serializable {
	
	Product product
	String lotNumber
	InventoryItem inventoryItem
	Shipment shipment
	ShipmentItem shipmentItem
	Integer quantity
	Integer quantityOnHand
	Integer quantityShipping
	Integer quantityReceiving
	
	
	static constraints = {
		product(nullable:true)
		lotNumber(nullable:true)
		inventoryItem(nullable:true)
		shipment(nullable:true)
		shipmentItem(nullable:true)
		quantity(nullable:true)
		quantityOnHand(nullable:true)
		quantityReceiving(nullable:true)
		quantityShipping(nullable:true)
		
	}
	
	
}
