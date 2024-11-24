public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0; 
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added."); 
        } else {
            System.out.println("The cart is full.");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
    	if (dvdList.length < MAX_NUMBERS_ORDERED) {
    		for (int i = 0; i < dvdList.length; i++) {
    			itemsOrdered[qtyOrdered] = dvdList[i];
    			qtyOrdered++;
    			System.out.println("The disc \"" + dvdList[i].getTitle() + " has been added!");
    		}
    	} else {
            System.out.println("The cart is full.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        DigitalVideoDisc [] dvdList = {dvd1, dvd2};
        addDigitalVideoDisc(dvdList);
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the cart.");
                return; 
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" not found in cart.");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}