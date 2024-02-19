package com.iiht.evaluation.automation.functional;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

import com.iiht.evaluation.automation.Activities;
import com.iiht.evaluation.automation.App;
import com.iiht.evaluation.automation.testutils.MasterData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import com.iiht.evaluation.automation.SubActivities;
import org.testng.annotations.*;

import static com.iiht.evaluation.automation.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.automation.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.automation.testutils.TestUtils.yakshaAssert;

public class TestAutomation extends App {

    @Test
    public void test_arrival_images_add_to_basket_clik_on_shop_menu() throws IOException {
        boolean testcase_status = true;
        try {
            boolean click_shop_menu_succeed = Activities.click_shop_menu(driver);
            System.out.println("click_shop_menu_succeed " + click_shop_menu_succeed);
            if (!click_shop_menu_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_arrival_images_add_to_basket_clik_home_menu_button() throws IOException {
        boolean testcase_status = true;
        try {
            boolean click_home_menu_button_succeed = Activities.click_home_menu_button(driver);
            System.out.println("click_home_menu_button_succeed " + click_home_menu_button_succeed);
            if (!click_home_menu_button_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_check_home_page_has_three_arrivals() throws IOException {
        boolean testcase_status = true;
        try {
            boolean check_home_page_has_three_arrivals_succeed = Activities.check_home_page_has_three_arrivals(driver);
            System.out.println("check_home_page_has_three_arrivals_succeed " + check_home_page_has_three_arrivals_succeed);
            if (!check_home_page_has_three_arrivals_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_click_image_in_arrival() throws IOException {
        boolean testcase_status = true;
        String product_name = MasterData.test_arrival_images_add_to_basket_master_data.get("product_name");
        try {
            boolean click_image_in_arrival_succeed = Activities.click_product_product_image_in_arrival(driver,product_name);
            System.out.println("click_image_in_arrival_succeed " + click_image_in_arrival_succeed);
            if (!click_image_in_arrival_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_click_add_to_basket_button_product_detail_page() throws IOException {
        boolean testcase_status = true;
        try {
            boolean click_add_to_basket_button_product_detail_page_succeed = Activities.click_add_to_basket_button_product_detail_page(driver);
            System.out.println("click_add_to_basket_button_product_detail_page_succeed " + click_add_to_basket_button_product_detail_page_succeed);
            if (!click_add_to_basket_button_product_detail_page_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_check_product_added_message_product_detail_page() throws IOException {
        String product_name = MasterData.test_arrival_images_add_to_basket_master_data.get("product_name");
        boolean testcase_status = true;
        try {
            boolean check_product_added_message_product_detail_page_succeed = Activities.check_product_added_message_product_detail_page(driver,product_name);
            System.out.println("check_product_added_message_product_detail_page_succeed " + check_product_added_message_product_detail_page_succeed);
            if (!check_product_added_message_product_detail_page_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

}

