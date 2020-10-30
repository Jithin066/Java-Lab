class palindromeword
{
public static void main(String args[])
{
int l=0,k;
String num="malayalam";
k=num.length()-1;
for(int i=0;i<k/2;i++)
{
if(num.charAt(i)==num.charAt(k-i))
{
System.out.println(i+"th element and "+(k-i)+"th elements are same");
l=1;
}
else
System.out.println(i+"th element and "+(k-i)+"th elements are not same");
}
if(l==1)
System.out.println("The word is a palindrome");
else
System.out.println("The word is not a palindrome");
}}