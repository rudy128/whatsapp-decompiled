package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collection;

public class DGA implements E9V {
    public final FileStash A00;

    public Collection BMs() {
        return this.A00.getAllKeys();
    }

    public void Bgr(String str) {
        File filePath = this.A00.getFilePath(str);
        if (filePath.exists()) {
            filePath.canExecute();
        }
    }

    public long Bh7(String str) {
        return this.A00.lastAccessTime(str);
    }

    public long Bh8(String str) {
        return this.A00.getItemSizeBytes(str);
    }

    public boolean remove(String str) {
        return this.A00.remove(str);
    }

    public DGA(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
