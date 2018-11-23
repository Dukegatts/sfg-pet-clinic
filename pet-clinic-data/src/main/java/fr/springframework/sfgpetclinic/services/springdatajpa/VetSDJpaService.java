package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Vet;
import fr.springframework.sfgpetclinic.repositories.VetRepository;
import fr.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService
{
	private final VetRepository vetRepository;

	@Autowired
	public VetSDJpaService(final VetRepository vetRepository)
	{
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll()
	{
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(final Long aLong)
	{
		return vetRepository.findById(aLong).orElse(null);
	}

	@Override
	public Vet save(final Vet object)
	{
		return vetRepository.save(object);
	}

	@Override
	public void delete(final Vet object)
	{
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		vetRepository.deleteById(aLong);
	}
}
