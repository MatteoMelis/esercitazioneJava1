/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.laertes.fpw.blog;

import java.util.ArrayList;

/**
 *
 * @author melis
 */

/*Vogliamo un singolo punto dove posso accedere alla lista di tutti gli utenti e che sia anche in grado di creare nuovi utenti*/

public class UserFactory {
	
	/**
	*	FACTORY IMPLEMENTATA CON PATTERN SINGLETON
	*		COSA FA IL PATTERN SINGLETON ???
	*		- prevede che una classe possa aver un solo oggetto e che questo stesso oggetto possa essere visibile fuori dalla classe
	*/ 
	
	private static UserFactory instance; //static perchè deve essere uguale in ogni classe
	private ArrayList<User> userList = new ArrayList<User>(); //Java Generics: fa una classe che può prendere tipi diversi <per forza di tipo User> --Attenzione: import java.util.ArrayList
	
	//COSTRUTTORE: privato perchè nessun altro deve poter fare istanze di questa classe ed avere tutti gli utenti su una lista
	private UserFactory (){
		User user1 = new User();
		user1.setId(0);
		user1.setName("nomefalso");
		user1.setSurname("cognomefalsissimo");
		user1.setEmail("emailmoltofalsa@google.it");
		user1.setPassword("passwordbrutta");
		user1.setUrlProfImg("img/profileimgnomefalso.png");
		
		User user2 = new User();
		user2.setId(1);
		user2.setName("pippo");
		user2.setSurname("paperino");
		user2.setEmail("pippopaperino@google.it");
		user2.setPassword("passwordbrutta");
		user2.setUrlProfImg("img/profileimgpippopaperino.png");
		
		User user3 = new User();
		user3.setId(2);
		user3.setName("donald");
		user3.setSurname("trump");
		user3.setEmail("imrichbitch@trump.cia");
		user3.setPassword("123");
		user3.setUrlProfImg("img/trumpstar.png");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
	}
	
	//METODI
	//controlla che se non c'è un istanza la crea, e se esiste già non permette di crearla
	public static UserFactory getInstance (){ 
		if (instance == null)
			instance = new UserFactory();
		
		return instance;
	}
	
	public ArrayList<User> getUser(){
		return userList;
	}
	
	public User getUserById (int id){
		for (User user : userList){
			if (user.getId() == id)
				return user;
		}
		
		return null;
	}
	
	
	
	
} 
