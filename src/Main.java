import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        checkForAWeightBearingYear(2021);

        //Task 2
        System.out.println("Task 2");
        determinesWhichVirsionToDownload(0, 2026);

        //Task 3
        System.out.println("Task 3");

        int day = calcDeliveryDays(100);

        if (day != -1) {
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет!");
        }

    }

    // Task 1
    public static void checkForAWeightBearingYear(int year) {

        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    //Task 2
    public static void determinesWhichVirsionToDownload(int numberOS, int yearManufacture) {

        int currentYear = LocalDate.now().getYear();
        String osName;

        switch (numberOS) {
            case 0:
                osName = "iOS";
                break;
            case 1:
                osName = "Android";
                break;
            default:
                System.out.println("Введите корректную операционную систему (0 или 1)");
                return;
        }

        if (yearManufacture == currentYear) {
            System.out.println("Установите обычную версию приложения для " + osName + " по ссылке");
        } else if (yearManufacture < currentYear && yearManufacture > 2015) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Введите корректный год вашего телефона");
            return;
        }

    }

    //Task 3
    public static int calcDeliveryDays(int killometers) {

        int day = 0;

        if (killometers <= 20 && killometers > 0) {
            day = 1;
        } else if (killometers <= 60 && killometers > 20) {
            day = 2;
        } else if (killometers <= 100 && killometers > 60) {
            day = 3;
        } else {
            day = -1;
        }

        return day;

    }

}