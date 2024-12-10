package X;

import java.util.Arrays;

/* renamed from: X.2mC  reason: invalid class name and case insensitive filesystem */
public final class C59372mC {
    public final long A00;
    public final C195959uE A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59372mC)) {
            return false;
        }
        C59372mC r7 = (C59372mC) obj;
        return this.A00 == r7.A00 && Arrays.equals(this.A02, r7.A02) && C18070vi.A18(this.A01, r7.A01);
    }

    public int hashCode() {
        Integer[] numArr = new Integer[3];
        AnonymousClass000.A1L(numArr, AnonymousClass000.A0I(this.A00));
        AnonymousClass000.A1M(numArr, Arrays.hashCode(this.A02));
        return AnonymousClass000.A0P(Integer.valueOf(this.A01.hashCode()), numArr, 2);
    }

    public C59372mC(C195959uE r1, byte[] bArr, long j) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        return "SyncdKeyData";
    }
}
