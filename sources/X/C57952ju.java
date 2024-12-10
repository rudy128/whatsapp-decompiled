package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2ju  reason: invalid class name and case insensitive filesystem */
public class C57952ju {
    public final AnonymousClass1KB A00;
    public final C33251iW A01;
    public final C26421Sb A02;
    public final C31061ex A03;
    public final C31041ev A04;
    public final C62542rZ A05;

    public AW0 A00(AnonymousClass1KJ r17, AnonymousClass1KN r18, C20284AEs aEs, AnonymousClass8pG r20, AEX aex, AnonymousClass1BI r22, UserJid userJid, AnonymousClass34B r24, AnonymousClass206 r25, C1418377d r26, Integer num, String str, String str2, String str3, boolean z) {
        AnonymousClass34B r5 = r24;
        C1418377d r1 = r26;
        C441322g A022 = this.A05.A02(r22, userJid, r25, r1, num);
        AnonymousClass1KJ r7 = r17;
        C20284AEs aEs2 = aEs;
        AnonymousClass8pG r10 = r20;
        AEX aex2 = aex;
        boolean A0L = this.A03.A0L(r7, r18, aEs2, r10, aex2, A022, str2, str3, z);
        if (r24 == null) {
            C26421Sb r2 = this.A02;
            C63722ta A002 = C62542rZ.A00(r1, str);
            C17960vV.A07(A002);
            r5 = r2.A01(A002, true);
        }
        this.A00.A0J(new C21435Ak2(this, A022, r5, 44));
        this.A04.A01(aex2, A022);
        if (A0L) {
            return AnonymousClass25B.A00(A022);
        }
        return null;
    }

    public C57952ju(AnonymousClass1KB r1, C33251iW r2, C26421Sb r3, C31061ex r4, C62542rZ r5, C31041ev r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r6;
        this.A05 = r5;
    }
}
