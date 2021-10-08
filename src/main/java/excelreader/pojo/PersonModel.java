package excelreader.pojo;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.annotation.RowNumber;
import excelreader.converter.IntegerConverter;
import excelreader.converter.ListConverter;

import java.util.List;

public class PersonModel {

    @RowNumber
    private int row;

    @Column(index = 0, name = "Name")
    private String name;

    @Column(index = 1, name = "Age", convertorClass = IntegerConverter.class)
    private int age;

    @Column(index = 2, name = "Address")
    private String address;

    @Column(index = 3, name = "Hobbies", convertorClass = ListConverter.class)
    private List<String> hobbies;

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public int getRow() {
        return row;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }


}
