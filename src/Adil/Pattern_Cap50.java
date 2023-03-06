package Adil;

public class Pattern_Cap50 {

	public static void main(String[] args) {

		int n=5;
		for(int r=1; r<=n; r++)
		{
			for(int a=1; a<=n-r+1; a++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
