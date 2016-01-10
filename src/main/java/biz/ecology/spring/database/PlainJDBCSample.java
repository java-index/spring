package biz.ecology.spring.database;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class PlainJDBCSample {
    private static ContactDao contactDao = new PlainContactDao();

    public static void main(String[] args) {
        findAll();

        Contact Jon = new Contact();
        Jon.setFirstName("John");
        Jon.setLastName("Hello");
        Jon.setBirthDate(new Date(new GregorianCalendar(1974, 1, 14).getTime().getTime()));
        contactDao.insert(Jon);

        findAll();
    }

    private static void findAll() {
        System.out.println("Find all contacts:");
        List<Contact> contact = contactDao.findAll();
        for (Contact c : contact) {
            System.out.println(c);
        }
    }
}
