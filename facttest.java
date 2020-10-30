class factorial
{
void fact(int n)
{
int f;
if(n==0)
return 1;
else
for(int i=1;i<=n;i++)
{
f*=i;
}
System.out.println("The factorial of "+n+" is:"+f);

}}
class facttest
{
public static void main(String args[])
{
factorial f=new factorial();
f.fact(5);
}}