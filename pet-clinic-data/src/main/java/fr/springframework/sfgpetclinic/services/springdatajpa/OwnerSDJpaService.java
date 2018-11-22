package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Owner;
import fr.springframework.sfgpetclinic.repositories.OwnerRepository;
import fr.springframework.sfgpetclinic.repositories.PetRepository;
import fr.springframework.sfgpetclinic.repositories.PetTypeRepository;
import fr.springframework.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService
	implements OwnerService
{
	private final OwnerRepository ownerRepository;

	private final PetRepository petRepository;

	private final PetTypeRepository petTypeRepository;

	@Autowired
	public OwnerSDJpaService(final OwnerRepository ownerRepository,
							 final PetRepository petRepository,
							 final PetTypeRepository petTypeRepository)
	{
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Owner findByLastTime(final String lastName)
	{
		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Set<Owner> findAll()
	{
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(final Long aLong)
	{
		return ownerRepository.findById(aLong).orElse(null);
	}

	@Override
	public Owner save(final Owner object)
	{
		return ownerRepository.save(object);
	}

	@Override
	public void delete(final Owner object)
	{
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		ownerRepository.deleteById(aLong);
	}
}
