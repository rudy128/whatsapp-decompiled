package X;

/* renamed from: X.0KP  reason: invalid class name */
public final class AnonymousClass0KP {
    public final String A00;
    public final C18080vj A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0KP) {
                AnonymousClass0KP r5 = (AnonymousClass0KP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C18080vj r0 = this.A01;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return i3 + i2;
    }

    public AnonymousClass0KP(String str, C18080vj r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final C18080vj A00() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccessibilityAction(label=");
        A10.append(this.A00);
        A10.append(", action=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
