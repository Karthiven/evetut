package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import base.Cmsbase;

import utility.MKD;
import pages.homepage;

public class cmslandtestandlinkverify extends Cmsbase{
	
	
	
	homepage hp;
	
	
	@Test
	public void verifylandingpage()
	{
		//Loggs.infolog("verify landing page test starting");
		
		logger=extent.startTest(" verifylandingpage");
		
		
		String acpagetitle="Dashboard ‹ opensourcecms — WordPress";
		doWaitSec(WAIT_SEC_1);
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		doWaitSec(WAIT_SEC_1);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
		as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
	//	Loggs.infolog("successfully landed on landing page");
	logger.log(LogStatus.PASS,"home page landed on");
		}
		else
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			//Loggs.errorlog("failed to land on page");
			logger.log(LogStatus.FAIL, "not landed on home page");
		}
		//Loggs.infolog("verify landing page test done");
		
		System.out.println("added by nihal");
		as.assertAll();
		
		
		
	
	}
	
	/*@Test
	public void verifypostlink()
	{
		
		
		//logger=extent.startTest(" verify post link");
		
		 hp=new homepage();
		 hp.getpostl().click();
		 doWaitSec(WAIT_SEC_1);
		
		System.out.println("pagetitle");
		
		String acpagetitle="Posts ‹ opensourcecms — WordPress";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		//logger.log(LogStatus.PASS,"post page landed on");
		}
		else
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			//logger.log(LogStatus.FAIL, "not landed on post page");
		}
		
		as.assertAll();
	}
	
	@Test
	public void verifymedialink()
	{
		
		
		//logger=extent.startTest(" verify media link");
		
		 hp=new homepage();
		 hp.getmedial().click();
		 doWaitSec(WAIT_SEC_1);
		
		System.out.println("pagetitle");
		
		String acpagetitle="Media Library ‹ opensourcecms — WordPress";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		//logger.log(LogStatus.PASS,"media page landed on");
		}
		else
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			//logger.log(LogStatus.FAIL, "not landed on media page");
		}
		
		as.assertAll();
		
		
	}
	
	@Test
	public void verifyuserslink()
	{
		
		
	//	logger=extent.startTest(" verify user link");
		
		 hp=new homepage();
		 hp.getUsersl().click();
		 doWaitSec(WAIT_SEC_1);
		
		System.out.println("pagetitle");
		
		String acpagetitle="Users ‹ opensourcecms — WordPress";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		//logger.log(LogStatus.PASS,"users page landed on");
		}
		else
		{
			as.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			//logger.log(LogStatus.FAIL, "not landed on users page");
		}
		as.assertAll();
		
	}*/
	
	

	
}
