import AEControlCenter.AEAttributeController;
import AEObject.AECharacterObject;


public class testProject
{
	private static AEAttributeController m_testController;
	private static AECharacterObject tempCharacter;

	public static void main(String args[])
	{
		m_testController = new AEAttributeController();
		tempCharacter = new AECharacterObject();
		
		m_testController.SetPosition(tempCharacter);
	}
}
