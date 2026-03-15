package com.Encapsulation;

public class StockpriceProduct {

	public int updateStock(Product p, int quantity) {
		int upstckqunty = p.getStockQuantity() + quantity;
		return upstckqunty;

	}

	public int sellStock(Product p, int quantity) {
		if (p.getStockQuantity() >= quantity) {

			int upstckqunty = p.getStockQuantity() - quantity;
			return upstckqunty;
		} else {
			return 0;
		}

	}

	public int sellprod(Product p, int quantity) {
		if (p.getPrice() > 0) {
			int prodPrice = p.getPrice() * quantity;
			return prodPrice;
		} else {
			System.out.println("give valid price");
			return 0;
		}
	}

	public static void main(String[] args) {
		Product p = new Product();
		StockpriceProduct l = new StockpriceProduct();
		p.setPrice(100);
		p.setProductId(10001);
		p.setProductName("Note Book");
		p.setStockQuantity(5);
		System.out.println("-------Product Details----------");
		System.out.println(p.getPrice());
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getStockQuantity());
		System.out.println();
		System.out.println("================================================");
		// --------------------------------------
		int upstckqunty = l.updateStock(p, 5);
		p.setStockQuantity(upstckqunty);

		System.out.println("-------Updated Product Details----------");
		System.out.println(p.getPrice());
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getStockQuantity());
		System.out.println();
		System.out.println("================================================");
		// --------------------------------
		int upsellstckqunty = l.sellStock(p, 3);
		p.setStockQuantity(upsellstckqunty);

		System.out.println("-------After Selling Product Details----------");
		System.out.println(p.getPrice());
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getStockQuantity());
		System.out.println();
		System.out.println("================================================");

		int prodprice = l.sellprod(p, 3);
		System.out.println("Total products cost" + prodprice);

	}

}