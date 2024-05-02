package org.example.contact.service;

import org.example.contact.entity.Contact;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "org.example.contact.service.ContactService")
public class ContactServiceImpl implements ContactService {
    private static final Map<String, Contact> contacts = new HashMap<>();

    @Override
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public Contact getContactByName(String name) {
        return contacts.get(name);
    }

    @Override
    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
    }

    @Override
    public void updateContact(Contact contact) {
        contacts.put(contact.getName(), contact);
    }

    @Override
    public void deleteContact(String name) {
        contacts.remove(name);
    }
}
