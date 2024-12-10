package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class DG4 implements FileStash {
    public final E4N A00;
    public final E52 A01;
    public final File A02;

    public InputStream read(String str) {
        try {
            File file = getFile(str);
            if (file == null) {
                return null;
            }
            return C108945cZ.A18(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public DG4(E52 e52, File file) {
        DBM dbm = DBM.A00;
        this.A02 = file;
        this.A01 = e52;
        this.A00 = dbm;
    }

    public Set getAllKeys() {
        int length;
        String[] list = this.A02.list();
        if (list == null || (length = list.length) == 0) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String str : list) {
            Set set = C24678CEs.A00;
            char[] charArray = str.toCharArray();
            StringBuilder A10 = AnonymousClass000.A10();
            int i = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                if (c == '%') {
                    try {
                        A10.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    A10.append(c);
                }
                i++;
            }
            str = A10.toString();
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public File getBaseStoragePath_ForInternalUse() {
        return this.A02;
    }

    public File getFilePath(String str) {
        File file = this.A02;
        Set set = C24678CEs.A00;
        char[] charArray = str.toCharArray();
        StringBuilder A10 = AnonymousClass000.A10();
        for (char c : charArray) {
            if (c == '%' || C24678CEs.A00.contains(Character.valueOf(c))) {
                A10.append('%');
                BE7.A10(c, A10);
            } else {
                A10.append(c);
            }
        }
        return C17880vN.A0e(file, A10.toString());
    }

    public int getItemCount() {
        String[] list = this.A02.list();
        if (list != null) {
            return list.length;
        }
        return 0;
    }

    public long getSizeBytes() {
        return C25871Cnf.A00(this.A02);
    }

    public File insertFile(String str) {
        this.A02.mkdirs();
        File filePath = getFilePath(str);
        filePath.setLastModified(this.A00.now());
        return filePath;
    }

    public boolean removeAll() {
        E52 e52 = this.A01;
        File file = this.A02;
        if (!e52.BIM(file)) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public File getFile(String str) {
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        filePath.setLastModified(this.A00.now());
        return filePath;
    }

    public long getItemSizeBytes(String str) {
        return C25871Cnf.A00(getFilePath(str));
    }

    public boolean hasKey(String str) {
        return getFilePath(str).exists();
    }

    public long lastAccessTime(String str) {
        return getFilePath(str).lastModified();
    }

    public byte[] readResourceToMemory(String str) {
        InputStream read = read(str);
        if (read == null) {
            return null;
        }
        try {
            long length = getFilePath(str).length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                for (int i2 = 0; ((long) i2) < length; i2 += read.read(bArr, i2, i)) {
                }
                read.close();
                return bArr;
            }
            throw AnonymousClass000.A0k(C17890vO.A0a("Trying to read too big resource, size (b): ", AnonymousClass000.A10(), length));
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean remove(String str, int i) {
        return remove(str);
    }

    public boolean touch(String str) {
        return getFilePath(str).setLastModified(this.A00.now());
    }

    public void write(String str, byte[] bArr) {
        OutputStream write = write(str);
        try {
            write.write(bArr);
            write.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean remove(String str) {
        return this.A01.BIM(getFilePath(str));
    }

    public OutputStream write(String str) {
        File filePath = getFilePath(str);
        filePath.setLastModified(this.A00.now());
        try {
            return C108945cZ.A19(filePath);
        } catch (FileNotFoundException unused) {
            this.A02.mkdirs();
            return C108945cZ.A19(filePath);
        }
    }
}
