package X;

/* renamed from: X.3n9  reason: invalid class name and case insensitive filesystem */
public final class C76353n9 extends AnonymousClass4EC {
    public final AnonymousClass4UW A00;
    public final AnonymousClass1E7 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76353n9) {
                C76353n9 r5 = (C76353n9) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public C76353n9(AnonymousClass4UW r1, AnonymousClass1E7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failed(subtitleState=");
        A10.append(this.A00);
        A10.append(", photo=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
