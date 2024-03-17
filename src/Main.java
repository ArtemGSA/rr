public class Main {
    public static void main(String[] args) {
        task1();
        task3();
    }
    public static void task1(){
        //ЗАДАЧА1
        System.out.println("ЗАДАЧА1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName+" "+middleName+" "+lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //ЗАДАЧА2
        System.out.println("ЗАДАЧА2");
        String highFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + highFullName);
    }
    public static void task3(){
        System.out.println("ЗАДАЧА3");
        String fullName = "Иванов Семён Семёнович";
        String bezFullName = fullName.replace('ё','е');
        System.out.println("Данные Ф. И. О. сотрудника — " + bezFullName);
    }
}