package X;

/* renamed from: X.4ix  reason: invalid class name and case insensitive filesystem */
public final class C93424ix implements C106735Wz {
    public final AnonymousClass5X0 A00;
    public final AnonymousClass5X0 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93424ix) {
                C93424ix r5 = (C93424ix) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C93424ix(AnonymousClass5X0 r1, AnonymousClass5X0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(firstButtonState=");
        A10.append(this.A00);
        A10.append(", secondButtonState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
