/**
 * Создать класс "Сотрудники"
 * с полями: ФИО, должность, email, телефон, зарплата, возраст;
 */
public class Employees {
    String surname;    // Фамилия
    String name;       // Имя
    String patronymic; // Отчество
    String position;   // Должность
    String email;      // Почта
    String phone;      // Телефон
    int age;           // Возраст
    int salary;        // Зарплата

    public Employees(String surname, String name, String patronymic, String position, String email, String phone, int age, int salary){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public static void genEmployes (Employee[] employes) {
        for(int i = 0; i < employes.length; i++) {
            employes[i] = EmployeeGenerator.getEmployee();
        }
    }
    private static void toDisplayQuery(Employee[] employes, String where, String what, String less_than, int condition ) {
        if ("age".equals(what)) {
            for (int i = 0; i < employes.length; i++) {
                if(employes[i].age > 40) {
                    System.out.println(employes[i]);
                    System.out.println();// Отступ для красоты
                }
            }
        }
    }


    public void printInfo(){
        System.out.println("Фамилия: "+surname);
        System.out.println("Имя: "+name);
        System.out.println("Отчество: "+patronymic);
        System.out.println("Должность: "+position);
        System.out.println("Почта: "+email);
        System.out.println("Телефон: "+phone);
        System.out.println("Возраст: "+age);
        System.out.println("Зарплата: "+salary);
    }


}
