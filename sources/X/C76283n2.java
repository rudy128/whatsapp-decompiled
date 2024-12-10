package X;

/* renamed from: X.3n2  reason: invalid class name and case insensitive filesystem */
public final class C76283n2 extends C76323n6 {
    public final AnonymousClass4UW A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76283n2) {
                C76283n2 r5 = (C76283n2) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, ((AnonymousClass001.A0k(this.A02) * 31) + C17880vN.A02(this.A01)) * 31);
    }

    public C76283n2(AnonymousClass4UW r1, AnonymousClass4ZN r2, AnonymousClass4ZN r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AdhocOrCallLink(titleStringProvider=");
        A10.append(this.A02);
        A10.append(", titleContentDescription=");
        A10.append(this.A01);
        A10.append(", subtitleState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
