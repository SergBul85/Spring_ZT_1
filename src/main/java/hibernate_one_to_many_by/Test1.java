package hibernate_one_to_many_by;

import hibernate_one_to_many_by.entity.Department;
import hibernate_one_to_many_by.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Zaur", "Tregulov", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 100);
//            department.addEmployee(employee1);
//            department.addEmployee(employee2);
//
//            session.persist(department);

//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            department.getEmps().forEach(System.out::println);

            Employee employee = session.get(Employee.class, 4);
            session.remove(employee);


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
