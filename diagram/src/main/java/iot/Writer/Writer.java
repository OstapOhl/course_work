package iot.Writer;

import iot.data.Api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Writer {

    File file = null;
    LocalDate localDate = LocalDate.now();
    String lastData = String.valueOf(localDate);


        public static void deleteDirectory(File directory) throws IOException {
            Files.walk(directory.toPath())
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .forEach(File::delete);
        }


    public void writeCSV(List<Api> api) throws IOException {
        File directory = new File("src/main/java/iot/WriterResult");
        deleteDirectory(directory);

        try (FileWriter writer = new FileWriter(new File("src/main/java/iot/WriterResult/Result" + localDate + ".csv"))) {
            String previousClassName = "";
            for (Api data : api) {
                if (!api.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(api.getClass() + "\r\n");
                    previousClassName = api.getClass().getSimpleName();
                }
                writer.write(data.ToCSV() + "\r\n");
            }
        }
    }


}



