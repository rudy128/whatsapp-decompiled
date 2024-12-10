package X;

/* renamed from: X.36t  reason: invalid class name and case insensitive filesystem */
public final class C693236t implements AnonymousClass229 {
    public long A00;
    public AnonymousClass6RT A01;
    public final A51 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C693236t) {
                C693236t r8 = (C693236t) obj;
                if (!(C18070vi.A18(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0k(this.A02) * 31));
    }

    public C693236t(AnonymousClass6RT r1, A51 a51, long j) {
        this.A02 = a51;
        this.A00 = j;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParentAssociationInfo(parentMessageKey=");
        A10.append(this.A02);
        A10.append(", parentMessageRowId=");
        A10.append(this.A00);
        A10.append(", associationType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
