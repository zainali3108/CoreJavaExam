package javaleads.lesson2;

public interface product {
	interface bicyle {
		  public void productname(); 
		  public void quantity(); 
		}

	
		class addStock implements product {
		  public void productname() {
		    
		    System.out.println("The productname is : bicycle");
		  }
		  public void quantity() {
		 
		    System.out.println("three");
		  }
		}

		class InterfaceEx {
		  public static void main(String[] args) {
		    addStock addStock = new addStock();  
		    addStock.productname();
		    addStock.quantity();
		  }
		}

}
