package hibernate_mani_to_many;

import hibernate_mani_to_many.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Zaur", 5);
//            Child child2 = new Child("Masha", 2);
//            Child child3 = new Child("Vasia", 3);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            session.persist(section1);

//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child1 = new Child("Igor", 48);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.save(child1);

//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//
//            section.getChildren().forEach(c->{
//                System.out.println(c);
//            });

//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            child.getSections().forEach(System.out::println);


            Section section = session.get(Section.class, 6);
            session.remove(section);

            session.getTransaction().commit();

        } catch (Exception e) {
            session.clear();
            factory.close();
        }

    }
}
