package com.emrah.Banking.App.mapper;

import com.emrah.Banking.App.dto.AccountDto;
import com.emrah.Banking.App.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
          accountDto.getId(),
          accountDto.getAccountHoldername(),
          accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
