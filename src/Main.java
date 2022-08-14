import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
///1
        printLeapYear(2022);

        /// 2
        int clientOS = 1;
        int deviseYear = 2021;
        printSuggestionForInstall(clientOS, deviseYear);

        ///3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("надо дней : " + deliveryDays);
    }


    private static int calculateDeliveryDays(int deliveryDistanse) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistanse > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil(deliveryDistanse - startInterval / (double) interval);
        }
        return deliveryDays;

    }

    private static void printSuggestionForInstall(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (deviceYear < currentYear) {
            output = "установи облегченную версию";
        } else {
            output = "установи  версию";
        }
        if (clientOS == 1) {
            output += "андроид по ссылке";
        } else {
            output += "IOS по ссылке";
        }
        System.out.println(output);

    }

    private static void printLeapYear(int year) {
        String output;
        if (isLeapYear(year)) {
            output = (year + "год високосный");
        } else {
            output = (year + "год не високосный");
        }
        System.out.println(output);
    }

    private static boolean isLeapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}
