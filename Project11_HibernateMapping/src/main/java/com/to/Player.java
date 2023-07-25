package com.to;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@Column(nullable = false)
	private String playerName;
//	@OneToOne
//	private Team team;
	@OneToMany
	List<Team> teamList = new ArrayList<>();
	private int age;
	
	
	public Player() {
		super();
	}
	
	
//	public Player(String playerName, Team team, int age) {
//		super();
//		this.playerName = playerName;
//		this.team = team;
//		this.age = age;
//	}


	public Player(String playerName, List<Team> teamList, int age) {
		super();
		this.playerName = playerName;
		this.teamList = teamList;
		this.age = age;
	}


	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
//	public Team getTeam() {
//		return team;
//	}
//	public void setTeam(Team team) {
//		this.team = team;
//	}
	
	public List<Team> getTeamList() {
		return teamList;
	}


	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
