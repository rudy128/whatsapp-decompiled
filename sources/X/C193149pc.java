package X;

import java.util.Arrays;

/* renamed from: X.9pc  reason: invalid class name and case insensitive filesystem */
public final class C193149pc {
    public final byte[] A00;

    public C193149pc(byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        this.A00 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193149pc)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C193149pc) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SaneByteArray@");
        return C17880vN.A0t(A10, System.identityHashCode(this));
    }
}
