package specification;

import java.io.IOException;

public interface ProjectSpecification {

    public abstract void saveFile(Object o,String path, int val) throws IOException;
    public abstract void downloadFile(Object o,String path, int val) throws IOException;
    public abstract void deleteFile(Object o,String path, int val) throws IOException;
    public abstract void viewFile(Object o,String path, int val) throws IOException;
    public abstract void createStorage(Object o,String path,int val) throws IOException;
    public abstract void createFile(Object o,String path,int val) throws IOException;
    public abstract void moveFile(Object o,String file,String target) throws IOException;
    
}
