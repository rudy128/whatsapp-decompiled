package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BVb  reason: case insensitive filesystem */
public class C22913BVb extends DG3 {
    public static final long A03;
    public static final long A04;
    public final E7V A00;
    public final Set A01 = Collections.synchronizedSet(C17880vN.A12());
    public volatile long A02 = A03;

    static {
        long millis = TimeUnit.HOURS.toMillis(4);
        A04 = millis;
        A03 = millis * -2;
    }

    public File getFile(String str) {
        if (this.A02 == A03 || this.A01.contains(str)) {
            return this.A00.getFile(str);
        }
        return null;
    }

    public File insertFile(String str) {
        this.A01.add(str);
        return this.A00.insertFile(str);
    }

    public boolean remove(String str, int i) {
        this.A01.remove(str);
        return this.A00.remove(str, i);
    }

    public void write(String str, byte[] bArr) {
        this.A00.write(str, bArr);
        this.A01.add(str);
    }

    public C22913BVb(E7V e7v, FileStash fileStash) {
        super(fileStash);
        this.A00 = e7v;
    }

    public boolean remove(String str) {
        this.A01.remove(str);
        return this.A00.remove(str);
    }

    public OutputStream write(String str) {
        this.A01.add(str);
        return new C24229Bxh(this, this.A00.write(str), str);
    }
}
