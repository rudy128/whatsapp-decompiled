package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class A2H {
    public boolean A00;
    public AnonymousClass9WX A01 = new AnonymousClass9WX(this);
    public final AnonymousClass118 A02;
    public final C19830z4 A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AtomicBoolean A07 = C108965cb.A0w();
    public final AnonymousClass00H A08;

    public final C185459cc A01() {
        String A0r = C17880vN.A0r(C17890vO.A0B(this.A03), "commerce_metadata_tanslations");
        if (A0r != null) {
            try {
                JSONObject A16 = C17880vN.A16(A0r);
                LinkedHashMap A13 = C17880vN.A13();
                JSONArray optJSONArray = A16.optJSONArray("strings");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            A13.put(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, optJSONObject), C18070vi.A0J("value", optJSONObject));
                        }
                    }
                }
                C185459cc r2 = new C185459cc(C18070vi.A0J("locale", A16), A13, A16.getLong("expiresAt"));
                if (C18070vi.A18(r2.A01, this.A04.A0N().getLanguage())) {
                    return r2;
                }
                Log.e("CommerceTranslationsMetadataManager/CommerceMetadataTranslations/translation locale is different than system locale ");
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void A02() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            C20970AcO acO = (C20970AcO) this.A08.get();
            AnonymousClass9WX r0 = this.A01;
            C18070vi.A0d(r0, 0);
            acO.A00 = r0;
            AnonymousClass00H r02 = acO.A02;
            String A0T = C17890vO.A0T(r02);
            AnonymousClass1OZ A0U = C17880vN.A0U(r02);
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
            C17880vN.A1Q("locale", acO.A01.A05(), r2, 0);
            C29621ca r3 = new C29621ca(AnonymousClass8BR.A0k("translations", r2), "commerce_metadata", new AnonymousClass1MD[0]);
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[5];
            C17880vN.A1I(C173438v4.A00, "to", r22, 0);
            C17880vN.A1Q("xmlns", "fb:thrift_iq", r22, 1);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
            AnonymousClass8BV.A1O("smax_id", "91", r22);
            A0U.A0I(acO, AnonymousClass8BW.A0Q(r3, AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T), r22), A0T, 334, 32000);
        }
    }

    public A2H(AnonymousClass118 r2, C19830z4 r3, C18000vb r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r6, r5, r2);
        C18070vi.A0d(r7, 6);
        this.A03 = r3;
        this.A04 = r4;
        this.A08 = r6;
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r7;
    }

    public static String A00(A2H a2h, Object obj, String str) {
        String str2;
        C185459cc A012 = a2h.A01();
        if (A012 == null || (str2 = (String) A012.A02.get(obj)) == null) {
            return str;
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0.A00 < X.C17880vN.A04(new java.util.Date().getTime())) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r6 = this;
            X.9cc r0 = r6.A01()
            r5 = 0
            if (r0 == 0) goto L_0x001b
            long r3 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r1 = X.C17880vN.A04(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            X.9cc r0 = r6.A01()
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.A01
            X.0vb r0 = r6.A04
            java.util.Locale r0 = r0.A0N()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.C18070vi.A18(r1, r0)
        L_0x0032:
            if (r2 != 0) goto L_0x0036
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r5 = 1
        L_0x0037:
            return r5
        L_0x0038:
            r0 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2H.A03():boolean");
    }
}
