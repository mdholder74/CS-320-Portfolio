package contact;

import java.util.HashMap;

/**
 * ContactService class to manage multiple contacts in memory storage Provides
 * methods to add, delete, and update contacts
 */
public class ContactService {

  private HashMap<String, Contact> phoneContacts;

  /**
   * Constructor: initializes the HashMap for storing contacts.
   */
  public ContactService() {
    phoneContacts = new HashMap<>();
  }

  /**
   * Adds a new contact with a unique ID.
   * 
   * @param contact The contact to add
   * @throws IllegalArgumentException if contact ID already exists
   */
  public void addContact(Contact contact) {
    String idOfContact = contact.getContactId();

    if (phoneContacts.containsKey(idOfContact)) {
      throw new IllegalArgumentException("Contact ID already exists in contact list.");
    }

    phoneContacts.put(idOfContact, contact);
  }

  /**
   * Deletes a contact by contact ID.
   * 
   * @param contactId The ID of the contact to delete
   * @throws IllegalArgumentException if contact not found
   */
  public void deleteContact(String contactId) {
    
    if (!phoneContacts.containsKey(contactId)) {
      throw new IllegalArgumentException("Contact not found in contact list.");
    }

    phoneContacts.remove(contactId);
  }

  /**
   * Updates contact fields by contact ID.
   * 
   * @param contactId The ID of the contact to update
   * @param firstName New first name (can be null to skip update)
   * @param lastName  New last name (can be null to skip update)
   * @param phone     New phone number (can be null to skip update)
   * @param address   New address (can be null to skip update)
   * @throws IllegalArgumentException if contact not found or invalid data
   */
  public void updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

    Contact contact = phoneContacts.get(contactId);

    if (contact == null) {
      throw new IllegalArgumentException("Contact not found in contact list.");
    }

    if (firstName != null) {
      contact.setFirstName(firstName);
    }
    if (lastName != null) {
      contact.setLastName(lastName);
    }
    if (phoneNumber != null) {
      contact.setPhone(phoneNumber);
    }
    if (address != null) {
      contact.setAddress(address);
    }
  }

}
