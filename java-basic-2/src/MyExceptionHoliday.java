// MyExceptionHoliday.java
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyExceptionHoliday {
    // 日本の5月の祝日をリスト化（例として一部の祝日）
    private static final Set<Integer> holidays = new HashSet<>(Set.of(3, 4, 5)); // 憲法記念日、みどりの日、こどもの日

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("5月の日付を入力してください (終了するには0を入力): ");
                int day = scanner.nextInt();

                if (day == 0) {
                    break;
                }

                checkHoliday(day);
                System.out.println(day + "日は休日または週末です。");

            } catch (NoHolidayException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    private static void checkHoliday(int day) throws NoHolidayException {
        if (day < 1 || day > 31) {
            throw new NoHolidayException("指定された日付は有効な5月の日付ではありません。");
        }

        // 休日リストに含まれるか、または土日かをチェック
        Calendar calendar = new GregorianCalendar(2024, Calendar.MAY, day); // 年は適宜設定
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        boolean isWeekend = (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);
        boolean isHoliday = holidays.contains(day);

        if (!isWeekend && !isHoliday) {
            throw new NoHolidayException("指定された日付は5月の休日でも週末でもありません。");
        }
    }
}

