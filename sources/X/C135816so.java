package X;

/* renamed from: X.6so  reason: invalid class name and case insensitive filesystem */
public final class C135816so {
    public final AnonymousClass8BG A00;
    public final AnonymousClass21V A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135816so) {
                C135816so r5 = (C135816so) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A02)) * 31, this.A03);
    }

    public C135816so(AnonymousClass8BG r1, AnonymousClass21V r2, String str, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CurrentMessage(message=");
        A10.append(this.A01);
        A10.append(", reactions=");
        A10.append(this.A00);
        A10.append(", myReaction=");
        A10.append(this.A02);
        A10.append(", isReactable=");
        return C17900vP.A0F(A10, this.A03);
    }
}
