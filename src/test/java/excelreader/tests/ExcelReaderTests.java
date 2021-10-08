package excelreader.tests;


import com.creditdatamw.zerocell.Reader;
import excelreader.pojo.PersonModel;
import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;


public class ExcelReaderTests {

    @Test
    public void readingExcelSheet() {
        List<PersonModel> personModels = Reader.
                of(PersonModel.class).
                from(new File(
                        SystemUtils.getUserDir() + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "PersonInfo.xlsx"
                ))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();
        personModels.forEach(p -> {
            System.out.println(p.toString() + " " + p.getRow());

        });
    }
}
