package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Pet;
import fr.springframework.sfgpetclinic.repositories.PetRepository;
import fr.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService
	implements PetService
{
	private final PetRepository petRepository;

	@Autowired
	public PetSDJpaService(final PetRepository petRepository)
	{
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll()
	{
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(final Long aLong)
	{
		return petRepository.findById(aLong).orElse(null);
	}

	@Override
	public Pet save(final Pet object)
	{
		return petRepository.save(object);
	}

	@Override
	public void delete(final Pet object)
	{
		petRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		petRepository.deleteById(aLong);
	}
}
