class palindrom
{
public static void main(String args[])
{
int l,r,sum=0;
int num=787;
l=num;
while(num>0)
{
r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if(l==sum)
System.out.println("The number is a palindrome");
else
System.out.println("The number is not a palindrome");
}}