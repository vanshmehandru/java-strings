import java.util.*;
class SpellChecker {
    static String[] splitSentence(String s){
        ArrayList<String> list=new ArrayList<>();
        int start=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||!Character.isLetter(s.charAt(i))){
                if(start<i) list.add(s.substring(start,i));
                start=i+1;
            }
        }
        return list.toArray(new String[0]);
    }
    static int distance(String a,String b){
        int m=a.length(),n=b.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0]=i;
        for(int j=0;j<=n;j++) dp[0][j]=j;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++)
                dp[i][j]=a.charAt(i-1)==b.charAt(j-1)?dp[i-1][j-1]:
                        1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
        return dp[m][n];
    }
    static String suggest(String w,String[] dict){
        String best=w; int bestd=3;
        for(String d:dict){
            int dsc=distance(w.toLowerCase(),d.toLowerCase());
            if(dsc<bestd){bestd=dsc; best=d;}
        }
        return best;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int n=sc.nextInt();sc.nextLine();
        String[] dict=new String[n];
        for(int i=0;i<n;i++) dict[i]=sc.nextLine();
        String[] words=splitSentence(sentence);
        System.out.printf("%-15s %-15s %-10s %-10s\n","Word","Suggestion","Distance","Status");
        for(String w:words){
            String sgt=suggest(w,dict);
            int dsc=distance(w.toLowerCase(),sgt.toLowerCase());
            String status=dsc==0?"Correct":"Misspelled";
            System.out.printf("%-15s %-15s %-10d %-10s\n",w,sgt,dsc,status);
        }
    }
}
