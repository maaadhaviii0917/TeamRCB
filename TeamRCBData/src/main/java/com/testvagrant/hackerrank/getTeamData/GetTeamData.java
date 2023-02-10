package com.testvagrant.hackerrank.getTeamData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import com.testvagrant.hackerrank.utils.*;
import com.testvagrant.hackerrank.dto.TeamDTO;

public class GetTeamData {
	
	TeamDTO data;
	JSONArray players;
	
	public GetTeamData(TeamDTO data,String teamname) {
		this.data= data;
		players= new JSONArray();
		getPlayers(teamname);
		
	}
	
	//getPlayersJsonArrayFromTeamRCB.JSONFile
	public JSONArray getPlayers(String teamName){	
		JSONObject teamInfo=JsonFileReader.readInputJsonFile("TeamRCB");
		try {
			players=new JSONArray();
			players = (JSONArray) teamInfo.get("player");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return players;
    }
	
	//getTotalForeignersCount from the Players JSonArray
	public void noOfPlayersInCountry(String country) {
		int count=0;
		try {
			
		for(int i=0;i<players.length();i++) {
			JSONObject obj=players.getJSONObject(i);
				if((!obj.isNull("country"))&& (obj.get("country")!=country))
					count=count+1;
		}
		data.setNoofForeigners(count);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//getTotalForeignersCount from the Players JSonArray
		public boolean isPlayerRolePresent(String role) {
			try {
			for(int i=0;i<players.length();i++) {
				JSONObject obj=players.getJSONObject(i);
					if((!obj.isNull("role"))&& (obj.get("role").equals(role)))
						return true;
			}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
}
