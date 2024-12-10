package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Oi  reason: invalid class name and case insensitive filesystem */
public final class C146237Oi implements AnonymousClass89Y {
    public final /* synthetic */ AnonymousClass732 A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C35081lc A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public void Bsu(C122936Sm r19) {
        AnonymousClass6O6 r2;
        C139996zm r1;
        C122936Sm r13 = r19;
        C18070vi.A0d(r13, 0);
        C35081lc r6 = this.A03;
        C1606789m r4 = this.A01;
        X509Certificate x509Certificate = this.A06;
        PublicKey publicKey = this.A05;
        int intValue = this.A04.intValue();
        AnonymousClass732 r3 = this.A00;
        AnonymousClass705 r5 = this.A02;
        int A002 = C122936Sm.A00(r13);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handleRefreshTokenError/error with code ", AnonymousClass000.A10(), A002));
        C1606789m r11 = r4;
        AnonymousClass705 r12 = r5;
        C35081lc r14 = r6;
        if (!C35081lc.A07(r11, r12, r13, r14, new AnonymousClass7R5(r3, r4, r5, r6, publicKey, x509Certificate, intValue, 5), A002)) {
            if (A002 == 401) {
                r2 = new AnonymousClass6O6(r3, r4, r5, r6, 4);
                boolean A032 = r5.A03();
                r1 = C108965cb.A0g(r6);
                if (A032) {
                    r1.A01(r4, r13);
                    return;
                }
            } else if (A002 == 480) {
                r1 = C108965cb.A0g(r6);
                r2 = new AnonymousClass6O6(r3, r4, r5, r6, 5);
            } else if (A002 != 484) {
                C109005cf.A0H(A002);
                r4.Bsw(r13);
                return;
            } else {
                C35081lc.A02(r3, r11, r12, r13, r14, publicKey, x509Certificate, intValue);
                return;
            }
            r1.A02(r5, r2, r13);
        }
    }

    public C146237Oi(AnonymousClass732 r1, C1606789m r2, AnonymousClass705 r3, C35081lc r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A02 = r3;
    }

    public void C7b(C29621ca r15, JSONObject jSONObject) {
        C35081lc r3 = this.A03;
        AnonymousClass00H r4 = r3.A05;
        r4.get();
        C17960vV.A07(jSONObject);
        String string = C108985cd.A0v(jSONObject).getString("access_token");
        C18070vi.A0X(string);
        r4.get();
        C18070vi.A0b(jSONObject);
        long j = C108985cd.A0v(jSONObject).getLong("timestamp");
        AnonymousClass732 r6 = this.A00;
        Object obj = r6.A04.A00;
        C17960vV.A07(obj);
        Number number = (Number) obj;
        r4.get();
        long j2 = C108985cd.A0v(jSONObject).getLong("fbid");
        if (number == null || number.longValue() != j2) {
            C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/performRefreshUserToken/sendData/onSuccess error ids do not match", 0);
            C108965cb.A1C(this.A01, "ids do not match");
        } else {
            C1606789m r0 = this.A01;
            C17960vV.A07(obj);
            C18070vi.A0X(obj);
            long A052 = C17880vN.A05(obj);
            r0.C7I(new AnonymousClass732(r6.A01, (Long) null, AnonymousClass732.A01(r6), string, r6.A08, A052, j));
        }
        ((C34951lN) r3.A09.get()).A06(AnonymousClass000.A0h());
    }
}
