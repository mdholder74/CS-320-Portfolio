package test;

import static org.junit.jupiter.api.Assertions.*;

import contact.ContactService;

import contact.Contact;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

  @Test
  public void AddContactTest() {
    ContactService phoneBook = new ContactService();
    Contact moe = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    
    assertDoesNotThrow(() -> {
      phoneBook.addContact(moe);
    });

  }

  @Test
  public void AddDuplicateContactTest() {
    ContactService phoneBook = new ContactService();
    Contact moe = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    Contact joe = new Contact("1", "Joe", "Johnson", "0987654321", "456 Real Rd");
    phoneBook.addContact(moe);
    assertThrows(IllegalArgumentException.class, () -> {
      phoneBook.addContact(joe);
    });
  }

  @Test
  public void DeleteContactTest() {
    ContactService phoneBook = new ContactService();
    Contact moe = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    phoneBook.addContact(moe);
    
    assertDoesNotThrow(() -> {
      phoneBook.deleteContact("1");
    });
  }

  @Test
  public void DeleteNonExistentContactTest() {
    ContactService phoneBook = new ContactService();
    assertThrows(IllegalArgumentException.class, () -> {
      phoneBook.deleteContact("1992");
    });
  }

  @Test
  public void UpdateContactTest() {
    ContactService phoneBook = new ContactService();
    Contact moe = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    phoneBook.addContact(moe);
    
    assertDoesNotThrow(() -> {
      phoneBook.updateContact("1", "Mahogany", null, null, null);
    });
  }

  @Test
  public void UpdateNonExistentContactTest() {
    ContactService phoneBook = new ContactService();
    assertThrows(IllegalArgumentException.class, () -> {
      phoneBook.updateContact("1992", "Mahogany", null, null, null);
    });
  }
}
