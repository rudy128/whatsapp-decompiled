package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.95t  reason: invalid class name and case insensitive filesystem */
public class C1768195t extends AnonymousClass8G3 {
    public final AnonymousClass1M9 A00;
    public final C18000vb A01;
    public final AnonymousClass1QR A02;
    public final AnonymousClass1R2 A03;

    public C1768195t(AnonymousClass18O r9, AnonymousClass1M9 r10, AnonymousClass11P r11, C18000vb r12, AnonymousClass122 r13, AnonymousClass1QR r14, C18030ve r15, BD4 bd4, AnonymousClass1R2 r17, C32551hN r18) {
        super(r9, r11, r13, r15, bd4, r18);
        this.A02 = r14;
        this.A03 = r17;
        this.A00 = r10;
        this.A01 = r12;
    }

    public String A0W(String str, String str2) {
        C17960vV.A07(str);
        return super.A0W(str, str2);
    }

    public void A0Z(String str) {
        String str2;
        super.A0Z(str);
        AW0 A0J = AnonymousClass8BU.A0J(this.A02, (String) null, str);
        if (A0J != null) {
            C184969bo r7 = new C184969bo(5);
            UserJid userJid = A0J.A0D;
            if (userJid == null || (str2 = this.A00.A0H(userJid).A0L()) == null) {
                str2 = "";
            }
            C18000vb r4 = this.A01;
            AnonymousClass1KN r3 = A0J.A09;
            AnonymousClass1KJ A012 = A0J.A01();
            r7.A00 = new C186929ez(this.A03.A0G(A0J), AnonymousClass1R2.A01(A0J), str2, A3U.A02(r4, A012, r3, 0, AnonymousClass8BX.A1U(r4, r3, A012)));
            this.A01.A0E(r7);
            C186929ez r32 = r7.A00;
            C20112A7u a7u = this.A06;
            a7u.A07("transaction_status", C20128A8n.A04(A0J.A03, A0J.A02));
            a7u.A07("transaction_status_name", r4.A0A(r32.A00));
            a7u.A07("merchant_name", r32.A02);
        }
    }
}
