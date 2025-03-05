import javax.xml.bind.annotation.XmlRootElement;;
import javax.xml.bind.*;

@XmlRootElement
class Person {
    public String name;
    public int age;

    // Default constructor is needed for JAXB
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class _05_jaxb_binding {
    public static void main(String[] args) {
        try {
            Person person = new Person("Alice", 30);

            // Create JAXB context and marshaller
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Convert object to XML
            marshaller.marshal(person, System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
