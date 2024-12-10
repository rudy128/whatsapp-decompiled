package X;

/* renamed from: X.07O  reason: invalid class name */
public final class AnonymousClass07O extends AnonymousClass0WV {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass07O) {
                AnonymousClass0WV r5 = (AnonymousClass0WV) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C01990Cf A00(C24246By4 by4, float f, float f2, float f3, float f4, long j) {
        float f5 = f2;
        float f6 = f4;
        int i = ((f + f2 + f3 + f4) > 0.0f ? 1 : ((f + f2 + f3 + f4) == 0.0f ? 0 : -1));
        AnonymousClass0NU A00 = C02470Ed.A00(AnonymousClass0QY.A03, j);
        if (i == 0) {
            return new C015709a(A00);
        }
        C24246By4 by42 = C24246By4.Ltr;
        float f7 = f5;
        C24246By4 by43 = by4;
        if (by43 == by42) {
            f7 = f;
        }
        long A0p = AnonymousClass001.A0p(f7, f7);
        long j2 = C04140Lz.A00;
        if (by43 != by42) {
            f5 = f;
        }
        long A0p2 = AnonymousClass001.A0p(f5, f5);
        float f8 = f6;
        if (by43 == by42) {
            f8 = f3;
        }
        long A0p3 = AnonymousClass001.A0p(f8, f8);
        if (by43 != by42) {
            f6 = f3;
        }
        return new C015809b(new AnonymousClass0NJ(A00.A01, A00.A03, A00.A02, A00.A00, A0p, A0p2, A0p3, AnonymousClass001.A0p(f6, f6)));
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RoundedCornerShape(topStart = ");
        A10.append(this.A03);
        A10.append(", topEnd = ");
        A10.append(this.A02);
        A10.append(", bottomEnd = ");
        A10.append(this.A00);
        A10.append(", bottomStart = ");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
