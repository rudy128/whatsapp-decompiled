package X;

/* renamed from: X.7Fm  reason: invalid class name and case insensitive filesystem */
public final class C143967Fm implements C1595584z {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143967Fm) {
                C143967Fm r5 = (C143967Fm) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17900vP.A00(this.A00) * 31, this.A03), this.A02), this.A01);
    }

    public C143967Fm(String str, boolean z, boolean z2, boolean z3) {
        this.A00 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public String toString() {
        return "Dob Verification Success";
    }
}
