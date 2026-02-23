package test;

import static org.junit.jupiter.api.Assertions.*;

import contact.Contact;

import org.junit.jupiter.api.Test;

class ContactTest {

  @Test
  public void ConstructorTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    assertEquals("1", contact.getContactId());
    assertEquals("Moe", contact.getFirstName());
    assertEquals("Holder", contact.getLastName());
    assertEquals("1234567890", contact.getPhoneNumber());
    assertEquals("123 Fake St", contact.getAddress());
  }
  
  @Test
  public void ContactIdNotUpdatableTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    assertEquals("1", contact.getContactId());
  }
  
  @Test
  public void InvalidContactIdTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact(null, "Moe", "Holder", "1234567890", "123 Fake St");
    });
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1234567890123", "Moe", "Holder", "1234567890", "123 Fake St");
    });
  }
  
  @Test
  public void InvalidFirstNameTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", null, "Holder", "123456789", "123 Fake St");
      });
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Thisfirstnameisinvalid", "Holder", "1234567890", "123 Fake St");
    });
  }
  
  @Test
  public void InvalidLastNameTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", null, "1234567890", "123 Fake St");
    });
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", "Thislastnameisinvalid", "1234567890", "123 Fake St");
    });
  }
  
  @Test
  public void InvalidPhoneNumberTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", "Holder", null, "123 Fake St");
    });
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", "Holder", "12345", "123 Fake St");
    });
  }
  
  @Test
  public void InvalidAddressTest() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", "Holder", "1234567890", null);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      new Contact("1", "Moe", "Holder", "1234567890", "This address is invalid because it does not meet the 30 character limit.");
    });
  }
  
  @Test
  public void FirstNameUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    contact.setFirstName("Joe");
    assertEquals("Joe", contact.getFirstName());
  }
  
  @Test
  public void LastNameUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    contact.setLastName("Johnson");
    assertEquals("Johnson", contact.getLastName());
  }
  
  @Test
  public void PhoneNumberUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    contact.setPhone("5406216789");
    assertEquals("5406216789", contact.getPhoneNumber());
  }
  
  @Test
  public void AddressUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    contact.setAddress("456 Real Rd");
    assertEquals("456 Real Rd", contact.getAddress());
  }
  
  @Test
  public void InvalidFirstNameUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setFirstName(null);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setFirstName("Thisfirstnameisinvalid");
    });
  }
  
  @Test
  public void InvalidLastNameUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setLastName(null);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setLastName("Thislastnameisinvalid");
    });
  }
  
  @Test
  public void InvalidPhoneNumberUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St");
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setPhone(null);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setPhone("12345");
    });
  }
  
  @Test
  public void InvalidAddressUpdateTest() {
    Contact contact = new Contact("1", "Moe", "Holder", "1234567890", "123 Fake St,");
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setAddress(null);
    });
    assertThrows(IllegalArgumentException.class, () -> {
      contact.setAddress("This address is invalid because it does not meet the 30 character limit.");
    });
  }
   
}

