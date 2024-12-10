package X;

import com.whatsapp.biz.catalog.network.DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9lk  reason: invalid class name and case insensitive filesystem */
public final class C190929lk {
    public final AnonymousClass00H A00;
    public final C182619Vb A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final void A00(BAL bal, AEW aew, UserJid userJid, String str) {
        String str2 = str;
        C18070vi.A0d(str2, 0);
        BAL bal2 = bal;
        UserJid userJid2 = userJid;
        if (C18020vd.A05(C18040vf.A02, this.A02, 10888)) {
            AnonymousClass3MX.A1Q(new DCVerifyPostcodeGraphqlOrXMPPNetworkCall$verifyPostcode$1(this, bal, userJid2, str2, (C30391dr) null), (AnonymousClass1OX) C18070vi.A0E(this.A03));
            return;
        }
        AnonymousClass10E r1 = this.A01.A00.A00;
        C167858ht r3 = new C167858ht(AnonymousClass8BT.A0D(r1), (C20009A2z) r1.A3P.get(), AnonymousClass10E.A2m(r1), bal2, userJid2, AnonymousClass8BU.A0K(r1), (C195049si) r1.A1w.get(), (AnonymousClass4S5) r1.ABW.get(), AnonymousClass10E.AL1(r1), str2);
        C21450AkH.A01(r3.A05, r3, aew, 8);
    }

    public C190929lk(C182619Vb r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }
}
