package testes;

public class Globale {
	public boolean verifChaine(String ch)
	{
		return ch.isEmpty();
		
	}
	public boolean conversion(String conversible)
	{
		try
		{
			Integer.parseInt(conversible);
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	

}
