package X;

import java.util.List;

/* renamed from: X.8lD  reason: invalid class name */
public final class AnonymousClass8lD extends AnonymousClass9M6 {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8lD) {
                AnonymousClass8lD r5 = (AnonymousClass8lD) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02), this.A01);
    }

    public AnonymousClass8lD(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(profiles=");
        A10.append(this.A00);
        A10.append(", isFetchedFromNetwork=");
        A10.append(this.A02);
        A10.append(", hasMoreBusinesses=");
        return C17900vP.A0F(A10, this.A01);
    }
}
