package X;

/* renamed from: X.4Tm  reason: invalid class name and case insensitive filesystem */
public final class C86894Tm {
    public boolean A00;
    public final C83024Db A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86894Tm) {
                C86894Tm r5 = (C86894Tm) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A01), this.A00);
    }

    public C86894Tm(C83024Db r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InboxInfoWithSelection(inboxType=");
        A10.append(this.A01);
        A10.append(", isChecked=");
        return C17900vP.A0F(A10, this.A00);
    }
}
