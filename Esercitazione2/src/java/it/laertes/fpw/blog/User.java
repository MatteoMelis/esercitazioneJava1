/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.blog;

/**
 *
 * @author melis
 */

public class User {
	
	//ATTRIBUTI
	public void setUrlProfImg(String urlProfImg) {
		this.urlProfImg = urlProfImg;
	}
	
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String urlProfImg;
	
	//COSTRUTTORE CLASSE User
	public User (){
		this.id = 0;
		this.name = "pippo";
		this.surname = "topolino";
		this.email = "mailfalsa@topolino.it";
		this.password = "password";
		this.urlProfImg = "";
	}
	
	
	//METODI getter e setter (pubblici che permettono l'accesso e la modifica degli attributi privati)
	//generati automaticamente: evidenzia gli attributi, insert code, getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlProfImg() {
		return urlProfImg;
	}
	
	
	//ALTRI METODI
	public boolean equals(User otherUser){
		return this.id == otherUser.getId();
	}
	
	
}
