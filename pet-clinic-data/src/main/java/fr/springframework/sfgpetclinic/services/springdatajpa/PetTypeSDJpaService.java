package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.PetType;
import fr.springframework.sfgpetclinic.repositories.PetTypeRepository;
import fr.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService
{
	private final PetTypeRepository petTypeRepository;

	@Autowired
	public PetTypeSDJpaService(final PetTypeRepository petTypeRepository)
	{
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll()
	{
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(final Long aLong)
	{
		return petTypeRepository.findById(aLong).orElse(null);
	}

	@Override
	public PetType save(final PetType object)
	{
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(final PetType object)
	{
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		petTypeRepository.deleteById(aLong);
	}
}
