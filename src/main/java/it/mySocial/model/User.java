package it.mySocial.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String messaggio;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	public User(int id, String name, String email, String messaggio) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.messaggio = messaggio;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param email
	 * @param messagigo
	 */
}