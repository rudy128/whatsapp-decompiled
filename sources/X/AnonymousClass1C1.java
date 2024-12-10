package X;

import java.util.Arrays;

/* renamed from: X.1C1  reason: invalid class name */
public class AnonymousClass1C1 {
    public final int A00;
    public final byte[] A01;

    public AnonymousClass1C1(byte[] bArr) {
        this.A00 = AnonymousClass1C2.A00(bArr);
        this.A01 = bArr;
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass1C1) {
            return Arrays.equals(this.A01, ((AnonymousClass1C1) obj).A01);
        }
        return false;
    }
}
