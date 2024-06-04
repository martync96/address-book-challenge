| Statement                                                                  | User Story                                                                                | Nouns                 | Verbs           |
|----------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|-----------------------|-----------------|
| 1. A user should be able to add a contact to the address book              | As a user, I want to be able to add new contacts to my address book, so I can organise    | Address Book, Contact | Add             |
|                                                                            | all of my contacts                                                                        |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 2. A user must enter a name when adding a new contact                      | As a user, I want to be able to enter a name when adding a contact to the address         | Address Book, Contact | Enter, Identify |
|                                                                            | book, so i able to identify each contact                                                  |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 3. A user must enter a phone number when adding a new contact              | As a user, I want to be able to enter a phone number to the address book, so I            | Address Book, Contact | Enter, Identify |
|                                                                            | have easy access to their contact details.                                                |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 4. A user must enter an email address when adding a new contact            | As a user, I want to be able to enter an email address to the address book, so I          | Address Book, Contact | Enter, Identify |
|                                                                            | can easily access other contact methods when needed                                       |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 5. A user must be able to search for a contact by name and have            | As a user, I want to be able to search for a contact by name to allow myself to easily    | Address Book, Contact | Search, Find    |
| the results displayed                                                      | find contacts without having to know their contact details                                |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 6. The user should be able to remove a contact from the address book       | As a user, I want to be able to remove contacts so I can keep my address book organised   | Address Book, Contact | Remove          |
|                                                                            |                                                                                           |                       |                 |
| 7. The user should be able to edit a contact's details                     | As a user, I want to be able to edit contacts so I can always keep my address book with   | Address Book, Contact | Edit            |
|                                                                            | the most current up to date information                                                   |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 8. The user should be able to view all contacts in the address book        | As a user, I want to be able to view all the contacts in my address book, so I able       | Address Book, Contact | View, Browse    |
|                                                                            | to browse for all my contacts for people.                                                 |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 9. The user should be able to search for a contact by phone number         | As a user, I want to be able to search for a contact by phone number, so I am able to     | Address Book, Contact | Search, View    |
| and have the results displayed                                             | look up who a person is by their number                                                   |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 10. The user should be able to search for a contact by email address       | As a user, I want to be able to search for a contact by email address, so I am able to    | Address Book, Contact | Search          |
| and have the results displayed                                             | look up who a person is by their email address                                            |                       |                 |
|                                                                            |                                                                                           |                       |                 |
| 11. The user should be able to search for a contact by name, phone number, | As a user, I want the results from my searches displayed in alphabetical order, so it is  | Address Book, Contact | Displayed       |
| or email address and have the results displayed in alphabetical order      | easier to navigate the results                                                            |                       |                 |
|                                                                            |                                                                                           |                       |                 | 
| 12. The user should be able to delete all contacts at once, confirming     | As a user, I want to be able to delete all contacts at once, in case I am changing device | Address Book, Contact | Delete          |
| that they want to do this before proceeding                                | and wish to completely wipe all my details.                                               |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |
|                                                                            |                                                                                           |                       |                 |

| Object      | Properties             | Messages                               | Output    |
|-------------|------------------------|----------------------------------------|-----------|
| AddressBook | ID @int                | public getID()                         | int       |
|             | userName @String       | public setID()                         | void      |
|             | contactList @ArrayList | public getUsername()                   | String    |
|             |                        | public setUsername()                   | void      |
|             |                        | public getContactList()                | ArrayList |
|             |                        | public setContactList()                | void      |
|             |                        | public searchForContact()              | List      |
|             |                        | public checkForDuplicatePhoneNumber()  | boolean   |
|             |                        | public checkForDuplicateEmailAddress() | boolean   |
|             |                        | public printContacts()                 | List      |
|             |                        | public searchByEmail                   | Contact   |
|             |                        | public searchByPhoneNumber             | Contact   |
|             |                        |                                        |           |
|             |                        |                                        |           |

| Object  | Properties           | Messages          | Output |
|---------|----------------------|-------------------|--------|
| Contact | ID @int              | public getID()    | int    |
|         | name @String         | public setID()    | void   |
|         | emailAddress @String | public getName()  | String |  
|         | phoneNumber @long    | public setName()  | void   |
|         |                      | public getEmail() | String |
|         |                      | public setEmail() | void   |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
|         |                      |                   |        |
