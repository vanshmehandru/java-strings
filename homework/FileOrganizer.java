import java.util.*;

class FileOrganizer {
    static String getExt(String name) {
        int idx = name.lastIndexOf('.');
        return idx == -1 ? "" : name.substring(idx + 1);
    }

    static String getCategory(String ext) {
        if (ext.equals("txt") || ext.equals("doc")) return "Document";
        if (ext.equals("jpg") || ext.equals("png")) return "Image";
        if (ext.equals("mp3")) return "Audio";
        return "Other";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] files = new String[n];
        for (int i = 0; i < n; i++) files[i] = sc.nextLine();
        for (String f : files) {
            String ext = getExt(f);
            String cat = getCategory(ext);
            String newName = cat + "_" + f;
            System.out.println(f + " -> " + newName);
        }
    }
}
