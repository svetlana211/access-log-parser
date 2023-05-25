import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isFile();
    }
    public static void isFile() {
        int countFiles=0;
    for (int i=0; ;i++) {
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("Указан путь к папке, а не файлу"); continue;
        } else if (!file.exists()) {
            System.out.println("Файл не существует"); continue;
        } else if (file.exists() && !file.isDirectory()) {
            System.out.println("Путь указан верно. Это файл номер "+ ++countFiles);
        }
        }
    }
}
