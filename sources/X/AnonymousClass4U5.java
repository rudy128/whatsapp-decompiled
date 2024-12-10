package X;

/* renamed from: X.4U5  reason: invalid class name */
public final class AnonymousClass4U5 {
    public final C42751yg A00;
    public final AnonymousClass1E2 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U5) {
                AnonymousClass4U5 r5 = (AnonymousClass4U5) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01)) * 31, this.A02);
    }

    public AnonymousClass4U5(C42751yg r1, AnonymousClass1E2 r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactPickerExtraInfo { hasLid: ");
        A10.append(AnonymousClass000.A1W(this.A01));
        A10.append(", isBlocked: ");
        A10.append(this.A02);
        return AnonymousClass000.A0y(" }", A10);
    }
}
