package X;

import java.util.Arrays;

/* renamed from: X.4Sg  reason: invalid class name and case insensitive filesystem */
public class C86594Sg {
    public final int A00;

    public int hashCode() {
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, this.A00);
        return 31 + Arrays.hashCode(objArr);
    }

    public boolean A00(C86594Sg r3) {
        return AnonymousClass000.A1T(this.A00, r3.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C86594Sg) || this.A00 != ((C86594Sg) obj).A00) {
            return false;
        }
        return true;
    }

    public C86594Sg(int i) {
        this.A00 = i;
    }
}
