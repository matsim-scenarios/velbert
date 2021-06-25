package org.matsim.velbert.analysis;

import org.junit.After;
import org.junit.Test;

import java.util.List;

public class GoogleSheetsTabularWriterTest {

    @After
    public void tearDown() {

        // delete the sheet
    }

    @Test
    public void simpleWriteTest() {


        List<List<Object>> values = List.of(
                List.of("test-value-1"),
                List.of("test-value-2")
        );

        var writer = new GoogleSheetsWriter("19yPrnbnzC0RJxkgHa_m8zOOjhM-ynCuQIAwg-zLMiZw", "bla2", new String[]{"test"});
        writer.write(values);



    }


}