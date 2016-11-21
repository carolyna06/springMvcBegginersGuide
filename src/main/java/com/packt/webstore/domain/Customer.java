package com.packt.webstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private String name;
	private String address;
	private int noOfOrdersMade;
	
	

    public Customer() { 
       super(); 
 } 

	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	

    public Customer(String customerId, String name, String address, int noOfOrdersMade ) { 
       this.customerId = customerId; 
       this.setName(name); 
       this.setAddress(address);
       this.setNoOfOrdersMade(noOfOrdersMade);
    } 

    // add setters and getters for all the fields here 

    @Override 
    public boolean equals(Object obj) { 
       if (this == obj) 
          return true; 
       if (obj == null) 
          return false; 
       if (getClass() != obj.getClass()) 
          return false; 
       Customer other = (Customer) obj; 
       if (customerId == null) { 
          if (other.customerId != null) 
             return false; 
       } else if (!customerId.equals(other.customerId)) 
          return false; 
       return true; 
    } 

    @Override 
    public int hashCode() { 
       final int prime = 31; 
       int result = 1; 
       result = prime * result 
             + ((customerId == null) ? 0 : 
                 customerId.hashCode()); 
       return result; 
    }
}
