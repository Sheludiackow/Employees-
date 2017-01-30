
/**
 * 1)Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2)Конструктор класса должен заполнять эти поля при создании объекта;
 * 3)Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4)Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет; Пример: ```
 * Person [] persArray = new Person [ 5 ]; // Сначала объявляем массив объектов,
 * persArray [ 0 ] = new Person ( "Ivanov Ivan" , "Engineer" , " ivivan@mailbox.com " , "892312312" , 30000 ,30 ); // потом для каждой ячейки массива задаем объект
 * persArray [ 1 ] = new Person (...);
 * ...
 * persArray [ 4 ] = new Person (...);
 */
public class MainClass {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov","ivanov@mail.ru",45);
        employees[1] = new Employees("Ivanov1","ivanov@mail.ru",36);
        employees[2] = new Employees("Ivanov2","ivanov@mail.ru",52);
        employees[3] = new Employees("Ivanov3","ivanov@mail.ru",27);
        employees[4] = new Employees("Ivanov4","ivanov@mail.ru",48);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}
