package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Ol  reason: invalid class name and case insensitive filesystem */
public final class C146267Ol implements AnonymousClass89Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C1418477e A03;
    public final /* synthetic */ C1418477e A04;
    public final /* synthetic */ C1418477e A05;
    public final /* synthetic */ C1418477e A06;
    public final /* synthetic */ C1418477e A07;
    public final /* synthetic */ C1418477e A08;
    public final /* synthetic */ C35081lc A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ PublicKey A0C;
    public final /* synthetic */ X509Certificate A0D;

    public void Bsu(C122936Sm r31) {
        C122936Sm r2 = r31;
        C18070vi.A0d(r2, 0);
        C35081lc r7 = this.A09;
        C1418477e r29 = this.A03;
        Integer num = this.A0A;
        C1418477e r9 = this.A05;
        C1418477e r8 = this.A04;
        C1418477e r6 = this.A07;
        C1418477e r5 = this.A08;
        C1418477e r4 = this.A06;
        C1606789m r3 = this.A01;
        X509Certificate x509Certificate = this.A0D;
        PublicKey publicKey = this.A0C;
        int i = this.A00;
        AnonymousClass705 r1 = this.A02;
        int A002 = C122936Sm.A00(r2);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handleResetPasswordError/error with code ", AnonymousClass000.A10(), A002));
        C35081lc r24 = r7;
        Integer num2 = num;
        C1418477e r22 = r5;
        C1418477e r23 = r4;
        C1418477e r20 = r8;
        C1418477e r21 = r6;
        C1418477e r18 = r29;
        C1418477e r19 = r9;
        C1606789m r16 = r3;
        AnonymousClass705 r17 = r1;
        if (C35081lc.A07(r16, r17, r2, r7, new C146667Qd(r16, r17, r18, r19, r20, r21, r22, r23, r24, num2, publicKey, x509Certificate, i), A002)) {
            return;
        }
        if (A002 != 480) {
            if (A002 != 484) {
                C109005cf.A0H(A002);
            } else {
                C31081ez.A02("AccountLinkingFbUserEntityOperationHelper/handleSuspendedError");
                ((C34951lN) r7.A09.get()).A06(AnonymousClass000.A0i());
                r2.node.A0K("error");
            }
            r3.Bsw(r2);
            return;
        }
        C1418477e r162 = r8;
        C1418477e r172 = r6;
        C1418477e r14 = r29;
        C1418477e r15 = r9;
        C1606789m r12 = r3;
        AnonymousClass705 r13 = r1;
        C108965cb.A0g(r7).A02(r1, new AnonymousClass6O8(r12, r13, r14, r15, r162, r172, r5, r4, r7, num), r2);
    }

    public C146267Ol(C1606789m r1, AnonymousClass705 r2, C1418477e r3, C1418477e r4, C1418477e r5, C1418477e r6, C1418477e r7, C1418477e r8, C35081lc r9, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A09 = r9;
        this.A01 = r1;
        this.A0B = str;
        this.A03 = r3;
        this.A0A = num;
        this.A05 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A06 = r8;
        this.A0D = x509Certificate;
        this.A0C = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }

    public void C7b(C29621ca r15, JSONObject jSONObject) {
        C1606789m r2;
        Exception A0n;
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/performResetPassword/success", 0);
        C17960vV.A07(jSONObject);
        try {
            this.A09.A05.get();
            C18070vi.A0b(jSONObject);
            int i = C108985cd.A0v(jSONObject).getInt("response_code");
            if (i != 0) {
                if (i != 1) {
                    r2 = this.A01;
                    if (i != 2) {
                        A0n = AnonymousClass000.A0n(AnonymousClass001.A1I("unknown code: ", AnonymousClass000.A10(), i));
                    } else {
                        A0n = new AnonymousClass61J();
                    }
                } else {
                    r2 = this.A01;
                    A0n = AnonymousClass000.A0n("invalid auth token");
                }
                r2.Bsw(A0n);
                return;
            }
        } catch (JSONException unused) {
        }
        C1606789m r3 = this.A01;
        AnonymousClass00H r22 = this.A09.A05;
        r22.get();
        C18070vi.A0b(jSONObject);
        long j = C108985cd.A0v(jSONObject).getLong("fbid");
        String str = this.A0B;
        r22.get();
        r3.C7I(new AnonymousClass732(C35081lc.A0D, (Long) null, str, "dummy access token", (String) null, j, C108985cd.A0v(jSONObject).getLong("timestamp")));
    }
}
