package Day2;

public class Criteria {

    private String Path;
    private int numFolder;
    private int numFile;
    private String extension;

    public Criteria(String path){
        this.Path = path;
    }

    public void setPath(String path) {
        this.Path = path;
    }

    public void setNumFolder(int numFolder) {
        this.numFolder = numFolder;
    }

    public void setNumFile(int numFile) {
        this.numFile = numFile;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPath() {
        return Path;
    }

    public int getNumFolder() {
        return numFolder;
    }

    public int getNumFile() {
        return numFile;
    }

    public String getExtension() {
        return extension;
    }

}
