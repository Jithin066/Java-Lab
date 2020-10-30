class fibonacci
{
public static void main(String args[])
{
int n=9,n1,n2,n3;
n1=0;
n2=1;
System.out.println("The fibonacci series :");
System.out.print(n1+" "+n2);
for(int i=1;i<n;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.print(" "+n3);
}}}
