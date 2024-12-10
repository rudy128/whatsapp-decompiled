package X;

import java.util.List;

/* renamed from: X.9rJ  reason: invalid class name and case insensitive filesystem */
public final class C194179rJ {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194179rJ) {
                C194179rJ r5 = (C194179rJ) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A01), this.A02);
    }

    public C194179rJ(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SigningInfoCompat(signatures=");
        A10.append(this.A00);
        A10.append(", hasMultipleSigners=");
        A10.append(this.A01);
        A10.append(", hasPastSigningCertificates=");
        return C17900vP.A0F(A10, this.A02);
    }
}
