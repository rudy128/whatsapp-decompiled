package X;

/* renamed from: X.2n4  reason: invalid class name and case insensitive filesystem */
public final class C59902n4 {
    public final A00 A00;
    public final A00 A01;
    public final A00 A02;
    public final A00 A03;
    public final A00 A04;
    public final A00 A05;
    public final A00 A06;
    public final A00 A07;
    public final A00 A08;
    public final A00 A09;
    public final A00 A0A;
    public final A00 A0B;
    public final A00 A0C;
    public final String A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59902n4) {
                C59902n4 r5 = (C59902n4) obj;
                if (!C18070vi.A18(this.A0D, r5.A0D) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((C17900vP.A00(this.A0D) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + C17880vN.A02(this.A08);
    }

    public C59902n4(A00 a00, A00 a002, A00 a003, A00 a004, A00 a005, A00 a006, A00 a007, A00 a008, A00 a009, A00 a0010, A00 a0011, A00 a0012, A00 a0013, String str) {
        this.A0D = str;
        this.A02 = a00;
        this.A09 = a002;
        this.A01 = a003;
        this.A0A = a004;
        this.A07 = a005;
        this.A03 = a006;
        this.A06 = a007;
        this.A04 = a008;
        this.A05 = a009;
        this.A00 = a0010;
        this.A0C = a0011;
        this.A0B = a0012;
        this.A08 = a0013;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsyncResultProtocolsData(version=");
        A10.append(this.A0D);
        A10.append(", contactData=");
        A10.append(this.A02);
        A10.append(", sidelistData=");
        A10.append(this.A09);
        A10.append(", businessData=");
        A10.append(this.A01);
        A10.append(", statusData=");
        A10.append(this.A0A);
        A10.append(", pictureData=");
        A10.append(this.A07);
        A10.append(", devicesData=");
        A10.append(this.A03);
        A10.append(", paymentData=");
        A10.append(this.A06);
        A10.append(", disappearingModeData=");
        A10.append(this.A04);
        A10.append(", lidData=");
        A10.append(this.A05);
        A10.append(", botData=");
        A10.append(this.A00);
        A10.append(", usernameData=");
        A10.append(this.A0C);
        A10.append(", textStatusData=");
        A10.append(this.A0B);
        A10.append(", reachabilityData=");
        return AnonymousClass001.A1F(this.A08, A10);
    }
}
