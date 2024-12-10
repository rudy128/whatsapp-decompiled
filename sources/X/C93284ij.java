package X;

/* renamed from: X.4ij  reason: invalid class name and case insensitive filesystem */
public final class C93284ij implements C106715Wx {
    public final C106695Wv A00;
    public final C106695Wv A01;
    public final C106695Wv A02;
    public final C106705Ww A03;
    public final AnonymousClass4ZN A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93284ij) {
                C93284ij r5 = (C93284ij) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || this.A05 != r5.A05 || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03))))), this.A05), this.A06);
    }

    public C93284ij(C106695Wv r1, C106695Wv r2, C106695Wv r3, C106705Ww r4, AnonymousClass4ZN r5, boolean z, boolean z2) {
        C18070vi.A0w(r4, r1, r2, r3, r5);
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A05 = z;
        this.A06 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(content=");
        A10.append(this.A03);
        A10.append(", startButton=");
        A10.append(this.A02);
        A10.append(", endButton=");
        A10.append(this.A00);
        A10.append(", returnButton=");
        A10.append(this.A01);
        A10.append(", description=");
        A10.append(this.A04);
        A10.append(", animate=");
        A10.append(this.A05);
        A10.append(", showReturnToCallText=");
        return C17900vP.A0F(A10, this.A06);
    }
}
