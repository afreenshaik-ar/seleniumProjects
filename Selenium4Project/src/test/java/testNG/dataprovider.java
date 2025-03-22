package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "dp")
  public void f(String s,Integer n) {
	  System.out.println("Employee name is "+s+", emp no is "+n);
  }

  @DataProvider
  public Object[][] dp() {
     Object[][] data=new Object[2][2];
      data[0][0]="Aff";
      data[0][1]=1111;
      
      data[1][0]="Abdul";
      data[1][1]=2222;
      
      return data;
    
  }
}
