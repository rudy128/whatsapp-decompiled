package X;

/* renamed from: X.6sH  reason: invalid class name and case insensitive filesystem */
public final class C135486sH {
    public final AnonymousClass1BI A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135486sH) {
                C135486sH r5 = (C135486sH) obj;
                if (!(C18070vi.A18(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A00) * 31, this.A01), this.A02);
    }

    public C135486sH(AnonymousClass1BI r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReplyRenderParams(currentConversationJid=");
        A10.append(this.A00);
        A10.append(", isCurrentMessageFromMe=");
        A10.append(this.A01);
        A10.append(", isEpnEligibleSurface=");
        return C17900vP.A0F(A10, this.A02);
    }
}
