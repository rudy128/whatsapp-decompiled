package X;

/* renamed from: X.6sg  reason: invalid class name and case insensitive filesystem */
public final class C135736sg {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public C135736sg(int i, int i2, String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A03 = z;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135736sg) {
                C135736sg r5 = (C135736sg) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((C17880vN.A03(this.A02) + this.A01) * 31, this.A03) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiExpressionsSection(id=");
        A10.append(this.A02);
        A10.append(", icon=");
        A10.append(this.A01);
        A10.append(", selected=");
        A10.append(this.A03);
        A10.append(", accessibilityLabel=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
