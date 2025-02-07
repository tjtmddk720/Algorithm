import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String input = br.readLine();
        int num = Integer.parseInt(br.readLine());

        List<Character> editor = new LinkedList<>();
        for(char c : input.toCharArray()) {
            editor.add(c);
        }
        ListIterator<Character> cursor = editor.listIterator(editor.size());

        while(num-- > 0) {
            String cmd = br.readLine();

            switch(cmd.charAt(0)) {
                case 'L':
                    if (cursor.hasPrevious()) cursor.previous();
                    break;
                    
                case 'D':
                    if (cursor.hasNext()) cursor.next();
                    break;
                    
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                    
                case 'P':
                    cursor.add(cmd.charAt(2));
                    break;
            }
        }
        for(char c : editor) {
            bw.write(c);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}