package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="player_table")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@Column(nullable = false, name="name")
	private String playerName;
	
	
	
	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int playerId, String playerName) {
		this.playerId=playerId;
		this.playerName=playerName;
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
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
	

}
