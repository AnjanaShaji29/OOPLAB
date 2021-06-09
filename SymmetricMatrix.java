import java.util.Scanner;
class SymmetricMatrix
{
public static void main(String args[])
{
	int row,col,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no: of rows & columns of matrix:");
	 row=s.nextInt();
	 col=s.nextInt();
	int m1[][]=new int [row][col];
	System.out.println("Enter the elements of matrix:");

	for(i=0;i<row;i++)
	for(j=0;j<col;j++)

	m1[i][j]=s.nextInt();

	System.out.println("Given Matrix:");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{

	System.out.println(m1[i][j]+"\t");
}
	System.out.println("");
	}
	if(row!=col)
	System.out.println("Enter a square matrix");
	
	else
{
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{
	if(m1[i][j]!=m1[j][i])
{
	System.out.println("Given Matrix is not Symmetric");
	System.exit(0);  
}
}
	}
	}
	System.out.println("Given Matrix is Symmetric");
		
		
}
}	
	