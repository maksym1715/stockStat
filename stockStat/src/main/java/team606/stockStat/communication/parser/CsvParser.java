package team606.stockStat.communication.parser;

import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvException;

public interface CsvParser {
	
	 List<String[]> parseCsvFile(String filePath) throws IOException, CsvException;;

}
