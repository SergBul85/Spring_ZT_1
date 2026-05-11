package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = new Employee("Nikolay","Ivanov","HR",850);
//            Detail detail = new Detail("NY","123456444","nik@gmail.com");
//
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//            session.save(detail);

//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail);
//            System.out.println((detail.getEmployee()));

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
