package incrementer.service;

public interface FileDataWriter {
    void writeRandomNumber(String location);

    void writeIncrementedNumber(String location, int number);
}
