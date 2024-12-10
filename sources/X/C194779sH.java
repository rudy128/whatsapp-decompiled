package X;

/* renamed from: X.9sH  reason: invalid class name and case insensitive filesystem */
public final class C194779sH {
    public final C22360B4o A00;
    public final C1418477e A01;
    public final C1418477e A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194779sH) {
                C194779sH r5 = (C194779sH) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, ((AnonymousClass001.A0k(this.A02) * 31) + C17880vN.A02(this.A01)) * 31), this.A03);
    }

    public C194779sH(C22360B4o b4o, C1418477e r2, C1418477e r3, boolean z) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = b4o;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarSdkParams(fbId=");
        A10.append(this.A02);
        A10.append(", accessToken=");
        A10.append(this.A01);
        A10.append(", callbackProvider=");
        A10.append(this.A00);
        A10.append(", disableStyle2SpecificFlags=");
        return C17900vP.A0F(A10, this.A03);
    }
}
