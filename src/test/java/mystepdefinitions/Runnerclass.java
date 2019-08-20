package mystepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\selenium_testing\\cucumber_training\\myfeatures\\demo_tags.feature",glue="mystepdefinitions",tags= {"@Sanity,@Smoke"})
public class Runnerclass {

}
