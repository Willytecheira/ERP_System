package example_read_csv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Example {

    public static void main(String[] args) throws IOException {

        String fileName = ("/Users/data/Products.csv");

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }
}


