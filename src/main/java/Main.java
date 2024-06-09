import java.io.File;


public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/file.txt");
        PhoneNumberOutputStream pnos=new PhoneNumberOutputStream();
        pnos.readFileAndPrint(file1);

        File file = new File("src/main/resources/file2.txt");
        UserJSONTest userJSONTest=new UserJSONTest();
        userJSONTest.readFileAndsWriteInJSONForm(file);

        File file3 = new File("src/main/resources/words.txt");
        WordFrequencyCounter wfc =new WordFrequencyCounter(file3);
        wfc.printSortedWordFrequency();

       

    }
}
