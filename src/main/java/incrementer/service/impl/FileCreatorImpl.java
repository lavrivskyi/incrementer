package incrementer.service.impl;

import incrementer.service.FileCreator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreatorImpl implements FileCreator {

    @Override
    public boolean createFile(String location) {
        Path newFilePath = Paths.get(location);
        try {
            Files.createFile(newFilePath);
        } catch (IOException e) {
            System.out.println("Can't create new file");
            return false;
        }
        return true;
    }
}
