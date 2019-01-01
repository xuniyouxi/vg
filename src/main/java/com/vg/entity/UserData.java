package com.vg.entity;

import java.io.Serializable;
import java.util.Date;

public class UserData implements Serializable {
	private Integer user_id;
	private String user_realname;
	private String user_name;
	private String user_wxcode;
	private String user_pay_password;
	private Integer authorization_code;
	private String user_equipment_id1;
	private String user_equipment_id2;
	private String invite_code;
	private String user_address;
	private String user_head_picture;
	private double user_balance;
	private int pool_usedCapacity;
	private Integer pool_rank;
	private Integer user_vip;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_realname() {
		return user_realname;
	}

	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_wxcode() {
		return user_wxcode;
	}

	public void setUser_wxcode(String user_wxcode) {
		this.user_wxcode = user_wxcode;
	}

	public String getUser_pay_password() {
		return user_pay_password;
	}

	public void setUser_pay_password(String user_pay_password) {
		this.user_pay_password = user_pay_password;
	}

	public Integer getAuthorization_code() {
		return authorization_code;
	}

	public void setAuthorization_code(Integer authorization_code) {
		this.authorization_code = authorization_code;
	}

	public String getUser_equipment_id1() {
		return user_equipment_id1;
	}

	public void setUser_equipment_id1(String user_equipment_id1) {
		this.user_equipment_id1 = user_equipment_id1;
	}

	public String getUser_equipment_id2() {
		return user_equipment_id2;
	}

	public void setUser_equipment_id2(String user_equipment_id2) {
		this.user_equipment_id2 = user_equipment_id2;
	}

	public String getInvite_code() {
		return invite_code;
	}

	public void setInvite_code(String invite_code) {
		this.invite_code = invite_code;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_head_picture() {
		return user_head_picture;
	}

	public void setUser_head_picture(String user_head_picture) {
		this.user_head_picture = user_head_picture;
	}

	public double getUser_balance() {
		return user_balance;
	}

	public void setUser_balance(double user_balance) {
		this.user_balance = user_balance;
	}

	public int getPool_usedCapacity() {
		return pool_usedCapacity;
	}

	public void setPool_usedCapacity(int pool_usedCapacity) {
		this.pool_usedCapacity = pool_usedCapacity;
	}

	public Integer getPool_rank() {
		return pool_rank;
	}

	public void setPool_rank(Integer pool_rank) {
		this.pool_rank = pool_rank;
	}

	public Integer getUser_vip() {
		return user_vip;
	}

	public void setUser_vip(Integer user_vip) {
		this.user_vip = user_vip;
	}

	public UserData(Integer user_id, String user_realname, String user_name, String user_wxcode,
			String user_pay_password, Integer authorization_code, String user_equipment_id1, String user_equipment_id2,
			String invite_code, String user_address, String user_head_picture, double user_balance,
			int pool_usedCapacity, Integer pool_rank, Integer user_vip) {
		super();
		this.user_id = user_id;
		this.user_realname = user_realname;
		this.user_name = user_name;
		this.user_wxcode = user_wxcode;
		this.user_pay_password = user_pay_password;
		this.authorization_code = authorization_code;
		this.user_equipment_id1 = user_equipment_id1;
		this.user_equipment_id2 = user_equipment_id2;
		this.invite_code = invite_code;
		this.user_address = user_address;
		this.user_head_picture = user_head_picture;
		this.user_balance = user_balance;
		this.pool_usedCapacity = pool_usedCapacity;
		this.pool_rank = pool_rank;
		this.user_vip = user_vip;
	}

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
