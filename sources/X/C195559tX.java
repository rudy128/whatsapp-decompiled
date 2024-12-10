package X;

/* renamed from: X.9tX  reason: invalid class name and case insensitive filesystem */
public final class C195559tX {
    public final AnonymousClass8q2 A00;
    public final A7L A01;
    public final AnonymousClass1BI A02;
    public final AnonymousClass1BI A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final A7L A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195559tX) {
                C195559tX r5 = (C195559tX) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A00)));
    }

    public C195559tX(AnonymousClass8q2 r3, AnonymousClass1BI r4, AnonymousClass1BI r5) {
        C18070vi.A0k(r4, r5);
        this.A00 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A06 = r4.equals(r5);
        AnonymousClass8q2 A0H = r3.A0H(r4);
        this.A07 = A0H.A00;
        this.A05 = A0H.A0A();
        AnonymousClass8q2 A0H2 = r3.A0H(r5);
        this.A04 = A0H2.A0A();
        this.A01 = A0H2.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageRangeMutationWrapper(mutation=");
        A10.append(this.A00);
        A10.append(", originalThreadJid=");
        A10.append(this.A03);
        A10.append(", currentThreadJid=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
