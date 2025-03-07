package com.report;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import orangehrm.testclass.DriverClass;

public class ExtentReportUtils {

    public static ExtentTest test;
    public static ExtentReports report;

    public static void setUpReport() {
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("report/execution.html");
        report.attachReporter(spark);
        
        // Add System Info
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Tester", "Automation Team");
        report.setSystemInfo("Browser", "Chrome");
    }

    public static void createTest(String testName) {
        if (report == null) {
            System.out.println("Report instance is null! Ensure setUpReport() is called before creating tests.");
            return;
        }
        test = report.createTest(testName);
    }

    public static void addStep(String stepMessage) {
        if (test == null) {
            System.out.println("Test instance is null! Ensure createTest() is called before logging steps.");
            return;
        }
        test.info(stepMessage, MediaEntityBuilder.createScreenCaptureFromBase64String(captureScreenshot()).build());
    }

    public static String captureScreenshot() {
        if (DriverClass.driver == null) {
            System.out.println("Driver is null, cannot capture screenshot.");
            return "";
        }

        TakesScreenshot screenshot = (TakesScreenshot) DriverClass.driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);

        byte[] fileContent = null;
        try {
            fileContent = FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileContent != null ? Base64.getEncoder().encodeToString(fileContent) : "";
    }

    public static void flushReport() {
        if (report != null) {
            report.flush();
        } else {
            System.out.println("ExtentReports instance is null, skipping flush.");
        }
    }
}

