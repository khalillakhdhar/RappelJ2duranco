package testes.particulier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeTest {
public boolean validerName(String name)
{
String regex="^[A-Za-z ]\\w{4,29}$";	
Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(name);
return m.matches();
}
public boolean emailValid(String email)
{
return email.contains("@") && email.contains(".");	

}
public int posspace(String mdp)
{
return mdp.indexOf(" ");	
}
public boolean verifTel(String tel)
{
	return tel.length()>8;
	
	}
public boolean verifGrade(String grade)
{
	switch (grade) {
	case "admin":
		return true;
	case "ouvrier":
		return true;
	case "employée":
		return true;
	default:
		return false;
	}
	
}
}
