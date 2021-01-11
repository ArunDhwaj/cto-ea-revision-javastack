public class MySwitch
{
    public static void main(String[] args) 
    {
        String value = "SBP";
 
        switch (value) 
        {
            case "SB":
                System.out.println("Value is SmartBit");
                break;
            case "SBP": 
                System.out.println("Value is SmartBitPixel");
                break;
            default:
                System.out.println("Value is neither SB nor SBP");
                break;
        }
    }
}
