package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7LT  reason: invalid class name */
public final class AnonymousClass7LT implements AnonymousClass1O5 {
    public final /* synthetic */ AnonymousClass732 A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C35081lc A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void C7Z(C29621ca r5, String str) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/performPingUser/sendData/onSuccess", 0);
        C35081lc r2 = this.A03;
        ((C34951lN) r2.A09.get()).A06(false);
        try {
            C35081lc.A06(r5, r2);
            C17880vN.A1F(C18070vi.A02(r2.A03), "pref_ping_one_time_delay_for_server_error", false);
            this.A01.C7I(this.A00);
        } catch (IllegalStateException unused) {
            C31081ez.A02("AccountLinkingFbUserEntityOperationHelper/performPingUser/sendData/onSuccess Error while parsing ping interval");
        }
    }

    public AnonymousClass7LT(AnonymousClass732 r1, C1606789m r2, AnonymousClass705 r3, C35081lc r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void BrD(String str) {
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/performPingUser/sendData/onDeliveryFailure", 0);
        this.A01.BrA();
    }

    public void Bt9(C29621ca r27, String str) {
        C29621ca r2 = r27;
        String str2 = str;
        C18070vi.A0h(str2, r2);
        C35081lc r8 = this.A03;
        C122936Sm r11 = new C122936Sm(r2, str2);
        C1606789m r7 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        C18070vi.A0b(publicKey);
        Integer num = this.A04;
        int A032 = AnonymousClass3MY.A03(num);
        AnonymousClass732 r5 = this.A00;
        AnonymousClass705 r10 = this.A02;
        int A002 = C122936Sm.A00(r11);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handlePingError/error with code ", AnonymousClass000.A10(), A002));
        C35081lc r21 = r8;
        AnonymousClass732 r18 = r5;
        C1606789m r19 = r7;
        AnonymousClass7R5 r17 = new AnonymousClass7R5(r18, r19, r10, r21, publicKey, x509Certificate, A032, 3);
        if (A002 == 500) {
            C35051lZ r3 = r8.A03;
            if (!C17880vN.A1W(C35051lZ.A00(r3), "pref_ping_one_time_delay_for_server_error")) {
                long A003 = (long) C18020vd.A00(C18040vf.A02, r8.A01, 2042);
                if (A003 > 0) {
                    r3.A02(TimeUnit.HOURS.toSeconds(A003));
                    C17880vN.A1F(C18070vi.A02(r3), "pref_ping_one_time_delay_for_server_error", true);
                    r7.C7I(r5);
                    return;
                }
            }
        }
        if (!C35081lc.A07(r7, r10, r11, r21, r17, A002)) {
            if (A002 != 401) {
                if (A002 == 480) {
                    C108965cb.A0g(r8).A02(r10, new AnonymousClass6O6(r5, r7, r10, r8, 1), r11);
                    return;
                } else if (A002 != 484) {
                    C109005cf.A0H(A002);
                } else {
                    C35081lc.A02(r5, r7, r10, r11, r8, publicKey, x509Certificate, A032);
                    return;
                }
            } else if (r10.A04()) {
                r8.CBe(r5, new C144107Ga(r7, r10, r8, publicKey, x509Certificate, A032), new AnonymousClass705(1, C20113A7w.A0L), num, publicKey, x509Certificate);
                return;
            }
            r7.Bsw(r11);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
