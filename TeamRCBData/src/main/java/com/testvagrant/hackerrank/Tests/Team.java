package com.testvagrant.hackerrank.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testvagrant.hackerrank.dto.TeamDTO;
import com.testvagrant.hackerrank.getTeamData.GetTeamData;
import com.testvagrant.hackerrank.utils.PropertiesFileReader;

public class Team {
	
	TeamDTO data;
	GetTeamData teamData;
	PropertiesFileReader testProperties;
	
	@BeforeClass(alwaysRun = true)
	public void initializeObject() {
		testProperties = new PropertiesFileReader();
		testProperties.loadProperties("rcb");
		data=new TeamDTO();
		teamData= new GetTeamData(data, testProperties.getValue("teamname"));		
	}
	
		
	@Test(description="get Total players in a Team other than india ")
	public void validateForeignPlayers() {
		teamData.noOfPlayersInCountry(testProperties.getValue("nativeCountry"));
		testProperties.getValue("expnoForiegnPlayers");
		Assert.assertEquals(data.getNoofForeigners(), testProperties.getValue("expnoForiegnPlayers"), "no of Foreign players ");
	}
	
	@Test(description="check a team consists atleast one wicketkeeper ")
	public void isWicketKeeperPresent() {
		Assert.assertTrue(teamData.isPlayerRolePresent(testProperties.getValue("exprole")),"wicket-keepers");
		
	}

}
