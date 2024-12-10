package X;

/* renamed from: X.0NI  reason: invalid class name */
public final class AnonymousClass0NI {
    public final AnonymousClass0WV A00;
    public final AnonymousClass0WV A01;
    public final AnonymousClass0WV A02;
    public final AnonymousClass0WV A03;
    public final AnonymousClass0WV A04;

    public AnonymousClass0NI(AnonymousClass0WV r2, AnonymousClass0WV r3, AnonymousClass0WV r4, AnonymousClass0WV r5, AnonymousClass0WV r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A00 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A01 = r5;
        this.A03 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NI) {
                AnonymousClass0NI r5 = (AnonymousClass0NI) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A00)))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Shapes(extraSmall=");
        A10.append(this.A00);
        A10.append(", small=");
        A10.append(this.A04);
        A10.append(", medium=");
        A10.append(this.A02);
        A10.append(", large=");
        A10.append(this.A01);
        A10.append(", extraLarge=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public AnonymousClass0NI() {
        this(C03030Gi.A01, C03030Gi.A04, C03030Gi.A03, C03030Gi.A02, C03030Gi.A00);
    }
}
