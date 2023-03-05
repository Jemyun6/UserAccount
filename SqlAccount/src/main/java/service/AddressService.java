package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Address;
import repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;
	
	public Address save(Address address) {
		return addressRepo.save(address);
	}

}
