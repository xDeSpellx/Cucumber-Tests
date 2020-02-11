package Classes;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporter {
    public static void main(String[] args) {
        File reportOutputDirectory = new File(FileSystems.getDefault().getPath(".").toAbsolutePath()+"/target/Results");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add(FileSystems.getDefault().getPath(".").toAbsolutePath()+"/target/cucumber.json");

        String projectName = PropertiesReader.getPropertyValue("Cucumber-Tests","projectName");

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}