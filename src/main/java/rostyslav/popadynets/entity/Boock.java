package rostyslav.popadynets.entity;

import java.math.BigDecimal;

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
@Table(name = "boock")
@Getter @Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Boock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "title" , length = 120 , nullable = false , unique = true)
	private String title;
    
    @Column(name = "description" , nullable = false , columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "number_of_boock" , nullable = false, unique = true)
    private String numberOfBoock;

    @Column(name = "price", columnDefinition = "DECIMAL(5,2)", nullable = false)
    private BigDecimal price;
    
}
