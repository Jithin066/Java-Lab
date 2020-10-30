class prime{
public static void main(String args[])
{
int num,l,k=0;
num=57;
l=num/2;
for(int i=2;i<l;i++)
{
if((num%i)==0)
{
System.out.println("the number is not prime");
k=1;
break;
}}
if(k==0)
System.out.println("It is a prime number");
}}



