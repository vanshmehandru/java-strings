import java.util.*;
class PasswordAnalyzer {
    static int[] analyze(String p){
        int u=0,l=0,d=0,s=0;
        for(char c:p.toCharArray()){
            if(c>=65&&c<=90) u++;
            else if(c>=97&&c<=122) l++;
            else if(c>=48&&c<=57) d++;
            else s++;
        }
        return new int[]{u,l,d,s};
    }
    static int score(String p){
        int[] a=analyze(p);
        int sc=Math.max(0,(p.length()-8)*2);
        int types=0; for(int x:a) if(x>0) types++;
        sc+=types*10;
        if(p.contains("123")||p.toLowerCase().contains("abc")||p.toLowerCase().contains("qwerty")) sc-=10;
        return sc;
    }
    static String level(int sc){
        if(sc<=20) return "Weak";
        if(sc<=50) return "Medium";
        return "Strong";
    }
    static String generate(int len){
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lo="abcdefghijklmnopqrstuvwxyz";
        String di="0123456789";
        String sp="!@#$%^&*";
        String all=up+lo+di+sp;
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        sb.append(up.charAt(r.nextInt(up.length())));
        sb.append(lo.charAt(r.nextInt(lo.length())));
        sb.append(di.charAt(r.nextInt(di.length())));
        sb.append(sp.charAt(r.nextInt(sp.length())));
        for(int i=4;i<len;i++) sb.append(all.charAt(r.nextInt(all.length())));
        List<Character> list=new ArrayList<>();
        for(char c:sb.toString().toCharArray()) list.add(c);
        Collections.shuffle(list);
        StringBuilder res=new StringBuilder();
        for(char c:list) res.append(c);
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        System.out.printf("%-15s %-6s %-3s %-3s %-3s %-3s %-5s %-8s\n","Password","Len","U","L","D","S","Score","Strength");
        for(int i=0;i<n;i++){
            String p=sc.nextLine();
            int[] a=analyze(p);
            int scv=score(p);
            System.out.printf("%-15s %-6d %-3d %-3d %-3d %-3d %-5d %-8s\n",p,p.length(),a[0],a[1],a[2],a[3],scv,level(scv));
        }
        int len=sc.nextInt();
        System.out.println("Generated: "+generate(len));
    }
}
