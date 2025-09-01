import java.util.*;

public class Problem5 {
    static boolean isValid(String email) {
        int at = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        int dot = email.lastIndexOf('.');
        return at > 0 && at == lastAt && dot > at + 1 && dot < email.length() - 1;
    }
    static void analyze(List<String> emails) {
        int valid = 0, invalid = 0, totalUserLen = 0;
        Map<String, Integer> domainCount = new HashMap<>();
        for (String e : emails) {
            boolean ok = isValid(e);
            if (ok) {
                valid++;
                String user = e.substring(0, e.indexOf('@'));
                totalUserLen += user.length();
                String domain = e.substring(e.indexOf('@') + 1);
                domainCount.put(domain, domainCount.getOrDefault(domain, 0) + 1);
                String domainName = domain.substring(0, domain.lastIndexOf('.'));
                String ext = domain.substring(domain.lastIndexOf('.') + 1);
                System.out.println(e + " | " + user + " | " + domain + " | " + domainName + " | " + ext + " | Valid");
            } else {
                invalid++;
                System.out.println(e + " | Invalid");
            }
        }
        System.out.println("Valid: " + valid + " Invalid: " + invalid);
        if (valid > 0) System.out.println("Avg username length: " + (totalUserLen / valid));
        String most = "";
        int max = 0;
        for (String d : domainCount.keySet()) if (domainCount.get(d) > max) { max = domainCount.get(d); most = d; }
        if (!most.isEmpty()) System.out.println("Most common domain: " + most);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> emails = new ArrayList<>();
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) emails.add(sc.nextLine());
        analyze(emails);
    }
}
