package X;

/* renamed from: X.2Dp  reason: invalid class name and case insensitive filesystem */
public final class C46212Dp extends C46222Dq {
    public int A00;
    public Long A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C49472Qp A06;
    public final AnonymousClass25H A07;
    public final AnonymousClass1BI A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46212Dp) {
                C46212Dp r8 = (C46212Dp) obj;
                if (!(this.A03 == r8.A03 && C18070vi.A18(this.A08, r8.A08) && C18070vi.A18(this.A0B, r8.A0B) && this.A05 == r8.A05 && this.A07 == r8.A07 && this.A04 == r8.A04 && C18070vi.A18(this.A0A, r8.A0A) && C18070vi.A18(this.A09, r8.A09) && this.A02 == r8.A02 && this.A06 == r8.A06 && C18070vi.A18(this.A01, r8.A01) && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C46212Dp(C49472Qp r2, AnonymousClass25H r3, AnonymousClass1BI r4, Long l, String str, String str2, String str3, int i, int i2, int i3, long j, long j2) {
        C18070vi.A0d(str3, 8);
        C18070vi.A0d(r2, 10);
        this.A03 = i;
        this.A08 = r4;
        this.A0B = str;
        this.A05 = j;
        this.A07 = r3;
        this.A04 = j2;
        this.A0A = str2;
        this.A09 = str3;
        this.A02 = i2;
        this.A06 = r2;
        this.A01 = l;
        this.A00 = i3;
        this.A00 = 1 | i3;
    }

    public int hashCode() {
        int i = this.A03 * 31;
        int A0N = AnonymousClass000.A0N(this.A07, AnonymousClass001.A0K(this.A05, (AnonymousClass000.A0N(this.A08, i) + C17900vP.A00(this.A0B)) * 31));
        String str = this.A09;
        return ((AnonymousClass000.A0N(this.A06, (C17890vO.A02(str, (AnonymousClass001.A0K(this.A04, A0N) + C17900vP.A00(this.A0A)) * 31) + this.A02) * 31) + C17880vN.A02(this.A01)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompositionAudioMessage(id=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        A10.append(this.A08);
        A10.append(", text=");
        A10.append(this.A0B);
        A10.append(", timestamp=");
        A10.append(this.A05);
        A10.append(", compositionType=");
        A10.append(this.A07);
        A10.append(", mediaSize=");
        A10.append(this.A04);
        A10.append(", mediaUri=");
        A10.append(this.A0A);
        A10.append(", mediaName=");
        A10.append(this.A09);
        A10.append(", durationInSeconds=");
        A10.append(this.A02);
        A10.append(", messageType=");
        A10.append(this.A06);
        A10.append(", quotedMessageId=");
        A10.append(this.A01);
        A10.append(", lookupFlags=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
