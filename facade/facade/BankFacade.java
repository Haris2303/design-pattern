package facade.facade;

import facade.entity.Account;
import facade.repository.AccountRepository;

public class BankFacade {

    private AccountRepository accountRepository = new AccountRepository();

    // transfer from account1 to account2
    public void transfer(String fromAccountNo, String toAccountNo, Long amount) {
        Account account1 = accountRepository.findById(fromAccountNo);
        Account account2 = accountRepository.findById(toAccountNo);

        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        accountRepository.update(account1);
        accountRepository.update(account2);
    }
}
