import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TaskClientWhile {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("数値を入力してください (終了するには1以下の値を入力): ");
                int input = scanner.nextInt();

                TaskObject task = new TaskObject();
                task.setExecNumber(input);
                oos.writeObject(task);

                if (input <= 1) {
                    System.out.println("プログラムを終了します。");
                    break;
                }

                TaskObject resultTask = (TaskObject) ois.readObject();
                int result = resultTask.getResult();

                System.out.println("サーバからの計算結果: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
