package X;

import android.app.Application;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8F3  reason: invalid class name */
public final class AnonymousClass8F3 extends AnonymousClass8FK {
    public final AnonymousClass11S A00;
    public final C18000vb A01;
    public final AnonymousClass1KI A02;
    public final C191499mh A03;
    public final C41731wy A04;
    public final C41731wy A05;
    public final C41731wy A06;
    public final C41731wy A07;

    public void A0T(AEV aev, C20279AEn aEn, AnonymousClass205 r18) {
        AE0 ae0;
        String str;
        String str2;
        C22941Dw r0 = UserJid.Companion;
        AnonymousClass1BI r02 = null;
        AnonymousClass205 r1 = r18;
        if (r18 != null) {
            r02 = r1.A00;
        }
        UserJid A012 = C22941Dw.A01(r02);
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A00);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        C20279AEn aEn2 = aEn;
        if (aEn != null && (ae0 = aEn2.A0C) != null && A012 != null && (str = ae0.A01) != null && (str2 = ae0.A02) != null) {
            JSONObject A013 = C196819vh.A01(aev, A002, aEn2, AnonymousClass00R.A0N, (String) null, (String) null);
            C191499mh r2 = this.A03;
            String A062 = this.A01.A06();
            C18070vi.A0X(A062);
            r2.A00(new AS8(this, aEn2, 1), A012, A062, ae0.A00, str2, str, A013);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8F3(Application application, AnonymousClass11S r6, C18000vb r7, AnonymousClass1KI r8, C191499mh r9) {
        super(application);
        C18070vi.A0s(application, r6, r7, r8);
        this.A00 = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A03 = r9;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A05 = A0o;
        C41731wy r0 = new C41731wy(new C186189dn((C186959f2) null, this, AnonymousClass000.A13()));
        this.A04 = r0;
        this.A07 = A0o;
        this.A06 = r0;
    }
}
