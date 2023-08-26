package team606.stockStat.communication.parser;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.opencsv.exceptions.CsvException;

public interface CsvParser {
	
	List<CsvData> parseCsvFile(String filePath, String fromDate, String toDate) throws IOException, CsvException, ParseException;

}
