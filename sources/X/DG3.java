package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class DG3 implements FileStash {
    public final FileStash A00;

    public Set getAllKeys() {
        LinkedHashSet linkedHashSet;
        if (!(this instanceof C22913BVb)) {
            return this.A00.getAllKeys();
        }
        C22913BVb bVb = (C22913BVb) this;
        E7V e7v = bVb.A00;
        long now = e7v.now();
        long j = C22913BVb.A04;
        if (e7v.now() - bVb.A02 > j) {
            Set set = bVb.A01;
            synchronized (set) {
                if (e7v.now() - bVb.A02 > j) {
                    set.clear();
                    set.addAll(bVb.A00.getAllKeys());
                    bVb.A02 = now;
                }
            }
        }
        Set set2 = bVb.A01;
        synchronized (set2) {
            linkedHashSet = new LinkedHashSet(set2);
        }
        return linkedHashSet;
    }

    public File getBaseStoragePath_ForInternalUse() {
        return this.A00.getBaseStoragePath_ForInternalUse();
    }

    public File getFilePath(String str) {
        return this.A00.getFilePath(str);
    }

    public int getItemCount() {
        Set allKeys;
        if (!(this instanceof C22913BVb)) {
            return this.A00.getItemCount();
        }
        C22913BVb bVb = (C22913BVb) this;
        if (bVb.A02 != C22913BVb.A03) {
            allKeys = bVb.A01;
        } else {
            allKeys = bVb.getAllKeys();
        }
        return allKeys.size();
    }

    public long getItemSizeBytes(String str) {
        return this.A00.getItemSizeBytes(str);
    }

    public long getSizeBytes() {
        return this.A00.getSizeBytes();
    }

    public boolean hasKey(String str) {
        if (!(this instanceof C22913BVb)) {
            return this.A00.hasKey(str);
        }
        C22913BVb bVb = (C22913BVb) this;
        if (bVb.A02 == C22913BVb.A03) {
            Set set = bVb.A01;
            if (!set.contains(str)) {
                if (!bVb.A00.hasKey(str)) {
                    return false;
                }
                set.add(str);
                return true;
            }
        }
        return bVb.A01.contains(str);
    }

    public long lastAccessTime(String str) {
        return this.A00.lastAccessTime(str);
    }

    public InputStream read(String str) {
        FileStash fileStash;
        if (this instanceof C22914BVc) {
            C22914BVc bVc = (C22914BVc) this;
            if (bVc.A00.isEmpty()) {
                fileStash = bVc.A00;
            } else {
                try {
                    return bVc.A00.read(str);
                } finally {
                    C22914BVc.A01(bVc);
                }
            }
        } else {
            fileStash = this.A00;
        }
        return fileStash.read(str);
    }

    public byte[] readResourceToMemory(String str) {
        FileStash fileStash;
        if (this instanceof C22914BVc) {
            C22914BVc bVc = (C22914BVc) this;
            if (bVc.A00.isEmpty()) {
                fileStash = bVc.A00;
            } else {
                try {
                    byte[] readResourceToMemory = bVc.A00.readResourceToMemory(str);
                    C22914BVc.A01(bVc);
                    return readResourceToMemory;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    C22914BVc.A01(bVc);
                    throw th;
                }
            }
        } else {
            fileStash = this.A00;
        }
        return fileStash.readResourceToMemory(str);
    }

    public boolean removeAll() {
        FileStash fileStash;
        if (this instanceof C22913BVb) {
            C22913BVb bVb = (C22913BVb) this;
            bVb.A01.clear();
            fileStash = bVb.A00;
        } else {
            fileStash = this.A00;
        }
        return fileStash.removeAll();
    }

    public boolean touch(String str) {
        return this.A00.touch(str);
    }

    public DG3(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
