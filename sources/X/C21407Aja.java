package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.Aja  reason: case insensitive filesystem */
public final /* synthetic */ class C21407Aja implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ C191349mS A01;
    public final /* synthetic */ C178759Ei A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public final void run() {
        C191349mS r1 = this.A01;
        UserJid userJid = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        Long l = this.A03;
        String str3 = this.A06;
        String str4 = this.A07;
        String str5 = this.A08;
        C178759Ei r9 = this.A02;
        AnonymousClass3Ma.A1O(r1, 0, str2);
        C18070vi.A0d(r9, 8);
        UserJid A012 = C60432o1.A01((AnonymousClass190) null, r1.A00, r1.A01, userJid, (String) null);
        if (A012 == null) {
            Log.e("PAY: BrazilGetCheckoutSessionAction lidCompatibleJid is null");
            C21291Ahc ahc = (C21291Ahc) r1.A03;
            if (ahc.A00 != 0) {
                ((C18090vk) ahc.A01).invoke();
            } else {
                AnonymousClass3MX.A1K(((BrazilHostedPaymentPageViewModel) ahc.A02).A00, 2);
            }
        } else {
            String A0f = C108985cd.A0f();
            String str6 = null;
            if (l != null && l.longValue() == 0) {
                l = null;
            }
            if (!(str5 == null || str5.length() == 0)) {
                str6 = str5;
            }
            AnonymousClass9F6 r7 = new AnonymousClass9F6(A012, r9, l, str, str2, A0f, str3, str4, str6);
            r1.A02.A0N(new C20996Aco(r1, r7, 14), (C29621ca) r7.A00, str, 204, 32000);
        }
    }

    public /* synthetic */ C21407Aja(UserJid userJid, C191349mS r2, C178759Ei r3, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A01 = r2;
        this.A00 = userJid;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = l;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = r3;
    }
}
