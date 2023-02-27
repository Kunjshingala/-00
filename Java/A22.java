package Java;

class A2 {
public static void checkPalindrome(String s) 
{ 
// reverse the given
String Stringreverse = new StringBuffer(s).reverse().toString();
// checks whether the string is palindrome or not
if (s.equals(reverse))
System.out.println("Yes, it is a palindrome"); 
else 
System.out.println("No, it is not a palindrome");
}

    public static void main(String[] args)
            throws java.lang.Exception {
        checkPalindrome("madam");
    }
}
