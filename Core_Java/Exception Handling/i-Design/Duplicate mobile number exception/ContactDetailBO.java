import java.util.*;
import java.io.*;
public class ContactDetailBO{
		//your code here
	public static void validate(String mobile,String AlternateMobile) throws DuplicateMobileNumberException
    {
       // fill the code
		if(mobile.equals(AlternateMobile)) {
			throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
		}
    }
}
