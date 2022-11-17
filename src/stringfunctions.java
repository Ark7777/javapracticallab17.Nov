public class stringfunctions
{
    public static void main(String... a)
    {
        String str1 = "Helloevereyone";
        String str2 = "from";
        String str3 = "java";
        int len = str1.length();
        System.out.println("The length of the String str1 using length() is "+len);
        String str4 = str1.concat(str2).concat(str3);
        System.out.println("The string after concatenation using concat() is " +str4);
        String str5 = (str3.toUpperCase());
        System.out.println("Uppercase is" +str5);
        char c = str4.charAt(5);
        System.out.println("The character atindex 5 using charAt() is  " +c);
        String str6 = "arkaprovomitra";
        String str7[]= str6.split("v");
        String part1 = str7[0];
        String part2 = str7[1];
        System.out.println("The string after spliting using split() will be = "+part1+" "+part2);
    }
}