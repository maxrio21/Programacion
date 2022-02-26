package Tema_6.Practica_6_Opcional;

import java.util.ArrayList;

public class intArray 
{
	private int size;
	private ArrayList<Integer> intArrayList = new ArrayList<Integer>();
	
	public intArray()
	{
		
	}
	
	public intArray(int size) 
	{
		this.size = size;
	}
	
	public int getSize() {return this.size;}
	public ArrayList<Integer> getIntArrayList() {return this.intArrayList;}
	
	public void setSize(int size) {this.size = size;}
	public void addToArrayList(int e) {this.intArrayList.add(e);}
	
	/*
	 * Ejercicio 4
	 */
	
	public int getBigger() 
	{
        int maximo = this.intArrayList.get(0);
  
        for (int i = 1; i < this.intArrayList.size(); i++) 
        {
            if (this.intArrayList.get(i) > maximo) 
            {
            	maximo = this.intArrayList.get(i);
            }
        }
        return maximo;
	}
	
	/*
	 * Ejercicio 5
	 */
	
	private ArrayList<Integer> sumArray = new ArrayList<Integer>();
	private ArrayList<Integer> parArray = new ArrayList<Integer>();
	private ArrayList<Integer> imparArray = new ArrayList<Integer>();

	public int sumatorio(int num)
	{
		this.sumArray.add(num);
		
		if(num % 2 == 0) 
		{
			parArray.add(num);
		} 
		else 
		{
			imparArray.add(num);
		}
		
		if(num == 0) 
		{
			return 0;
		}
		else 
		{
			return num + sumatorio(num - 1);
		}
	}
	
	public void mostrar()
	{
		for(int i = 0;i < sumArray.size();i++)
		{
			System.out.println(sumArray.get(i)); 
		}
		
		System.out.println(this.imparArray);
	}
	
	/*
	 * Ejercicio 6
	 */
	
	public ArrayList<Integer> parOImpar()
	{
		int suma = 0;
		
		for(int i = 0;i < this.imparArray.size();i++)
		{
			suma = suma + this.imparArray.get(i);
		}
		
		if(suma % 2 == 0) 
		{
			return this.parArray;
		}
		else 
		{
			return this.imparArray;
		}
	}
	
}
