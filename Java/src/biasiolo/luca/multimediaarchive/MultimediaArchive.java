package biasiolo.luca.multimediaarchive;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class MultimediaArchive {

    public static final Properties properties = new Properties();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Absolute path of the folder to add: ");
        final String NEW_FOLDER_PATH = scanner.nextLine();
        System.out.println("Absolute path of the folder in which to create the archive");
        final String ARCHIVE_ROOT_PATH = scanner.nextLine();
        scanner.close();
        Properties properties = new Properties();
        properties.setProperty("NEW_FOLDER_PATH", NEW_FOLDER_PATH);
        properties.setProperty("ARCHIVE_ROOT_PATH", ARCHIVE_ROOT_PATH);
        properties.setProperty("db_url", "jdbc:sqlite:archive.db");
        // TODO: da capire come fare il parsing delle estensioni possibili
        properties.setProperty("ADMITTED_FILE_EXTENSIONS", "{\"jpg\", \"JPG\", \"jpeg\", \"png\", \"gif\", \"mp4\", \"opus\", \"mpeg\", \"mp3\"}");
        properties.store(new FileWriter("multimediaArchive.properties"),null);
    }
}
