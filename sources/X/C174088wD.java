package X;

import java.util.Arrays;

/* renamed from: X.8wD  reason: invalid class name and case insensitive filesystem */
public final class C174088wD extends C174358we {
    public final boolean A00;
    public final boolean A01;

    public C174088wD(boolean z, boolean z2) {
        super(3);
        this.A00 = z;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
                return false;
            }
            C174088wD r4 = (C174088wD) obj;
            if (!C42171xk.A00(Boolean.valueOf(this.A00), Boolean.valueOf(r4.A00)) || !C42171xk.A00(Boolean.valueOf(this.A01), Boolean.valueOf(r4.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, super.hashCode());
        A1a[1] = Boolean.valueOf(this.A00);
        AnonymousClass8BU.A1Q(A1a, this.A01);
        return Arrays.hashCode(A1a);
    }
}
