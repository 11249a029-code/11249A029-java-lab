import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        int year = cal.get(GregorianCalendar.YEAR);
        int month = cal.get(GregorianCalendar.MONTH) + 1;
        int day = cal.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
