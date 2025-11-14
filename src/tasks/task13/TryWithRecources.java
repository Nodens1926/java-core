package tasks.task13;

import java.io.*;

public class TryWithRecources {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/tasks/task13/data.csv")) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
            System.out.println(bf.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка IO: " + e.getMessage() );
        } finally {
            System.out.println("блок finally");
        }
    }
}
