import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {


    @Test( description = "Do sum")
    public void doSeries(){
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String resActual = calculatorScreen.doSeries(1,0,0,1,0,5,1,0,6,0);
        System.out.println(resActual);
        String resExpected = "100";
        Assert.assertTrue(resActual.contains(resExpected));
    }
}
