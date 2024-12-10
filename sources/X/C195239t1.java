package X;

/* renamed from: X.9t1  reason: invalid class name and case insensitive filesystem */
public final class C195239t1 {
    public final long A00;
    public final C165928bz A01;
    public final AnonymousClass205 A02;
    public final String A03;
    public final AnonymousClass1BI A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195239t1) {
                C195239t1 r8 = (C195239t1) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A01);
        return AnonymousClass001.A0K(this.A00, (AnonymousClass000.A0N(this.A02, A0L) + AnonymousClass001.A0k(this.A04)) * 31) + C108955ca.A06(this.A03);
    }

    public C195239t1(AnonymousClass1BI r1, C165928bz r2, AnonymousClass205 r3, String str, long j) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r1;
        this.A00 = j;
        this.A03 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseInteropMessageParams(interopMessage=");
        A10.append(this.A01);
        A10.append(", messageKey=");
        A10.append(this.A02);
        A10.append(", chatJid=");
        A10.append(this.A04);
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", messageTypeAttribute=");
        return C17900vP.A0B(this.A03, A10);
    }
}
