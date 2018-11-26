package com.tws.refactoring.extract_variable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
public class BannerRenderTest {
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;
        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }
        @After
        public void restoreStreams() {
            System.setOut(originalOut);
        }
        @Test
        public void check_render_banner_is_finished() {
            BannerRender bannerRender = new BannerRender();
            bannerRender.renderBanner("MAC","IE");
            assertEquals("Render finished!", outContent.toString());
        }

}
