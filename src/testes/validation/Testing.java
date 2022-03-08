package testes.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import testes.Globale;
import testes.particulier.CongeTest;
import testes.particulier.EmployeeTest;
import testes.particulier.SalaireTest;

public class Testing {
	Globale g;
	CongeTest ct;
	EmployeeTest et;
	SalaireTest st;
	@Before
	public void initialiser()
	{
		g=new Globale();
		ct=new CongeTest();
		st= new SalaireTest();
		et=new EmployeeTest();
	}
	@Test
	public void verifChaineCaracter()
	{
		//assertTrue(g.verifChaine(""));
		assertFalse(g.verifChaine("bonjour"));
	}
	@Test
	public void verifConversion()
	{
		assertTrue(g.conversion("33"));
		
	}
	// verification des congés
	@Test
	public void verifDuree()
	{
		assertTrue(ct.verifDuree(10));
	}
	@Test
	public void verifRaison()
	{
		assertTrue(ct.verifRaison("maladie covid urgente"));
	}
	//verification des salaires
	@Test
	public void verifNett()
	{
		assertTrue(st.VerifNet(2000));
	}
	@Test
	public void verifBrute()
	{
		assertTrue(st.verifSalaire(1800, 1400));
	}
// verification des employées
	@Test
	public void verifNom()
	{
		assertTrue(et.validerName("testeAdmin"));
		
	}
	@Test
	public void verifEmail()
	{
		assertTrue(et.emailValid("test@admin.com"));
		
	}
	
	
}
