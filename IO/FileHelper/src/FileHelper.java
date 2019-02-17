import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileHelper {
    public void copy(File file1, File file2) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;

        FileOutputStream fos = null;
        OutputStreamWriter osr = null;
        PrintWriter pw = null;
        try {
            fis = new FileInputStream(file1);
            isr = new InputStreamReader(fis, "UTF-8");

            reader = new BufferedReader(isr);

            fos = new FileOutputStream(file2);
            osr = new OutputStreamWriter(fos, "UTF-8");

            pw = new PrintWriter(osr);
            String s;
            while((s = reader.readLine()) != null) {
                pw.print(s + "\n");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null)
                    reader.close();
                if(isr!=null)
                    isr.close();
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(pw!=null)
                pw.flush();
            pw.close();
            try {
                if(osr!=null)
                    osr.close();
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        File file1 = new File("E:/a.txt");
        File file2 = new File("E:/b.txt");
        FileHelper fh = new FileHelper();
        fh.copy(file1, file2);
    }

}