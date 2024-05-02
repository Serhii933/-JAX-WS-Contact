package org.example.contact.service;

import javax.xml.ws.Endpoint;

public class ContactServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/contact";
        Endpoint.publish(url, new ContactServiceImpl());
        System.out.println("Contact service is running at " + url + "?wsdl");
    }
}
