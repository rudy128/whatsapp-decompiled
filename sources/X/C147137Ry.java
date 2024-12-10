package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* renamed from: X.7Ry  reason: invalid class name and case insensitive filesystem */
public final class C147137Ry implements Destroyable {
    public final AtomicBoolean A00 = C108965cb.A0w();
    public final byte[] A01;
    public final byte[] A02;

    public void destroy() {
        if (this.A00.compareAndSet(false, true)) {
            Arrays.fill(this.A01, (byte) 0);
            Arrays.fill(this.A02, (byte) 0);
        }
    }

    public C147137Ry(byte[] bArr, byte[] bArr2) {
        this.A02 = bArr;
        this.A01 = bArr2;
    }
}
