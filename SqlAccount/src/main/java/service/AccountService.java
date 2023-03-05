package service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Account;
import repository.AccountRepository;


@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepo;
	
	public Account save(Account account) {
		return accountRepo.save(account);
	}
	
	public Account findById(Long accountId) {
		Optional<Account> accountOpt = accountRepo.findById(accountId);
		return accountOpt.orElse(new Account());
	}
	

}
