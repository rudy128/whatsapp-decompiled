package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Oh  reason: invalid class name and case insensitive filesystem */
public final class C146227Oh implements AnonymousClass89Y {
    public final /* synthetic */ C1606789m A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ C35081lc A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void Bsu(C122936Sm r18) {
        C122936Sm r13 = r18;
        C18070vi.A0d(r13, 0);
        C35081lc r10 = this.A02;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        Integer num = this.A03;
        C1606789m r8 = this.A00;
        AnonymousClass705 r6 = this.A01;
        String str = this.A04;
        int A002 = C122936Sm.A00(r13);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handleDeleteUserError/error with code ", AnonymousClass000.A10(), A002));
        AnonymousClass7QN r4 = new AnonymousClass7QN(x509Certificate, r6, publicKey, r8, num, r10, str, 2);
        if (!C35081lc.A08(r8, r6, r13, r10, r4, A002)) {
            if (A002 == 429) {
                C139996zm A0g = C108965cb.A0g(r10);
                Long A012 = r6.A01();
                if (A012 != null) {
                    A0g.A00.CGv(r4, A012.longValue());
                    return;
                }
            } else if (A002 != 481) {
                C109005cf.A0H(A002);
            } else {
                r10.A0A.get();
                if (r6.A04()) {
                    r4.run();
                    return;
                }
            }
            r8.Bsw(r13);
        }
    }

    public C146227Oh(C1606789m r1, AnonymousClass705 r2, C35081lc r3, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A03 = num;
        this.A01 = r2;
        this.A04 = str;
    }

    public void C7b(C29621ca r3, JSONObject jSONObject) {
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/performDeleteUser/sendData/onSuccess", 0);
        this.A00.C7I((AnonymousClass732) null);
        C108965cb.A0g(this.A02).A00();
    }
}
