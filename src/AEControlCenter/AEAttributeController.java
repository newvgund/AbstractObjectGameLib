package AEControlCenter;

import AEAttribute.*;
import AEObject.*;

public class AEAttributeController extends AEControlCenter
{
	// This function is test function. this will be modify.
	public void SetPosition(AEObject tempCharacter)
	{
		AEPositionAttribute tempAttribute = (AEPositionAttribute)tempCharacter.FindAttribute("Attr_Position");
		
		if( tempAttribute != null )
		{
			tempAttribute.SetPosition(10, 10);
		}
	}

}
