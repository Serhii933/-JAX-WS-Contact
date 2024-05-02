package org.example.contact;

import org.example.contact.entity.Contact;
import org.example.contact.service.ContactService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ClientApp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ws/contact?wsdl");
        QName qname = new QName("http://service.contact.example.org/", "ContactServiceImplService");
        Service service = Service.create(url, qname);
        ContactService contactService = service.getPort(ContactService.class);


        Contact newContact = new Contact("John Doe", "+123456789");
        contactService.addContact(newContact);


        System.out.println("All contacts:");
        contactService.getAllContacts().forEach(System.out::println);

        String contactName = "John Doe";
        System.out.println("Contact by name '" + contactName + "': " + contactService.getContactByName(contactName));
    }
}
