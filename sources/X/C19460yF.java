package X;

import java.util.Arrays;

/* renamed from: X.0yF  reason: invalid class name and case insensitive filesystem */
public final class C19460yF extends C19450yE {
    public final C19300xz A00;
    public final String A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C19450yE)) {
                return false;
            }
            C19460yF r4 = (C19460yF) ((C19450yE) obj);
            if (!this.A01.equals(r4.A01) || !Arrays.equals(this.A02, r4.A02) || !this.A00.equals(r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public C19460yF(C19300xz r1, String str, byte[] bArr) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = r1;
    }

    public int hashCode() {
        return ((((1000003 ^ this.A01.hashCode()) * 1000003) ^ Arrays.hashCode(this.A02)) * 1000003) ^ this.A00.hashCode();
    }
}
