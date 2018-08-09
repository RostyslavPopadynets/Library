package rostyslav.popadynets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@Getter @Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name" , length = 30 , nullable = false)
	private String firstName;
	
	@Column(name = "last_name" , length = 30 , nullable = false)
	private String lastName;

	@Column(name = "email" , length = 120 , nullable = false , unique = true)
	private String email;
	
	@Column(name = "age")
	private String age;
}
