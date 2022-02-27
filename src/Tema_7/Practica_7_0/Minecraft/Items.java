package Tema_7.Practica_7_0.Minecraft;

public enum Items 
{
	PICKAXE(1,false),
	SWORD(1,false),
	STONE(64,true),
	WOOD(64,true),
	EGG(16,true),
	ENDER_PEARL(16,true);
	
	private int stack;
	private boolean stackeable;
	
	Items(int stack, boolean stackeable) 
	{
		this.stack = stack;
		this.stackeable = stackeable;
	}
	
	public int getStack() {return this.stack;}
	public boolean isStackeable() {return this.stackeable;}

	
}
