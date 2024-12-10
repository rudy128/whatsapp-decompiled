package X;

import java.util.Arrays;

/* renamed from: X.2lh  reason: invalid class name and case insensitive filesystem */
public final class C59062lh {
    public final C59372mC A00;
    public final C19999A2n A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59062lh)) {
            return false;
        }
        C59062lh r4 = (C59062lh) obj;
        return C18070vi.A18(this.A01, r4.A01) && C18070vi.A18(this.A00, r4.A00);
    }

    public int hashCode() {
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1L(numArr, this.A01.hashCode());
        AnonymousClass000.A1M(numArr, this.A00.hashCode());
        return Arrays.hashCode(numArr);
    }

    public C59062lh(C59372mC r1, C19999A2n a2n) {
        this.A01 = a2n;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdKey{keyId=");
        A10.append(this.A01);
        A10.append(", syncdKeyData=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
