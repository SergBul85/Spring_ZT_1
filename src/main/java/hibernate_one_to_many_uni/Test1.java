package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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

//            Department department = new Department("Dep_1", 111, 112);
//            Employee employee1 = new Employee("name_1", "surn_1", 111);
//            Employee employee2 = new Employee("name_2", "surn_2", 112);
//
//            department.addEmployee(employee1);
//            department.addEmployee(employee2);
//
//            session.persist(department);


//            Department department = session.get(Department.class, 5);
//            System.out.println(department);
//            department.getEmps().forEach(System.out::println);

//            Employee employee = session.get(Employee.class, 7);
//            System.out.println(employee);

//            Employee employee = session.get(Employee.class, 7);
//            session.remove(employee);

            Department department = session.get(Department.class, 5);
            session.remove(department);
            session.remove(department);


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
