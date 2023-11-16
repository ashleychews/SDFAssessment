package sdf.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collector;

public class Main {

    public static final int COL_APP = 0;
    public static final int COL_NAME = 1;
    public static final int COL_RATING = 2;

    public static void main(String[] args) throws Exception {
        
        //check if filename is provided, else exit program
        if (args.length <= 0) {
            System.err.println("Missing google play store csv");
            System.exit(1);
        }

        try (FileReader fr = new FileReader(args[0])) {
            BufferedReader br = new BufferedReader(fr);
            //for counting lines
            //long countLines = fr.read().count();
            //create hashmap to store key and values
            Map<String, List<Google>> classified = new HashMap<>();
            //br.readLine() -> reads line by line
            br.lines()
                .skip(1) //skip header
                //remove line with nan values using filter
                .filter(line -> Objects.nonNull(line))
                //remove trailing lines and split by comma
                //map will convert String -> String[]
                .map(line -> line.trim().split(","))
                //map the columns
                .map(columns -> new Google(columns[COL_APP]
                ,columns[COL_NAME]
                ,Double.parseDouble(columns[COL_RATING])))

                //group by categories
                .collect(Collector.groupingBy(cat -> cat.category()));
                
                //idea is for each category, 
                //put category and value into hashmap
                //value is the rating
                //use .put
                // PLAN CODE
                //.forEach()
                //for (Google g: store) {

                //}

                }



            //printing
            //for (String cat: classified.keySet()) {
            //  Google get = 
            //    System.out.printf("%s: average: %s\n",  );
            //}



        }

}
