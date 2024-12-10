package X;

import java.util.List;

/* renamed from: X.Ca0  reason: case insensitive filesystem */
public final class C25149Ca0 {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25149Ca0) {
                C25149Ca0 ca0 = (C25149Ca0) obj;
                if (!C18070vi.A18(this.A00, ca0.A00) || this.A01 != ca0.A01) {
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

    public C25149Ca0(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ActivityStack{activitiesInProcess=");
        A10.append(this.A00);
        A10.append(", isEmpty=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
