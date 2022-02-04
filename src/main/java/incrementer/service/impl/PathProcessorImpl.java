package incrementer.service.impl;

import incrementer.service.PathProcessor;

public class PathProcessorImpl implements PathProcessor {

    @Override
    public void process(String location) {
        FileDataReaderImpl reader = new FileDataReaderImpl();
        FileDataWriterImpl fileDataWriterImpl = new FileDataWriterImpl();
        if(reader.readFile(location) < 1) {
            FileCreatorImpl fileCreatorImpl = new FileCreatorImpl();
            if(fileCreatorImpl.createFile(location)) {
                fileDataWriterImpl.writeRandomNumber(location);
            }
            System.out.println("No file");
        } else {
            int fileNumber = reader.readFile(location);
            System.out.println(fileNumber);
            int incrementedNumber = fileNumber + 3;
            fileDataWriterImpl.writeIncrementedNumber(location, incrementedNumber);
            System.out.println(incrementedNumber);
        }
    }
}
