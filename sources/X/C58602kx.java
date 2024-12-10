package X;

import java.util.Arrays;

/* renamed from: X.2kx  reason: invalid class name and case insensitive filesystem */
public class C58602kx {
    public final int A00;
    public final byte[] A01;
    public final /* synthetic */ C219618b A02;

    public C58602kx(C219618b r2, byte[] bArr) {
        this.A02 = r2;
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C58602kx)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C58602kx) obj).A01);
    }

    public int hashCode() {
        return this.A00;
    }
}
