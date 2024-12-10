package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9o7  reason: invalid class name and case insensitive filesystem */
public final class C192289o7 {
    public final A2V A00;
    public final String A01;

    public C192289o7(A2V a2v, String str) {
        C18070vi.A0d(a2v, 1);
        this.A00 = a2v;
        this.A01 = str;
    }

    public final void A00(C19980A1q a1q, Integer num, String str, String str2, String str3, Map map) {
        String str4 = str2;
        C18070vi.A0j(str, str4);
        A2X A02 = this.A00.A02(this.A01);
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = ":";
        A02.A02(new C21109Aed(a1q, num, str, (String) C29431cG.A0b(AnonymousClass1YF.A0S(str4, A1Y, 0)), AnonymousClass9RD.A00(str4), str3, map));
    }

    public final void A01(C19980A1q a1q, String str, String str2, Map map) {
        LinkedHashMap linkedHashMap;
        C18070vi.A0d(str2, 1);
        A2X A02 = this.A00.A02(this.A01);
        if (map != null) {
            linkedHashMap = C20062A5l.A01((Integer) map.get("code"), C17880vN.A0s(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), C17880vN.A0s("message", map), AnonymousClass8BS.A0u("params", map));
        } else if (a1q != null) {
            linkedHashMap = C20062A5l.A01(a1q.A00, a1q.A02, a1q.A01, (Map) null);
        } else {
            linkedHashMap = null;
        }
        A02.A02(new AnonymousClass7NW(str, str2, linkedHashMap));
    }
}
