import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.imageio.stream.FileImageInputStream;


public class Copy {
	public static void main(String[] args) throws Exception {
		InputStream a=new FileInputStream(new File("C:"+File.separator+"1.text"));
		OutputStream b=new FileOutputStream(new File("C:/e.text"));
		byte []c=new byte[1024];
		int len;
		while((len=a.read(c))!=-1){
			b.write(c, 0, len);
			b.flush();
		}
		PrintStream d=new PrintStream(new File("C:/e.text"));
		d.print("wewew");
	}
}
