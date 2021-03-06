package fr.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity
{
	public Person(final Long id, final String firstName, final String lastName)
	{
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
}
