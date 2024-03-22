package JavaLecture2.EqualsandHashcode;

public class Person {
       private String name;
       private int age;
       private String id;
       public Person(String name, int age, String id) {
              this.name = name;
              this.age = age;
              this.id = id;
       }
       
       @Override
       public int hashCode() {
              final int prime = 31;
              int result = 1;
              result = prime * result + ((name == null) ? 0 : name.hashCode());
              result = prime * result + age;
              result = prime * result + ((id == null) ? 0 : id.hashCode());
              return result;
       }

       @Override
       public boolean equals(Object obj) {
              if (this == obj)
                     return true;
              if (obj == null)
                     return false;
              if (getClass() != obj.getClass())
                     return false;
              Person other = (Person) obj;
              if (name == null) {
                     if (other.name != null)
                            return false;
              } else if (!name.equals(other.name))
                     return false;
              if (age != other.age)
                     return false;
              if (id == null) {
                     if (other.id != null)
                            return false;
              } else if (!id.equals(other.id))
                     return false;
              return true;
       }
       

       @Override
       public String toString() {
              return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
       }

       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public int getAge() {
              return age;
       }
       public void setAge(int age) {
              this.age = age;
       }
       public String getId() {
              return id;
       }
       public void setId(String id) {
              this.id = id;
       }

}
