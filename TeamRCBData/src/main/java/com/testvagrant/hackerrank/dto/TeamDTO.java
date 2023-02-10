package com.testvagrant.hackerrank.dto;


public class TeamDTO {
	 private String country;
	 private String role;
	 private int count;

	    public TeamDTO() {
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setcountry(String country) {
	        this.country = country;
	    }
	    
	    public String getrole() {
	        return role;
	    }

	    public void setrole(String role) {
	        this.role = role;
	    }
	    public int getNoofForeigners() {
	        return count;
	    }

	    public void setNoofForeigners(int count) {
	        this.count = count;
	    }


}
