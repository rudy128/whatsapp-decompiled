package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.AlT  reason: case insensitive filesystem */
public final class C21520AlT implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C21520AlT(byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A01 = bArr;
    }

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
