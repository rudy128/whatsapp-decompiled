package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9p8  reason: invalid class name and case insensitive filesystem */
public final class C192879p8 {
    public int A00 = 0;
    public AW0 A01 = null;
    public AnonymousClass1BI A02 = null;
    public UserJid A03 = null;
    public C195079sl A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public String A08 = null;
    public String A09 = null;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public C166418cr A0E;
    public final long A0F;
    public final C166418cr A0G;
    public final AnonymousClass205 A0H;
    public final C63362sw A0I;

    public C192879p8(C166418cr r3, C166418cr r4, AnonymousClass205 r5, C63362sw r6, long j) {
        this.A0G = r3;
        this.A0H = r5;
        this.A0F = j;
        this.A0I = r6;
        this.A0E = r4;
    }

    public final void A01(C20719AVz aVz, byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        if (aVz != null) {
            this.A04 = new C195079sl(aVz.A00, aVz.A01, bArr, aVz.A02);
        }
    }

    public final C20077A6d A00() {
        AnonymousClass205 r11;
        C166418cr r21 = this.A0G;
        C63362sw r12 = this.A0I;
        C166418cr r22 = this.A0E;
        AW0 aw0 = this.A01;
        if (r12 != null) {
            r11 = r12.A0g;
        } else {
            r11 = this.A0H;
        }
        AnonymousClass205 r24 = this.A0H;
        AnonymousClass1BI r17 = this.A02;
        long j = this.A0F;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        boolean z3 = this.A0D;
        int i = this.A00;
        String str = this.A08;
        String str2 = this.A06;
        String str3 = this.A09;
        String str4 = this.A07;
        C195079sl r5 = this.A04;
        String str5 = this.A05;
        C63362sw r25 = r12;
        C195079sl r26 = r5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        AnonymousClass1BI r18 = r17;
        return new C20077A6d(aw0, r18, this.A03, (C166278cd) null, r21, r22, r11, r24, r25, r26, str6, str7, str8, str9, str10, i, j, z, z2, z3, false, this.A0C);
    }
}
