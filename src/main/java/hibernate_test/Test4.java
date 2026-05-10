package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1500);

//            Query query = session.createQuery("from Employee e where e.name=:name");
//            query.setParameter("name", "Oleg");
//            List<Employee> employees = query.getResultList();
//            for (Employee employee : employees) {
//                employee.setSalary(555);
//            }

            session.createQuery("update Employee set salary = 333 where  name= 'Oleg' ").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
