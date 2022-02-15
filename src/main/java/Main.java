import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws ParseException {
//        System.out.println("Hello World!");

        //Прочитать файл
        //Распарсить его
        //впихнуть в ХМЛ

        Options options = new Options();
        options.addOption("i", "input", true, "input file path");
        options.addOption("o", "output", true, "output file path");
        var commandLineParser = new DefaultParser();

        CommandLine commandLine = commandLineParser.parse(options, args);
        var inputPath = commandLine.getOptionValue("i", "input.bz2");
        var outputPath = commandLine.getOptionValue("o", "output.xml");

    }
}
