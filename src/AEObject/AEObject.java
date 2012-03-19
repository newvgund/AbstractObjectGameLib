package AEObject;

import java.util.HashMap;

import AEAttribute.*;
import AEEvent.*;

public abstract class AEObject
{
	protected HashMap< String, AEEvent > m_eventList;
	protected HashMap< String, AEAttribute > m_attributeList;
	
	AEObject()
	{
		m_eventList = new HashMap< String, AEEvent >();
		m_attributeList = new HashMap< String, AEAttribute >();
	}
	
	protected boolean SetPositionAttribute()
	{
		if( m_attributeList.get("Attr_Position") == null )
		{
			m_attributeList.put("Attr_Position", new AEPositionAttribute());
		
			return true;
		}
		
		return false;
	}
	
	protected boolean SetCollisionAttribute()
	{
		if( m_attributeList.get("Attr_Position") == null )
		{
			m_attributeList.put("Attr_Position", new AEPositionAttribute());
		
			return true;
		}
		
		return false;
	}
	
	protected boolean SetFramemoveAttribute()
	{
		if( m_attributeList.get("Attr_Position") == null )
		{
			m_attributeList.put("Attr_Position", new AEPositionAttribute());
		
			return true;
		}
		
		return false;
	}
}
