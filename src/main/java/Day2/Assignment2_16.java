package Day2;
import java.io.File;
import java.util.*;

public class Assignment2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Criteria c = new Criteria(path);
        count(c);
    }
    public static void count(Criteria criteria){
        File file = new File(criteria.getPath());
        Set<String> set = new HashSet<>();
        int numFolder = 0, numFile = 0;
        StringBuilder extension = new StringBuilder();
        if(file.isDirectory()){
            File[] f = file.listFiles();
            for(File idx : f){
                if(idx.isDirectory()){
                    numFolder++;
                }
                else{
                    numFile++;
                    set.add(getFileExtension(idx.getName()));
                }
            }
        }
        for (String s : set){
            extension.append(s).append(" ");
        }
        criteria.setNumFile(numFile);
        criteria.setNumFolder(numFolder);
        criteria.setExtension(extension.toString());
        System.out.println("-----");
        System.out.println("This folder contains " + numFolder + " folder(s) and " + numFile + " file(s)");
        System.out.println("Extension: " + set);
        System.out.println("-----");
    }

    public static String getFileExtension(String name) {
        if (name == null) {
            throw new IllegalArgumentException("fileName null");
        }
        String extension = "";
        int idx = name.lastIndexOf('.');
        if (idx > 0) {
            extension = name.substring(idx + 1);
        }
        return extension;
    }
}
