package X;

/* renamed from: X.4T9  reason: invalid class name */
public final class AnonymousClass4T9 {
    public final AnonymousClass4ZN A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T9) {
                AnonymousClass4T9 r5 = (AnonymousClass4T9) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass4T9(AnonymousClass4ZN r1, AnonymousClass4ZN r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccessibilityProvider(contentDescription=");
        A10.append(this.A01);
        A10.append(", clickDescription=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
