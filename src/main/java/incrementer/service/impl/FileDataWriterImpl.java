package incrementer.service.impl;

import incrementer.service.FileDataWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileDataWriterImpl implements FileDataWriter {
    private static final int MIN = 1;
    private static final int MAX = 10;

    @Override
    public void writeRandomNumber(String location) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(location));
            writer.write(String.valueOf(getRandomNumber()));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeIncrementedNumber(String location, int number) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(location));
            writer.write(String.valueOf(number));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt((MAX - MIN) + 1) + MIN;
    }
}
