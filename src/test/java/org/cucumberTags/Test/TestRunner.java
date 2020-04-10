package org.cucumberTags.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sivag\\eclipse-workspace\\CucumberTags\\src\\main\\java\\org\\feature\\cucumbertags.feature",
glue="org.cucumberTags.StepDefinition",
dryRun=false

)
public class TestRunner {

}
