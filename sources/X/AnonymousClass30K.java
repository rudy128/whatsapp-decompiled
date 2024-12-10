package X;

/* renamed from: X.30K  reason: invalid class name */
public final class AnonymousClass30K implements C72123Ks {
    public final C18030ve A00;
    public final AnonymousClass2HL A01;
    public final C35241lt A02;
    public final C35221lr A03;
    public final AnonymousClass1N9 A04;
    public final C173578vJ A05;
    public final C63362sw A06;
    public final boolean A07;

    public void BcN(byte[] bArr) {
        C173578vJ r0 = this.A05;
        if (r0 != null) {
            r0.A03 = true;
        }
        if (bArr != null && bArr.length != 0) {
            AnonymousClass2HL r1 = this.A01;
            r1.A00 = true;
            r1.A0E = 12;
            C35221lr r12 = this.A03;
            C63362sw r2 = this.A06;
            C35241lt.A00(this.A02, r12.A01(r2, bArr, 0), r2);
        } else if (this.A07) {
            this.A04.A0D(this.A06);
        }
    }

    public AnonymousClass30K(C18030ve r1, AnonymousClass2HL r2, C35241lt r3, C35221lr r4, AnonymousClass1N9 r5, C173578vJ r6, C63362sw r7, boolean z) {
        this.A00 = r1;
        this.A07 = z;
        this.A04 = r5;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }
}
