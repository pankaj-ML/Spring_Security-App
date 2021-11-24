package App.spring.controller.dto;

public class UserRegistrationDto {
	private String Name;
	private String designation;
	private String email;
	private String password;
	
	public UserRegistrationDto(){
		
	}

	
	public UserRegistrationDto(String name, String designation, String email, String password) {
		super();
		Name = name;
		this.designation = designation;
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
	
	
}
