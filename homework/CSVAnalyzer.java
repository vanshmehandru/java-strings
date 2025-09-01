import java.util.*;

class CSVAnalyzer {
    static String[][] parseCSV(String data) {
        ArrayList<String[]> rows = new ArrayList<>();
        int i = 0, start = 0;
        ArrayList<String> fields = new ArrayList<>();
        while (i <= data.length()) {
            if (i == data.length() || data.charAt(i) == ',' || data.charAt(i) == '\n') {
                fields.add(data.substring(start, i).trim());
                start = i + 1;
                if (i == data.length() || data.charAt(i) == '\n') {
                    rows.add(fields.toArray(new String[0]));
                    fields.clear();
                }
            }
            i++;
        }
        return rows.toArray(new String[0][]);
    }

    static void analyze(String[][] data) {
        for (String[] row : data) System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            sb.append(line).append("\n");
        }
        String[][] data = parseCSV(sb.toString());
        analyze(data);
    }
}
