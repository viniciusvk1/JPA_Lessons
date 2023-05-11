package application;

/*
In this section, the classes needed for the application are imported,
including the Person class from the domain package, and JPA related classes.
*/

import domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        /*
        These lines create an entity manager factory (EntityManagerFactory)
        and an entity manager (EntityManager) using the configuration
        defined in the persistence.xml file with the persistence unit called "exemple-jpa".
        */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemple-jpa");
        EntityManager em = emf.createEntityManager();

        /*
        Here three objects of the Person class are created,
        with null ID values and defined name and email information.
        */

        Person p1Add = new Person(null, "Vinicius Almeida", "vinicius@email.com");
        Person p2Add = new Person(null, "Camile Righetti", "camile@email.com");
        Person p3Add = new Person(null, "Fernanda Soares", "fernanda@email.com");

        /*
        These rows begin a transaction (begin),
        persist the Person objects to the database using the persist method,
        and finally commit the transaction.
        */

        em.getTransaction().begin();
        em.persist(p1Add);
        em.persist(p2Add);
        em.persist(p3Add);
        em.getTransaction().commit();

        /*
        Here a search (find) is performed in the database for the Person object with the ID equal to 1
        and the result is stored in the variable p. Then the result is printed on the screen using System.out.println.
        */

        Person p = em.find(Person.class, 1);
        System.out.println(p);

        /*
        These rows fetch the Person object with ID 3 and store it in the variable personRemove.
        Then a transaction is started, the object is removed from the database using the remove method,
        and the transaction is confirmed.
         */

        Person personRemove = em.find(Person.class, 3);
        em.getTransaction().begin();
        em.remove(personRemove);
        em.getTransaction().commit();

        /*
        Here the message "Successfully!" is printed on the screen.
        Then the entity manager (em) is closed, followed by the entity manager factory (emf).

        In summary, the code creates and sets up a connection to a database using JPA,
        performs insert, search, and remove operations on Person objects in the database,
        and finally closes the connection.
        */

        System.out.println("Successfully!");
        em.close();
        emf.close();
    }
}