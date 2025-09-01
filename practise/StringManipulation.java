package practise;
class StringManipulation {
    public static void main(String[] args) {
        String str = "Java Programming";
        String str1 = new String("Java Programming");
        char[] chars = {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
        String str2 = new String(chars);
        System.out.print("\n str==str1:" + (str == str1));
        System.out.print("\n str==str2:" + (str == str2));
        System.out.print("\n str1==str2:" + (str1 == str2));
        
        System.out.print("\n str.equals(str1): " + str.equals(str1));
        System.out.print("\n str.equals(str2): " + str.equals(str2));
        System.out.print("\n str1.equals(str2): " + str1.equals(str2));
        
        String quote = "Programming Quote: \n\"Code is poetry\" - Unknown\nPath: C:\\Java\\Projects";
        System.out.print(quote);
    }
}
