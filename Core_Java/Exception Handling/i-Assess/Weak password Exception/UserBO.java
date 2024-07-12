

public class UserBO {
	//Your code here
	public static boolean isdigit(String pass) {
		for(char c:pass.toCharArray()) {
			if(Character.isDigit(c)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static boolean isLetter(String pass) {
		for(char c:pass.toCharArray()) {
			if(Character.isLetter(c)) {
				return true;
			}
		}
		return false;
	}
	public static boolean isspecial(String pass) {
		for(char c:pass.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) {
				return true;
			}
		}
		return false;
	}
	public static void validate(User user) throws WeakPasswordException{
		
		String p=user.getPassword();
		if(p.length()<10 || p.length()>20 || !isspecial(p) || !isLetter(p) || !isdigit(p)) {
			throw new WeakPasswordException("Your password is weak");
		}
		
	}
}
