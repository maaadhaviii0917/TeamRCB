package com.testvagrant.hackerrank.dto;


public class TeamDTO {
	 private String country;
	 private String role;
	 private int count;
	 private String playerName;
	 private String price;

	    public TeamDTO() {
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }
	    
	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }
	    public int getNoofForeigners() {
	        return count;
	    }

	    public void setNoofForeigners(int count) {
	        this.count = count;
	    }
	    
	    public String getplayerName() {
	        return playerName;
	    }

	    public void setplayerName(String playerName) {
	        this.playerName = playerName;
	    }
	    public String getPrice() {
	        return price;
	    }

	    public void setPrice(String price) {
	        this.price = price;
	    }


}
