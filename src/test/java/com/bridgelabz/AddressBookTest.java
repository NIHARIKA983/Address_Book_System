package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class AddressBookTest {

    @Test
    public void givenContactInAddressBookReturnTrue() {
        AddressBook addressBook = new AddressBook();
        ContactInfo contacts = new ContactInfo("Niharika", "Gowda", "Balehonnur", "Chikmagalur", "Karnataka", 577112, 277587802, "niharikagowda1996@gmail.com");
        boolean result = addressBook.addContacts(contacts);
        Assertions.assertTrue(result);
    }
}