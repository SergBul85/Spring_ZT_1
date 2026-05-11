package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 11);
//            session.remove(employee);

//            Query query = session.createQuery("delete Employee  where  id= :id ");
//            query.setParameter("id", 12);
//            query.executeUpdate();

//            Query query = session.createQuery("delete Employee e where e.salary < :salary ");
//            query.setParameter("salary", 751);
//            int i = query.executeUpdate();
//            System.out.println(i);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
