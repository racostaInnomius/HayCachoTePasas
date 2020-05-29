package com.mx.cdmx.cacho;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a MyCart class, 
 * with the following features
 * add products to the cart
 * remove products from the cart
 * display everything in the cart
 * search for a particular product
 * 
 * 
 */
public class TodayTest {

	List<Product> myCart = new ArrayList<>();
	
	public List<Product> addProduct(Product product){
		myCart.add(product);
		return myCart;
	}
	
	public List<Product> removeProduct(int id){
		myCart.remove(id);
		return myCart;
	}
	
	public List<Product> getProducts(){
		return myCart;
	}
	public Product searchProduct(int id){
		return myCart.get(id);
	}
	
	public static void main(String[] args) {
		TodayTest cart = new TodayTest();
		cart.addProduct(new Product("Apple","12"));
		cart.addProduct(new Product("Banana","13"));
		cart.addProduct(new Product("Oranges","14"));
		
		System.out.println(cart.getProducts());
        // cart.removeProduct(id);//Managoes
        // cart.removeProduct(id); //Banana
        
        
	}
}

class Product{
	String name;
	String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Product(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	
}
