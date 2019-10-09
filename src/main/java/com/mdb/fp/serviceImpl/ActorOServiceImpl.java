package com.mdb.fp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdb.fp.model.ActorO;
import com.mdb.fp.repo.ActorORepo;
import com.mdb.fp.service.ActorOService;

@Service("actorOService")
public class ActorOServiceImpl implements ActorOService {

	@Autowired
	private ActorORepo actorRepo;

	@Override
	public List<ActorO> getAllActors() {
		// TODO Auto-generated method stub
		return actorRepo.findAll();
	}
	
	
}
