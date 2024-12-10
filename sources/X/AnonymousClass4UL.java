package X;

import java.util.List;

/* renamed from: X.4UL  reason: invalid class name */
public final class AnonymousClass4UL {
    public final int A00;
    public final int A01;
    public final List A02;

    public AnonymousClass4UL(List list, int i, int i2) {
        C18070vi.A0d(list, 1);
        this.A02 = list;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UL) {
                AnonymousClass4UL r5 = (AnonymousClass4UL) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Series(points=");
        A10.append(this.A02);
        A10.append(", primaryColorId=");
        A10.append(this.A00);
        A10.append(", secondaryColorId=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
