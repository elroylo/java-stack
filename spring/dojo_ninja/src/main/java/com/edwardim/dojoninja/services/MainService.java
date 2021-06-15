package com.edwardim.dojoninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edwardim.dojoninja.models.Dojo;
import com.edwardim.dojoninja.models.Ninja;
import com.edwardim.dojoninja.repositories.DojoRepository;
import com.edwardim.dojoninja.repositories.NinjaRepository;

@Service
public class MainService {
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;

	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos(){
		return this.dojoRepo.findAll();
	}

	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}

	public Dojo getDojoById(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
	public List<Ninja> getNinjasNotInDojo(Dojo dojo){
		return this.ninjaRepo.findByDojoNot(dojo);
	}
}
