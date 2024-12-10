package X;

/* renamed from: X.4U0  reason: invalid class name */
public final class AnonymousClass4U0 {
    public final C107345Zi A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U0) {
                AnonymousClass4U0 r5 = (AnonymousClass4U0) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public AnonymousClass4U0(C107345Zi r1, AnonymousClass4ZN r2, AnonymousClass4ZN r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OneOnOneCallConfirmationSheetUiState(titleStringProvider=");
        A10.append(this.A02);
        A10.append(", buttonStringProvider=");
        A10.append(this.A01);
        A10.append(", buttonDrawableProvider=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
