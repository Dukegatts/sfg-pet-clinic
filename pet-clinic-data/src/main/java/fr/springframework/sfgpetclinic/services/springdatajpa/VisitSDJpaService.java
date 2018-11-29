package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Visit;
import fr.springframework.sfgpetclinic.repositories.VisitRepository;
import fr.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService
{
	private final VisitRepository visitRepository;

	@Autowired
	public VisitSDJpaService(final VisitRepository visitRepository)
	{
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll()
	{
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(final Long aLong)
	{
		return visitRepository.findById(aLong).orElse(null);
	}

	@Override
	public Visit save(final Visit object)
	{
		return visitRepository.save(object);
	}

	@Override
	public void delete(final Visit object)
	{
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		visitRepository.deleteById(aLong);
	}
}
