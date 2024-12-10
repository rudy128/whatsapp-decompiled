package X;

import java.util.List;

/* renamed from: X.60U  reason: invalid class name */
public final class AnonymousClass60U extends AnonymousClass6TJ {
    public final List A00;
    public final float A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60U) {
                AnonymousClass60U r5 = (AnonymousClass60U) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A00) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    public AnonymousClass60U(List list, float f, int i) {
        this.A00 = list;
        this.A02 = i;
        this.A01 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Data(shapes=");
        A10.append(this.A00);
        A10.append(", strokeColor=");
        A10.append(this.A02);
        A10.append(", strokeWidth=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
