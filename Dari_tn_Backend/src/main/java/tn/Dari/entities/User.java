package tn.Dari.entities;

import java.util.List;

import javax.persistence.*;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Getter @Setter @ToString
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long  idU;
	private String name;
	private String lastName;
	@Column(unique=true)
	private String email;
	private String password;
	private String phone;

	public User(String name, String lastName, String email, String password, String phone) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
}
