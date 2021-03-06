package com.vg.entity;

import java.io.Serializable;

public class UserTeam implements Serializable {
	private String user_id;

	private Integer team_id;

	private String invited_father;

	private Integer invited_sum;

	private Integer member_layer;

	private Integer invited_son;

	private Double invited_bonus;

	private Double invited_today_bonus;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getInvited_father() {
		return invited_father;
	}

	public void setInvited_father(String invited_father) {
		this.invited_father = invited_father;
	}

	public Integer getInvited_sum() {
		return invited_sum;
	}

	public void setInvited_sum(Integer invited_sum) {
		this.invited_sum = invited_sum;
	}

	public Integer getMember_layer() {
		return member_layer;
	}

	public void setMember_layer(Integer member_layer) {
		this.member_layer = member_layer;
	}

	public Integer getInvited_son() {
		return invited_son;
	}

	public void setInvited_son(Integer invited_son) {
		this.invited_son = invited_son;
	}

	public Double getInvited_bonus() {
		return invited_bonus;
	}

	public void setInvited_bonus(Double invited_bonus) {
		this.invited_bonus = invited_bonus;
	}

	public Double getInvited_today_bonus() {
		return invited_today_bonus;
	}

	public void setInvited_today_bonus(Double invited_today_bonus) {
		this.invited_today_bonus = invited_today_bonus;
	}

	public UserTeam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserTeam(String user_id, Integer team_id, String invited_father, Integer invited_sum, Integer member_layer,
			Integer invited_son, Double invited_bonus, Double invited_today_bonus) {
		super();
		this.user_id = user_id;
		this.team_id = team_id;
		this.invited_father = invited_father;
		this.invited_sum = invited_sum;
		this.member_layer = member_layer;
		this.invited_son = invited_son;
		this.invited_bonus = invited_bonus;
		this.invited_today_bonus = invited_today_bonus;
	}
	
	

}