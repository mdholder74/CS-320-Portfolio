package contact;

/**
 * Contact class to manage contact information
 */
public class Contact {

  // Instance variables
  private final String contactId;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;

  /**
   * Creates a new Contact with validated information.
   * 
   * @param contactId Unique identifier (max 10 chars, cannot be null)
   * @param firstName Contact's first name (max 10 chars, cannot be null)
   * @param lastName  Contact's last name (max 10 chars, cannot be null)
   * @param number     Contact's phone number (exactly 10 digits, cannot be null)
   * @param address   Contact's address (max 30 chars, cannot be null)
   * @throws IllegalArgumentException if any parameter is invalid
   */
  public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

    // Validate contactId
    if (contactId == null || contactId.length() > 10) {
      throw new IllegalArgumentException("Invalid contact ID");
    }

    // Validate firstName
    if (firstName == null || firstName.length() > 10) {
      throw new IllegalArgumentException("Invalid first name");
    }

    // Validate lastName
    if (lastName == null || lastName.length() > 10) {
      throw new IllegalArgumentException("Invalid last name");
    }

    // Validate phone (exactly 10 digits)
    if (phoneNumber == null || phoneNumber.length() != 10) {
      throw new IllegalArgumentException("Invalid phone number");
    }

    // Validate address
    if (address == null || address.length() > 30) {
      throw new IllegalArgumentException("Invalid address");
    }

    // If all validations pass, assign values
    this.contactId = contactId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  // Getters
  public String getContactId() {
    return contactId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  // Setters
  public void setFirstName(String firstName) {
    if (firstName == null || firstName.length() > 10) {
      throw new IllegalArgumentException("Invalid first name");
    }
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    if (lastName == null || lastName.length() > 10) {
      throw new IllegalArgumentException("Invalid last name");
    }
    this.lastName = lastName;
  }

  public void setPhone(String phoneNumber) {
    if (phoneNumber== null || phoneNumber.length() != 10) {
      throw new IllegalArgumentException("Invalid phone number");
    }
    this.phoneNumber = phoneNumber;
  }

  public void setAddress(String address) {
    if (address == null || address.length() > 30) {
      throw new IllegalArgumentException("Invalid address");
    }
    this.address = address;
  }

}
