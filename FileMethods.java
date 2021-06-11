import java.io.File;
import java.io.IOException;
public class FileMethods 
{
public static void main(String[] args) throws IOException 
{
//File f = new File("C:\\Raja\\Methods\\SubFolders\\Sub2\\FirstFile");
File f = new File("C:\\Raja\\Methods\\SubFolders\\Sub2");
//System.out.println(f.exists());
//if(!f.exists())
//if(f.exists())
//f.mkdirs();
//f.createNewFile();
//f.delete();
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.canExecute());
String[] s = f.list();
for(String arr : s)
{
if(arr.charAt(0)=='S')
System.out.println(arr);
}
File[]h=f.listFiles();
for(File file:h)
{
	if(f.isDirectory())
	{
//System.out.println(file.getName());
if(file.getName().charAt(0)=='S')
{
System.out.println("");
System.out.println(file.getName());
}
System.out.println(f.isHidden());
}
}
}
}
