package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Ok  reason: invalid class name and case insensitive filesystem */
public final class C146257Ok implements AnonymousClass89Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C35081lc A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ PublicKey A09;
    public final /* synthetic */ X509Certificate A0A;

    public void Bsu(C122936Sm r22) {
        C122936Sm r3 = r22;
        C18070vi.A0d(r3, 0);
        C35081lc r7 = this.A03;
        C1606789m r5 = this.A01;
        X509Certificate x509Certificate = this.A0A;
        PublicKey publicKey = this.A09;
        int intValue = this.A04.intValue();
        int i = this.A00;
        String str = this.A08;
        String str2 = this.A06;
        String str3 = this.A05;
        AnonymousClass705 r6 = this.A02;
        int A002 = C122936Sm.A00(r3);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handleCreateUserError/error with code ", AnonymousClass000.A10(), A002));
        if (C35081lc.A08(r5, r6, r3, r7, new AnonymousClass7QY(r5, r6, r7, str, str2, str3, publicKey, x509Certificate, intValue, i), A002)) {
            return;
        }
        if (A002 == 304) {
            C146277Om r1 = new C146277Om(r5, r7, r3);
            C138346wv.A00(AnonymousClass705.A00(), r1, (C138346wv) r7.A06.get());
        } else if (A002 == 409) {
            C108965cb.A0g(r7).A01(r5, r3);
        } else if (A002 != 480) {
            C109005cf.A0H(A002);
            r5.Bsw(r3);
        } else {
            C108965cb.A0g(r7).A02(r6, new AnonymousClass6O7(r5, r6, r7, str, str2, str3, i), r3);
        }
    }

    public C146257Ok(C1606789m r1, AnonymousClass705 r2, C35081lc r3, Integer num, String str, String str2, String str3, String str4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A03 = r3;
        this.A0A = x509Certificate;
        this.A01 = r1;
        this.A07 = str;
        this.A09 = publicKey;
        this.A04 = num;
        this.A02 = r2;
        this.A00 = i;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = str4;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.87L] */
    public void C7b(C29621ca r10, JSONObject jSONObject) {
        C31081ez.A02("AccountLinkingFbUserEntityOperationHelper/performCreateUser/success");
        C35081lc r4 = this.A03;
        ? obj = new Object();
        r4.A05.get();
        C17960vV.A07(jSONObject);
        C1418477e r3 = new C1418477e(obj, Long.valueOf(C108985cd.A0v(jSONObject).getLong("fbid")), "WaFbid");
        X509Certificate x509Certificate = this.A0A;
        C35081lc.A05(this.A01, this.A02, r3, r4, this.A07, this.A09, x509Certificate, this.A04.intValue());
    }
}
