package com.tws.refactoring.extract_variable;

public class BannerRender {
    void renderBanner(String platform, String browser) {
        boolean isContainsMac = platform.toUpperCase().contains("MAC");
        boolean isContainsIE = browser.toUpperCase().contains("IE");
        if (isContainsMac&&isContainsIE) {
            System.out.print("Render finished!");
        }
    }
}
