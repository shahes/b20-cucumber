package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

   @Before(order=2)
   public void setUpScenario(){
      System.out.println("----> Before annotation : Setting up browser");
   }



   @Before(value = "@db", order=1)
   public void setUpDataBaseConnection(){
      System.out.println("connecting to database");
   }
   @After(order=1)
   public void tearDownScenario(Scenario scenario){
      //System.out.println("=----> After annotation : Closing browser");
     // System.out.println("scenario.getName() = " + scenario.getName());
     // System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
     // System.out.println("scenario.isFailed() = " + scenario.isFailed());
      //# We need to take a screenshot using selenium

      //we are going to attach it into our report: using attach method
      //attach method accepts 3 arguments.#1 Screenshot itself #2 image type # current scenarios name
      if(scenario.isFailed()) {

         byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", scenario.getName());


      }

   }


   @BeforeStep()
   public void setUpStep(){

      System.out.println("=======BEFORE STEP TAKING SCREEN SHOT=====");
   }


   @AfterStep()
   public void tearDownStep(){

      System.out.println("==========TAKING SCREENSHOT==========");

   }

}
