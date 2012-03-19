package AEAttribute;

import AEData.*;

public class AEPositionAttribute extends AEModifiableAttribute
{
	private AEVector m_position;
	
	public AEPositionAttribute()
	{
		SetPosition(new AEVector());
	}

	public AEVector GetPosition()
	{
		return m_position;
	}

	public void SetPosition(AEVector position)
	{
		this.m_position = position;
	}
	
	public void SetPosition(float x, float y)
	{
		this.m_position.SetValue(x, y);
	}
}
