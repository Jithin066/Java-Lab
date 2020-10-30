class amstrong
{
public static void main(String args[])
{
int r,sum=0,l; 
int num=153;
l=num;
while(num>0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
if(l==sum)
System.out.println("the number is armstong");
else
System.out.println("The number is not an armstong");
}}