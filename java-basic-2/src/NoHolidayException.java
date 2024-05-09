// NoHolidayException.java
public class NoHolidayException extends Exception {
    public NoHolidayException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.err.println("指定された日付は休日ではありません。");
    }
}
