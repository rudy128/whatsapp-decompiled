package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AS7 implements C22505BAm {
    public final /* synthetic */ AnonymousClass8F3 A00;

    public void Bt6(Integer num, String str, String str2) {
        C18070vi.A0d(num, 3);
        AnonymousClass8F3 r4 = this.A00;
        r4.A04.A0E(new C186189dn(new C186959f2(r4, num, str, str2), r4, (List) null));
    }

    public AS7(AnonymousClass8F3 r1) {
        this.A00 = r1;
    }

    public void C7k(String str) {
        Object obj = C17880vN.A16(str).get("data");
        C18070vi.A0z(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) obj;
        AnonymousClass8F3 r9 = this.A00;
        C41731wy r8 = r9.A04;
        ArrayList A13 = AnonymousClass000.A13();
        if (jSONObject != null && jSONObject.has("coupons")) {
            Object obj2 = jSONObject.get("coupons");
            C18070vi.A0z(obj2, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray = (JSONArray) obj2;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj3 = jSONArray.get(i);
                C18070vi.A0z(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj3;
                Object obj4 = jSONObject2.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C18070vi.A0z(obj4, "null cannot be cast to non-null type kotlin.String");
                Object obj5 = jSONObject2.get("code");
                C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.String");
                Object obj6 = jSONObject2.get("description");
                C18070vi.A0z(obj6, "null cannot be cast to non-null type kotlin.String");
                A13.add(new C20263ADv((String) obj4, (String) obj5, (String) obj6));
            }
        }
        r8.A0E(new C186189dn((C186959f2) null, r9, A13));
    }
}
