package X;

/* renamed from: X.3ma  reason: invalid class name and case insensitive filesystem */
public final class C76093ma extends AnonymousClass4E8 {
    public final AnonymousClass1E7 A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76093ma) {
                C76093ma r5 = (C76093ma) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, (AnonymousClass0DV.A00(C17880vN.A03(this.A02), this.A04) + AnonymousClass001.A0k(this.A01)) * 31), this.A03);
    }

    public C76093ma(AnonymousClass1E7 r1, Integer num, String str, boolean z, boolean z2) {
        this.A02 = str;
        this.A04 = z;
        this.A01 = num;
        this.A00 = r1;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Participant(name=");
        A10.append(this.A02);
        A10.append(", joined=");
        A10.append(this.A04);
        A10.append(", initiatorStringRes=");
        A10.append(this.A01);
        A10.append(", contact=");
        A10.append(this.A00);
        A10.append(", isMe=");
        return C17900vP.A0F(A10, this.A03);
    }
}
