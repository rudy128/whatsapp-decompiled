package X;

import java.util.Arrays;

/* renamed from: X.2lX  reason: invalid class name and case insensitive filesystem */
public final class C58962lX {
    public final long A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58962lX)) {
            return false;
        }
        C58962lX r7 = (C58962lX) obj;
        return this.A00 == r7.A00 && Arrays.equals(this.A01, r7.A01);
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, Arrays.hashCode(this.A01) * 31);
    }

    public C58962lX(byte[] bArr, long j) {
        this.A01 = bArr;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyTokenData(token=");
        C17890vO.A1C(A10, this.A01);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
