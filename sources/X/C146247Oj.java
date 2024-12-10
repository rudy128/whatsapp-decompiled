package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Oj  reason: invalid class name and case insensitive filesystem */
public final class C146247Oj implements AnonymousClass89Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1606789m A01;
    public final /* synthetic */ AnonymousClass705 A02;
    public final /* synthetic */ C1418477e A03;
    public final /* synthetic */ C35081lc A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ PublicKey A06;
    public final /* synthetic */ X509Certificate A07;

    public void Bsu(C122936Sm r22) {
        C122936Sm r0 = r22;
        C18070vi.A0d(r0, 0);
        C35081lc r7 = this.A04;
        C1606789m r5 = this.A01;
        X509Certificate x509Certificate = this.A07;
        PublicKey publicKey = this.A06;
        int i = this.A00;
        long A09 = C108985cd.A09(this.A03);
        AnonymousClass732 r11 = new AnonymousClass732(C35081lc.A0D, (Long) null, this.A05, "dummy", (String) null, A09, -1);
        AnonymousClass705 r6 = this.A02;
        int A002 = C122936Sm.A00(r0);
        C31081ez.A02(AnonymousClass001.A1I("AccountLinkingFbUserEntityOperationHelper/handleCreateTokenError/error with code ", AnonymousClass000.A10(), A002));
        if (C35081lc.A07(r5, r6, r0, r7, new AnonymousClass7R5(r11, r5, r6, r7, publicKey, x509Certificate, i, 2), A002)) {
            return;
        }
        if (A002 == 304) {
            r7.CBe(r11, r5, r6, Integer.valueOf(i), publicKey, x509Certificate);
        } else if (A002 == 401) {
            C146277Om r1 = new C146277Om(r5, r7, r0);
            C138346wv.A00(AnonymousClass705.A00(), r1, (C138346wv) r7.A06.get());
        } else if (A002 == 409) {
            C108965cb.A0g(r7).A01(r5, r0);
        } else if (A002 != 480) {
            C109005cf.A0H(A002);
            r5.Bsw(r0);
        } else {
            C108965cb.A0g(r7).A02(r6, new AnonymousClass6O6(r11, r5, r6, r7, 0), r0);
        }
    }

    public void C7b(C29621ca r8, JSONObject jSONObject) {
        C18070vi.A0d(AnonymousClass001.A1E(jSONObject, "AccountLinkingFbUserEntityOperationHelper/createToken/sendData/onSuccess ", AnonymousClass3MZ.A19(r8, 1)), 0);
        C35081lc r2 = this.A04;
        r2.A05.get();
        C17960vV.A07(jSONObject);
        String str = this.A05;
        C17960vV.A07(str);
        AnonymousClass732 A002 = C137206v5.A00(C35081lc.A0D, str, jSONObject);
        try {
            C35081lc.A06(r8, r2);
        } catch (IllegalStateException e) {
            C31081ez.A01(C17900vP.A0C("AccountLinkingFbUserEntityOperationHelper/createToken/sendData/onSuccess Error while parsing ping interval - ", AnonymousClass000.A10(), e));
        }
        Number number = (Number) AnonymousClass732.A00(A002);
        long A09 = C108985cd.A09(this.A03);
        if (number == null || number.longValue() != A09) {
            C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/createToken/sendData/onSuccess error ids do not match", 0);
            C108965cb.A1C(this.A01, "ids do not match");
            return;
        }
        this.A01.C7I(A002);
    }

    public C146247Oj(C1606789m r1, AnonymousClass705 r2, C1418477e r3, C35081lc r4, String str, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A04 = r4;
        this.A05 = str;
        this.A03 = r3;
        this.A01 = r1;
        this.A07 = x509Certificate;
        this.A06 = publicKey;
        this.A00 = i;
        this.A02 = r2;
    }
}
