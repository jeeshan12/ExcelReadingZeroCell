package excelreader.tests;

import com.creditdatamw.zerocell.Reader;
import excelreader.pojo.PersonModel;
import org.apache.commons.lang3.SystemUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class DataDrivenTest {

    @Test(dataProvider = "testData")
    public void testDataDriven(PersonModel model) {
        System.out.println(model.getName()+ " "+ model.getHobbies());
    }


    @DataProvider(name = "testData")
    public static  Iterator<PersonModel> getData() {
        List<PersonModel> personModels = Reader.
                of(PersonModel.class).
                from(new File(
                        SystemUtils.getUserDir() + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "PersonInfo.xlsx"
                ))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();
        return  personModels.iterator();
    }
}
