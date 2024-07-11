package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAcount(String mobileNumber);

    /**
     * 
     * @param customerDto - customerDto Object
     * @return boolean indicating if the udpate of Account details is successfull or not
     */
    boolean udpateAccount(CustomerDto customerDto);


    /**
     * 
     * @param mobileNumber - cInput Mobile Number
     * @return boolean indicating if the delete of Account details is successfull or not   
     */
    boolean deleteAccount(String mobileNumber);
}
