package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BVc  reason: case insensitive filesystem */
public class C22914BVc extends DG3 {
    public final List A00 = AnonymousClass8BR.A14();
    public final List A01 = AnonymousClass8BR.A14();
    public final List A02 = AnonymousClass8BR.A14();

    private void A00() {
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("onInsert");
        }
    }

    public static void A01(C22914BVc bVc) {
        Iterator it = bVc.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("onGet");
        }
    }

    public File getFile(String str) {
        if (this.A00.isEmpty()) {
            return this.A00.getFile(str);
        }
        try {
            FileStash fileStash = this.A00;
            File file = fileStash.getFile(str);
            fileStash.hasKey(str);
            return file;
        } finally {
            A01(this);
        }
    }

    public File insertFile(String str) {
        boolean isEmpty = this.A02.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            return fileStash.insertFile(str);
        }
        fileStash.hasKey(str);
        try {
            return fileStash.insertFile(str);
        } finally {
            A00();
        }
    }

    public boolean remove(String str, int i) {
        List list = this.A01;
        boolean isEmpty = list.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            return fileStash.remove(str, i);
        }
        boolean remove = fileStash.remove(str, i);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return remove;
        }
        it.next();
        throw AnonymousClass000.A0s("onRemove");
    }

    public void write(String str, byte[] bArr) {
        boolean isEmpty = this.A02.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            fileStash.write(str, bArr);
            return;
        }
        fileStash.hasKey(str);
        try {
            fileStash.write(str, bArr);
            A00();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    public C22914BVc(FileStash fileStash, List list) {
        super(fileStash);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("attach");
        }
    }

    public boolean remove(String str) {
        return remove(str, 0);
    }

    public OutputStream write(String str) {
        if (this.A02.isEmpty()) {
            return this.A00.write(str);
        }
        try {
            FileStash fileStash = this.A00;
            fileStash.hasKey(str);
            OutputStream write = fileStash.write(str);
            A00();
            return write;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }
}
