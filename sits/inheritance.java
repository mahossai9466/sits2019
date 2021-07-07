package sits221;

class house_grandpa

{
 public void house()
 
     {
	 System.out.println(" Grand Father house");
     }
 public void  car ()
    {
	 System.out.println(" Grand Father car");
    }
}

class father extends house_grandpa
{
	public  void boat()
	{
		System.out.println(" Father's boat");	
	}
}

class me extends father
{
      public void bike()
      {
    		System.out.println(" my bike");	  
      }
}


public class inheritance {

	public static void main(String[] args) {
	
	father f = new father();
	f.boat();
	f.house();
	f.car();
	
	System.out.println("-------------------------------------------");
	me  m = new me();
	m.bike();
	m.boat();
	m.car();
	m.house();
		

	}

}
