package Khalid;

import org.junit.jupiter.api.Test;

public class LogoutTest {



    DashboardPage dashboardPage;
    LoginPage loginPage;
    EmployeeInfoPage employeeInfoPage;
    @Test(priority = 1, description = "Login With Second User")
    public void doLoginWithSecondUsers() throws IOException, ParseException, InterruptedException {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        JSONObject userObject = Utils.loadJSONFileContainingArray("./src/test/resources/Employee.json", 1);
        String username = userObject.get("username").toString();
        String password = userObject.get("password").toString();
        loginPage.doLogin(username, password);
        Thread.sleep(1500);

        // Assertion
        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "Dashboard";
        Assert.assertEquals(header_actual, header_expected);
        Thread.sleep(1500);

    }
    @Test(priority = 2, description = "Insert second user's Gender, Blood Type, Address and Email ")
    public void updateUserInformation() throws IOException, ParseException, InterruptedException {
        employeeInfoPage=new EmployeeInfoPage(driver);
        employeeInfoPage.userMenu.get(2).click();
        Utils.doScroll(driver,500);
        employeeInfoPage.selectGender o();
        Thread.sleep(1000);
        Utils.doScroll(driver,500);
        employeeInfoPage.selectBloodType();
        Thread.sleep(1000);
        driver.navigate().refresh();
        employeeInfoPage.selectContact();
        Thread.sleep(1000);

        // Assertion
        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "PIM";
        Assert.assertEquals(header_actual, header_expected);
        Thread.sleep(1000);
    }
    @Test(priority = 3,description = "Second User Logout Successfully")
    public void LogOut() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.doLogout();
        driver.close();
    }

 
}
