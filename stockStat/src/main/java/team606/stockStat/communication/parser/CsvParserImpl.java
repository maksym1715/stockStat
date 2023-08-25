package team606.stockStat.communication.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@Service
public class CsvParserImpl implements CsvParser{

	@Override
    public List<String[]> parseCsvFile(String filePath) throws IOException , CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            return reader.readAll();
        }
    }
}