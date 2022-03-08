package testes.particulier;

public class CongeTest {
public boolean verifDuree(int duree)
{
return duree>=1;	
}
public boolean verifRaison(String raison)
{
	return raison.length()>8;
	}
public boolean verifTitre(String titre)
{
if(titre.length()>10)
	return true;
else 
	return false;
}
}
