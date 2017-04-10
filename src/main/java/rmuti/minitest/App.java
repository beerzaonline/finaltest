package rmuti.minitest;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayUtil arr =new ArrayUtil();

		System.out.println(arr.countNull(new String[] { "mms", null, "data", null, "data"}));
    }
}
