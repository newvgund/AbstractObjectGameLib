package AEData;

// @ Rect 데이터
// 사각형 데이터 입니다. 

public class AERect extends AEData
{
	private float m_x;
	private float m_y;
	private float m_w;
	private float m_h;

	public AERect()
	{
		this.SetValueX(0.0f);
		this.SetValueY(0.0f);
		this.SetValueW(0.0f);
		this.SetValueH(0.0f);
	}
	
	public void SetValue(float x, float y)
	{
		this.SetValueX(x);
		this.SetValueY(y);
	}
	
	public void SetSize(float w, float h)
	{
		this.SetValueH(w);
		this.SetValueH(h);
	}
	
	public void SetValue(float x, float y, float w, float h)
	{
		this.SetValueX(x);
		this.SetValueY(y);
		this.SetValueW(w);
		this.SetValueH(h);
	}

	public float GetValueX()
	{
		return m_x;
	}

	public void SetValueX(float x)
	{
		this.m_x = x;
	}

	public float GetValueY()
	{
		return m_y;
	}

	public void SetValueY(float y)
	{
		this.m_y = y;
	}

	public float GetValueW()
	{
		return m_w;
	}

	public void SetValueW(float w)
	{
		this.m_w = w;
	}

	public float GetValueH()
	{
		return m_h;
	}

	public void SetValueH(float h)
	{
		this.m_h = h;
	}
}
