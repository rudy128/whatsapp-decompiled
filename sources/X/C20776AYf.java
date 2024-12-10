package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.AYf  reason: case insensitive filesystem */
public final class C20776AYf implements BBF {
    public final /* synthetic */ AnonymousClass905 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public void C26(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        Log.e("PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync iq returned null");
        AnonymousClass905 r1 = this.A00;
        int i = a7b.A00;
        BBM bbm = r1.A00;
        if (bbm == null) {
            C18070vi.A11("resourceResultCallback");
            throw null;
        } else {
            bbm.Btu(new C19980A1q(Integer.valueOf(i), "ProviderKeyNetworkError", (String) null), (Map) null);
        }
    }

    public void C27(AZ2 az2) {
        String encodeToString;
        C18070vi.A0d(az2, 0);
        AnonymousClass905 r2 = this.A00;
        String str = this.A02;
        String str2 = this.A01;
        C18070vi.A0d(str2, 1);
        if (C18070vi.A18(str, "OTP")) {
            encodeToString = r2.A03.A04(az2, str2);
        } else {
            String str3 = C19620yd.A0A;
            C18070vi.A0Z(str3);
            encodeToString = Base64.encodeToString(AZ2.A00(az2, AnonymousClass8BX.A1a(str3, str2)), 2);
        }
        if (encodeToString == null || encodeToString.length() == 0) {
            BBM bbm = r2.A00;
            if (bbm == null) {
                C18070vi.A11("resourceResultCallback");
                throw null;
            } else {
                bbm.Btu(new C19980A1q(-1, "ProviderKeyNetworkError", (String) null), (Map) null);
            }
        } else {
            BBM bbm2 = r2.A00;
            if (bbm2 == null) {
                C18070vi.A11("resourceResultCallback");
                throw null;
            }
            AnonymousClass1D6[] r22 = new AnonymousClass1D6[4];
            AnonymousClass1D6.A03("data", encodeToString, r22, 0);
            C108985cd.A1G("key_type", az2.A03, r22);
            AnonymousClass1D6.A03("key_provider", az2.A05, r22, 2);
            C72463Mc.A1J("key_version", az2.A04, r22);
            bbm2.C7V(AnonymousClass1D7.A0C(r22));
        }
    }

    public C20776AYf(AnonymousClass905 r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }
}
