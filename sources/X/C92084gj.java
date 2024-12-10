package X;

import android.net.Uri;

/* renamed from: X.4gj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C92084gj implements C72033Kj {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ AnonymousClass206 A01;
    public final /* synthetic */ AnonymousClass48m A02;

    public final void Bom() {
        String str;
        String str2;
        AnonymousClass48m r0 = this.A02;
        AnonymousClass206 r3 = this.A01;
        AnonymousClass1FU r4 = this.A00;
        AnonymousClass3uP r2 = (AnonymousClass3uP) r0.A01;
        AnonymousClass70P r1 = (AnonymousClass70P) r2.A2J.get();
        C18070vi.A0d(r3, 0);
        C61762qD A002 = AnonymousClass70P.A00(r3);
        if (A002 == null || !r1.A09(A002)) {
            AnonymousClass4QZ r5 = (AnonymousClass4QZ) r2.A2H.get();
            AnonymousClass70P r12 = (AnonymousClass70P) r5.A02.get();
            C61762qD A003 = AnonymousClass70P.A00(r3);
            if (A003 == null || !r12.A09(A003)) {
                str = "https://faq.whatsapp.com/general/verification/about-autofilling-security-codes-on-whatsapp";
            } else {
                str = "https://faq.whatsapp.com/659113242716268/";
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            C18000vb r32 = r5.A00;
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("lg", r32.A05()).appendQueryParameter("lc", r32.A04());
            if (r5.A01.A04()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            r4.startActivity(AnonymousClass3MY.A07(appendQueryParameter.appendQueryParameter("eea", str2).build()));
            return;
        }
        AnonymousClass3MW.A0a(r2.A1q).A01(r4, "about-automatic-security-codes");
    }

    public /* synthetic */ C92084gj(AnonymousClass1FU r1, AnonymousClass206 r2, AnonymousClass48m r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
