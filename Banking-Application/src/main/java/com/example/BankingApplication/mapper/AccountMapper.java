package com.example.BankingApplication.mapper;

import com.example.BankingApplication.dto.AccountDto;
import com.example.BankingApplication.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );

        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto= new AccountDto(

                account.getId(),
                account.getAccountHolder(),
                account.getBalance()
        );
        return accountDto;
    }
}
