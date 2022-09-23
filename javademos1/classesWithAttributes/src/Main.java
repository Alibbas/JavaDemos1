
public class Main {

	public static void main(String[] args) {
		Product product = new Product(11,"Laptop","Monster",5300,10,"gri");
		
		
//		Parametreli constructor sayesinde teker teker deðer vermek yerine
// 		üstteki gibi kolay kullaným olur.		
//		product.setName("Laptop");
//		product.setId(11);
//		product.setDescription("Monster Laptop");
//		product.setPrice(5300);
//		product.setStockAmount(10);
//		product.setRenk("");
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
