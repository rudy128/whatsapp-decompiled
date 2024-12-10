package X;

import java.util.List;

/* renamed from: X.9py  reason: invalid class name and case insensitive filesystem */
public final class C193369py {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193369py) {
                C193369py r5 = (C193369py) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C193369py(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CacheData(effects=");
        A10.append(this.A00);
        A10.append(", shouldRefresh=");
        return C17900vP.A0F(A10, this.A01);
    }
}
