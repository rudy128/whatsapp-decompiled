package X;

import java.util.Arrays;

/* renamed from: X.4Rt  reason: invalid class name and case insensitive filesystem */
public final class C86474Rt {
    public final int A00;
    public final C54242dp A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C86474Rt r4 = (C86474Rt) obj;
            if (!C42171xk.A00(this.A01, r4.A01) || !C42171xk.A00(Boolean.valueOf(this.A02), Boolean.valueOf(r4.A02)) || !C42171xk.A00(Integer.valueOf(this.A00), Integer.valueOf(r4.A00))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        objArr[1] = Boolean.valueOf(this.A02);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C86474Rt(C54242dp r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }
}
