package myquestion7;

public abstract class AquaticInsect implements IInsect,INTAquaticInsect
{
	public void Swim()
	{
		System.out.println("Sploosh!");
	}
	public void MoveAntennae()
	{
		System.out.println("Moving my antennae underwater!");
	}
}