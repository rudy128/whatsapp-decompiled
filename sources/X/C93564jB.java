package X;

/* renamed from: X.4jB  reason: invalid class name and case insensitive filesystem */
public final class C93564jB implements AnonymousClass5X2 {
    public final AnonymousClass1E7 A00;
    public final C62482rT A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93564jB) {
                C93564jB r5 = (C93564jB) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A00, r5.A00) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)), this.A05), this.A04), this.A03), this.A02);
    }

    public C93564jB(AnonymousClass1E7 r1, C62482rT r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Contact(favorite=");
        A10.append(this.A01);
        A10.append(", waContact=");
        A10.append(this.A00);
        A10.append(", showVoiceChat=");
        A10.append(this.A05);
        A10.append(", showVoiceCall=");
        A10.append(this.A04);
        A10.append(", showVideoCall=");
        A10.append(this.A03);
        A10.append(", editMode=");
        return C17900vP.A0F(A10, this.A02);
    }
}
