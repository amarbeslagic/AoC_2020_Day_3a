import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_3a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        int numOfTrees = 0;

        int j=3;
        for(int i=1; i<listOfStrings.size(); i++){

            if(j > 30 )
                j -= 31 ;

            if(listOfStrings.get(i).charAt(j) == '#')
                numOfTrees++;

            j += 3;
        }
        System.out.println(numOfTrees);
    }
}