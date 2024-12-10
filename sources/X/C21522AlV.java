package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* renamed from: X.AlV  reason: case insensitive filesystem */
public class C21522AlV implements Destroyable {
    public final AtomicBoolean A00 = C108965cb.A0w();
    public final byte[] A01;
    public final byte[] A02;

    public void destroy() {
        if (this.A00.compareAndSet(false, true)) {
            Arrays.fill(this.A01, (byte) 0);
            Arrays.fill(this.A02, (byte) 0);
        }
    }

    public C21522AlV(byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public static C21522AlV A00() {
        C22562BCv bCv = C19945A0c.A00().A00;
        byte[] BLs = bCv.BLs();
        return new C21522AlV(bCv.generatePublicKey(BLs), BLs);
    }
}
