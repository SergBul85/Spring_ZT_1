package hibernate_one_to_many_by;

import hibernate_one_to_many_by.entity.Department;
import hibernate_one_to_many_by.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("SALES", 800, 1200);
//            Employee employee1 = new Employee("Zaur", "Tregulov", 801);
//            Employee employee2 = new Employee("Elena", "Smirnova", 102);
//            Employee employee3 = new Employee("Anton", "Sidorov", 303);
//            department.addEmployee(employee1);
//            department.addEmployee(employee2);
//            department.addEmployee(employee3);
//
//            session.persist(department);

            Department department = session.get(Department.class, 8);
            System.out.println(department);

            List<Employee> emps = department.getEmps();
            emps.get(0);

            session.getTransaction().commit();

            emps.forEach(System.out::println);

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
