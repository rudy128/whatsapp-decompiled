package X;

import java.util.Arrays;

/* renamed from: X.9pq  reason: invalid class name and case insensitive filesystem */
public final class C193289pq {
    public final C19290xy A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C193289pq) {
            C193289pq r4 = (C193289pq) obj;
            if (this.A00.equals(r4.A00)) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A01);
    }

    public C193289pq(C19290xy r2, byte[] bArr) {
        if (bArr != null) {
            this.A00 = r2;
            this.A01 = bArr;
            return;
        }
        throw AnonymousClass000.A0s("bytes is null");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncodedPayload{encoding=");
        A10.append(this.A00);
        return AnonymousClass000.A0y(", bytes=[...]}", A10);
    }
}
