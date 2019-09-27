package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontEndTests {

    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void navTeamsToPlayersTest() throws InterruptedException {
        driver.get("http://34.89.70.8/index.html");
        Thread.sleep(1000);

        WebElement playersPageRef = driver.findElementById("playersPageRef");
        playersPageRef.click();
        Thread.sleep(1000);
    }

    @Test
    public void navPlayersToTeamsTest() throws InterruptedException {
        driver.get("http://34.89.70.8/players.html");
        Thread.sleep(1000);

        WebElement teamsPageRef = driver.findElementById("teamsPageRef");
        teamsPageRef.click();
        Thread.sleep(1000);
    }

    @Test
    public void sortTeamsTest() throws InterruptedException {
        driver.get("http://34.89.70.8/index.html");
        Thread.sleep(1000);

        WebElement sortButton = driver.findElementById("sortTeamButton");
        sortButton.click();
        Thread.sleep(1000);
    }

    @Test
    public void sortPlayersTest() throws InterruptedException {
        driver.get("http://34.89.70.8/players.html");
        Thread.sleep(1000);

        WebElement sortButton = driver.findElementById("sortPlayerButton");
        sortButton.click();
        Thread.sleep(1000);
    }

    @Test
    public void addTeamTest() throws InterruptedException {
        driver.get("http://34.89.70.8/index.html");
        Thread.sleep(1000);

        WebElement addButton = driver.findElementById("addTeamButton");
        addButton.click();
        Thread.sleep(1000);

        WebElement teamNameField = driver.findElementById("inputName");
        teamNameField.sendKeys("Test Team");
        Thread.sleep(1000);
        WebElement teamRatingField = driver.findElementById("inputRating");
        teamRatingField.sendKeys("666");
        Thread.sleep(1000);
        WebElement submitTeamAdd = driver.findElementById("addTeamSubmit");
        submitTeamAdd.click();
        teamRatingField.sendKeys(Keys.RETURN);
        //driver.navigate().refresh();
        Thread.sleep(5000);
    }

    @Test
    public void updateTeamTest() throws InterruptedException {
        driver.get("http://34.89.70.8/index.html");

        WebElement updateTable = driver.findElementById("teamTable");
        updateTable.click();
        Thread.sleep(1000);

        WebElement teamIdField = driver.findElementById("inputUpdateId");
        teamIdField.sendKeys("1");
        Thread.sleep(1000);
        WebElement teamNameField = driver.findElementById("inputUpdateName");
        teamIdField.sendKeys("Liquid");
        Thread.sleep(1000);
        WebElement teamRatingField = driver.findElementById("inputUpdateRating");
        teamRatingField.sendKeys("982");
        Thread.sleep(1000);
        WebElement submitTeamAdd = driver.findElementById("updateTeamSubmit");
        submitTeamAdd.click();
        Thread.sleep(1000);
    }

    @Test
    public void deleteTeamTest() throws InterruptedException {
        driver.get("http://34.89.70.8/index.html");
        Thread.sleep(1000);

        WebElement updateTable = driver.findElementByXPath("//*[@id=\"tableBodyPlayers\"]/tr[1]");
        updateTable.click();
        Thread.sleep(1000);

        WebElement idField = driver.findElementById("idToDeleteTeam");
        idField.sendKeys("1");
        Thread.sleep(1000);
        WebElement deleteButton = driver.findElementById("deleteTeamSubmit");
        Thread.sleep(100);

    }

    @Test
    public void addPlayerTest() throws InterruptedException {
        driver.get("http://34.89.70.8/players.html");
        Thread.sleep(1000);

        WebElement addButton = driver.findElementById("addPlayerButton");
        addButton.click();
        Thread.sleep(1000);

        WebElement teamNameField = driver.findElementById("inputName");
        teamNameField.sendKeys("Test Player");
        Thread.sleep(1000);
        WebElement teamTeamField = driver.findElementById("inputTeam");
        teamTeamField.sendKeys("Test teamName");
        Thread.sleep(1000);
        WebElement teamRatingField = driver.findElementById("inputRating");
        teamRatingField.sendKeys("1000");
        Thread.sleep(1000);
        WebElement teamRoleField = driver.findElementById("inputRole");
        teamRoleField.sendKeys("testRole");
        Thread.sleep(1000);
        WebElement submitTeamAdd = driver.findElementById("addPlayerSubmit");
        submitTeamAdd.click();
        teamRatingField.sendKeys(Keys.RETURN);
        //driver.navigate().refresh();
        Thread.sleep(5000);
    }

}