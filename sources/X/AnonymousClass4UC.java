package X;

/* renamed from: X.4UC  reason: invalid class name */
public final class AnonymousClass4UC {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UC) {
                AnonymousClass4UC r5 = (AnonymousClass4UC) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((C17880vN.A03(this.A01) + this.A00) * 31, this.A02);
    }

    public AnonymousClass4UC(int i, String str, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageColorSelectionItem(themeId=");
        A10.append(this.A01);
        A10.append(", themeResId=");
        A10.append(this.A00);
        A10.append(", checked=");
        return C17900vP.A0F(A10, this.A02);
    }
}
