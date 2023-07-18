package com.intern.carRental.primary;
import java.util.*;

import com.intern.DAO.VehicleRepository;
import com.intern.carRental.primary.abstrct.Vehicle;
import com.intern.carRental.primary.intrfces.Search;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VehicleInventory implements Search{
	
	private Map<String,Vehicle> vehicleTypeIndex;
	private Map<String,Vehicle> vehicleModelIndex;
	private Date creationDate;
	
	private Vehicle vehicle;
	
	
	
	private VehicleRepository vehicleRepo;
	
	private ArrayList<Vehicle> allVehicles = (ArrayList<Vehicle>) vehicleRepo.findAll();
	/*
	for(int i=0;i<allVehicles.size();i++) {
		if (allVehicles[i] instanceof Car
				||allVehicles[i] instanceof Truck
				||allVehicles[i] instanceof SUV
				||allVehicles[i] instanceof Motorcycle
				||allVehicles[i] instanceof Van) {
				
		}
	}
		/*
		ArrayList<Vehicle> modelVehicles = vehicleRepo.findAllByModel(model);

		ArrayList<Vehicle> searchedVehicles = new ArrayList<>();
		
		for(Vehicle vehicle: modelVehicles)
		{
			if (vehicle instanceof Car) {
				Car newVehicle = (Car) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof Motorcycle) {
				Motorcycle newVehicle = (Motorcycle) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof Truck) {
				Truck newVehicle = (Truck) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof SUV) {
				SUV newVehicle = (SUV) vehicle;
				searchedVehicles.add(newVehicle);
			}

			if (vehicle instanceof Van) {
				Van newVehicle = (Van) vehicle;
				searchedVehicles.add(newVehicle);
			}
		}
		return searchedVehicles;
	}
	*/
	
	
	@Override
	public ArrayList<String> searchByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<String> searchByModel(String model) {
		
		
		return null;
	}
		
}


/*
 	//Add product to cart via Name
	public void addProductvianame(String NAME, int quantity){    
		int flag=0;
		List<Product> prodlst=new ArrayList<Product>();
		file_handling fh=new file_handling();
		prodlst=fh.reader();
		for(Product srch: prodlst) {
			if(srch.getName().equalsIgnoreCase(NAME)) {
				if(srch.getProductid().equalsIgnoreCase(srch.getProductid())){
					if(Items.containsKey(srch.getProductid().toUpperCase())) {
						for(Map.Entry<String, Integer> prdcrt:Items.entrySet()){    
					           if(prdcrt.getKey().equalsIgnoreCase(srch.getProductid())) {
					        	   quantity+=prdcrt.getValue();
					        	   removeProduct(srch.getProductid());
					           	}
							}
						}
				}
				Items.put(srch.getProductid(), quantity);
				System.out.println("Product with Product-Name:"+ srch.getName()+" was succesfully added to cart with its quantity set to: "+quantity);
				itemprint(srch, quantity);
				flag=1;
				break;
				}
			}
		if(flag==0) {
			System.out.println("Product-Name entered was wrong, Please enter again");
			addproductchoice();
		}
	} 
	
	
		//Method to get details of the Cart: Total Price and Total Quantity
	public String getDetails() {
		int Total_val=0;
		int Total_items=0;
		for(Map.Entry<String, Integer> x:Items.entrySet()){    
			List<Product> prodlst=new ArrayList<Product>();
			file_handling fh=new file_handling();
			prodlst=fh.reader();
			Total_items+=x.getValue();
			for(Product srch: prodlst) {
				if(srch.getProductid().equals(x.getKey())) {
					Total_val+=srch.getPrice()*x.getValue();
					continue;
					}
				}
	          }
		details="Cart Details:\n"+"\tTotal Price of the Cart is: "+Total_val+"INR\n\tTotal number of Items are: "+Total_items+"\n";
		customr.getCart().setDetails(details);
		return details;
	}

	public void setDetails(String details){
		this.details.concat(details);
	}
	
	
	
	
		//Method to remove the Product from the Cart and the Draft Invoice

	public void removeProduct(String Prdctid){
		for(Map.Entry<String, Integer> prdcrt:Items.entrySet()){    
	           System.out.println(prdcrt.getKey()+" "+prdcrt.getValue());
	           if(prdcrt.getKey().equalsIgnoreCase(Prdctid)) {
	        	   Items.remove(prdcrt.getKey(),prdcrt.getValue());
	           for(int i=0;i<invoicestr.size();i++){
	        	   if(invoicestr.get(i).contains(Prdctid.toUpperCase()))
	        	      invoicestr.remove(i);
	            }
	   		   System.out.println("Product with Product-Id: "+ Prdctid +" was deleted successfully");
	           break;
	           }
	     }
	}
  */
  
  
  