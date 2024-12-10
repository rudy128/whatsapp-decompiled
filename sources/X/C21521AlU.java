package X;

import java.util.Arrays;
import javax.security.auth.Destroyable;

/* renamed from: X.AlU  reason: case insensitive filesystem */
public final class C21521AlU implements Destroyable {
    public boolean A00;
    public final byte[] A01;

    public C21521AlU(byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A01 = bArr;
        int length = bArr.length;
        if (length != 32) {
            throw AnonymousClass001.A13("Wrong length: ", AnonymousClass000.A10(), length);
        }
    }

    public void destroy() {
        if (!this.A00) {
            Arrays.fill(this.A01, (byte) 0);
            this.A00 = true;
        }
    }

    public final byte[] A00() {
        return this.A01;
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
