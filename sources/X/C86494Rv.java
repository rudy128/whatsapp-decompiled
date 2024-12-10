package X;

import java.util.Arrays;

/* renamed from: X.4Rv  reason: invalid class name and case insensitive filesystem */
public final class C86494Rv {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C86494Rv r4 = (C86494Rv) obj;
            if (!(this.A00 == r4.A00 && this.A01 == r4.A01 && this.A02 == r4.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A00);
        AnonymousClass000.A1M(objArr, this.A01);
        AnonymousClass3Ma.A1S(objArr, this.A02);
        return Arrays.hashCode(objArr);
    }

    public C86494Rv(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
