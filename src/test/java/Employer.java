public class Employer {
    private String fullName;  /// для их изменения мне необходим сеттер
    private String position;
    private String email;
    private int phoneNumber;
    private int age;
    private int salary;

    public Employer(String fullName, String position, String email, int phoneNumber, int age, int salary) {  //// параметры объекта или поля объекта
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {            ///getter возвращает только одно значение.
        return age;
    }

    @Override                       /// переопределенный метод toString  (упрощает вывод информации об объекте)
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employer{");
        sb.append("fullName='").append(fullName).append('\'').append("\n");
        sb.append("position='").append(position).append('\'').append("\n");
        sb.append("email='").append(email).append('\'').append("\n");
        sb.append("phoneNumber=").append(phoneNumber).append("\n");
        sb.append("age=").append(age).append("\n");
        sb.append("salary=").append(salary).append("\n");
//        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Employer[] employers = new Employer[5];
        employers[0] = new Employer("Den", "CEO", "@gmail.com", +7899, 22, 15555);
        employers[1] = new Employer("Pet", "DEO", "@ya.ru", +7925, 52, 932199);
        employers[2] = new Employer("Van", "beginner", "@yahoo", +7914, 72, 1223);
        employers[3] = new Employer("Li", "beginner", "@ya.ru", +7955, 92, 555);
        employers[4] = new Employer("Kim", "Student", "@gmail.com", +7904, 22, 1123);
        int i = 0;
        while(i < employers.length)
        {
            if(employers[i].getAge() > 40)
                System.out.println(employers[i]);
            i++;
        }
    }
}

