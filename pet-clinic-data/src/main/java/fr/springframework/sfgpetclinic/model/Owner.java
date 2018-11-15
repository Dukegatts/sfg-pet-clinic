package fr.springframework.sfgpetclinic.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner extends Person
{
	private Set<Pet> pets;
}
