package org.example.contact.service;

import org.example.contact.entity.Contact;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ContactService {
    @WebMethod
    List<Contact> getAllContacts();

    @WebMethod
    Contact getContactByName(String name);

    @WebMethod
    void addContact(Contact contact);

    @WebMethod
    void updateContact(Contact contact);

    @WebMethod
    void deleteContact(String name);
}
