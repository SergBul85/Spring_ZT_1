package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Query query = session.createQuery("from Employee");

            Query query = session.createQuery("from Employee where salary > :salary");
            query.setParameter("salary", "650");

            List<Employee> employees = query.getResultList();
            employees.forEach(System.out::println);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
