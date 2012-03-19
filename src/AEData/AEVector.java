package AEData;

public class AEVector extends AEData
{
	private float m_x;
	private float m_y;
	private float m_z;

	public AEVector()
	{
		this.SetValueX(0.0f);
		this.SetValueY(0.0f);
		this.SetValueZ(0.0f);
	}
	
	public AEVector(AEVector vector)
	{
		this.SetValue(vector.m_x, vector.m_y, vector.m_z);
	}
	
	public float GetValueX()
	{
		return m_x;
	}

	public float GetValueY()
	{
		return m_y;
	}
	
	public float GetValueZ()
	{
		return m_z;
	}

	public void SetValueX(float x)
	{
		this.m_x = x;
	}
	
	public void SetValueY(float y)
	{
		this.m_y = y;
	}
	
	private void SetValueZ(float z)
	{
		this.m_z = z;
	}
	
	public void SetValue(float x, float y)
	{
		this.SetValueX(x);
		this.SetValueY(y);
	}
	
	public void SetValue(float x, float y, float z)
	{
		this.SetValueX(x);
		this.SetValueY(y);
		this.SetValueZ(z);
	}

	public void AddValue(AEVector rData)
	{
		this.AddValueX(rData.m_x);
		this.AddValueY(rData.m_y);
		this.AddValueZ(rData.m_z);		
	}

	private void AddValueX(float x)
	{
		this.m_x += x;
	}
	
	private void AddValueY(float y)
	{
		this.m_y += y;
	}
	
	private void AddValueZ(float z)
	{
		this.m_z += z;
	}
	
	public void SubValue(AEVector rData)
	{
		this.SubValueX(rData.m_x);
		this.SubValueY(rData.m_y);
		this.SubValueZ(rData.m_z);
	}
	
	private void SubValueX(float x)
	{
		this.m_x -= x;
	}

	private void SubValueY(float y)
	{
		this.m_y -= y;
	}
	
	private void SubValueZ(float z)
	{
		this.m_z -= z;
	}

	// operator
	public AEVector Add(AEVector rData)
	{
		AEVector temp = new AEVector(this);
		
		temp.AddValue(rData);
		
		return temp;
	}
	
	public AEVector Sub(AEVector rData)
	{
		AEVector temp = new AEVector(this);
		
		temp.SubValue(rData);
		
		return temp;
	}
	
	public float InnerDot(AEVector rData)
	{
		// TODO: implemente
		return 0.0f;
	}
	
	public float OutterDot(AEVector rData)
	{
		// TODO: implemente
		return 0.0f;
	}
	
	public float Length()
	{
		return (float)Math.sqrt( ( this.m_x * this.m_x ) + ( this.m_y * this.m_y ) + ( this.m_z * this.m_z ) );
	}
	
	public void Normalize()
	{
		float length = this.Length();
		
		this.m_x /= length;
		this.m_y /= length;
		this.m_z /= length;
	}
}