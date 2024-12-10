package X;

/* renamed from: X.9t8  reason: invalid class name and case insensitive filesystem */
public final class C195309t8 {
    public boolean A00;
    public final int A01;
    public final C20271AEe A02;
    public final String A03;
    public final String A04;

    public C195309t8(C20271AEe aEe, String str, String str2, int i, boolean z) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A01 = i;
        this.A02 = aEe;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195309t8) {
                C195309t8 r5 = (C195309t8) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00((C17880vN.A03(this.A04) + C17900vP.A00(this.A03)) * 31, this.A00) + this.A01) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Button(id=");
        A10.append(this.A04);
        A10.append(", displayText=");
        A10.append(this.A03);
        A10.append(", selected=");
        A10.append(this.A00);
        A10.append(", type=");
        A10.append(this.A01);
        A10.append(", nativeFlowInfo=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
