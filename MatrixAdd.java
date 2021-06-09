import java.util.Scanner;
class MatrixAdd
{
public static void main(String args[])
{
	int row,col,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Matrix Addition");
	System.out.println("Enter the no: of rows & columns of  matrices");
	 row=s.nextInt();
	 col=s.nextInt();
	int m1[][]=new int [row][col];
	int m2[][]=new int [row][col];
	int sum[][]=new int [row][col];
	System.out.println("Enter 1st matrix elements:");
	for(i=0;i<row;i++)
	for(j=0;j<col;j++)
	
	m1[i][j]=s.nextInt();
	System.out.println("Enter 2nd matrix elements:");
	for(i=0;i<row;i++)
	for(j=0;j<col;j++)
	
	m2[i][j]=s.nextInt();
	

	System.out.println("Matrix1");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{
	System.out.println(m1[i][j]+"\t");
	
}
	System.out.println();
	}

	System.out.println("Matrix2");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{
	System.out.println(m2[i][j]+"\t");
	
}
	System.out.println("");
	}
	
	
	

	System.out.println("Sum Matrix");
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{
	sum[i][j]=m1[i][j]+m2[i][j];
}
	}



	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
{
	System.out.println(sum[i][j]+"\t");
}
	System.out.println();
	}

}
}

	
	