package X;

/* renamed from: X.4nD  reason: invalid class name and case insensitive filesystem */
public final class C96044nD implements C106895Xp {
    public final AnonymousClass1E7 A00;
    public final C62482rT A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96044nD) {
                C96044nD r5 = (C96044nD) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)), this.A02);
    }

    public C96044nD(AnonymousClass1E7 r1, C62482rT r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Contact(favorite=");
        A10.append(this.A01);
        A10.append(", waContact=");
        A10.append(this.A00);
        A10.append(", editMode=");
        return C17900vP.A0F(A10, this.A02);
    }
}
