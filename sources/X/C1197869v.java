package X;

import java.util.Arrays;

/* renamed from: X.69v  reason: invalid class name and case insensitive filesystem */
public final class C1197869v extends C133706pM {
    public final int A00;
    public final int A01;
    public final int A02;

    public C1197869v(C126136cF r3, int i, int i2, int i3, boolean z) {
        super(r3, 2, z, true);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, super.hashCode());
        AnonymousClass000.A1M(objArr, this.A02);
        AnonymousClass3Ma.A1S(objArr, this.A01);
        C17890vO.A1G(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj)) || !super.equals(obj) || !(obj instanceof C1197869v)) {
            return false;
        }
        C1197869v r4 = (C1197869v) obj;
        if (this.A02 == r4.A02 && this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }
}
