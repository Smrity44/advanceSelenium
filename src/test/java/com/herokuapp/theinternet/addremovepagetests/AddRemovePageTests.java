package com.herokuapp.theinternet.addremovepagetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.AddRemovePage;
import org.testng.annotations.Test;

public class AddRemovePageTests extends TestUtilities {

    @Test
    public void testOpenAddRemovePage(){
      AddRemovePage addRemovePage = new AddRemovePage(driver,log);
      addRemovePage.openPage();
      addRemovePage.verifyDriverIsAddRemovePage();

    }
}
