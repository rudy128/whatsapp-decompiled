package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.20R  reason: invalid class name */
public final class AnonymousClass20R implements AnonymousClass20O {
    public static final AnonymousClass20R A00 = new Object();

    public /* bridge */ /* synthetic */ Object BLi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        String optString2 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        List A002 = AnonymousClass20S.A00(AnonymousClass20V.A00, jSONObject.optJSONArray("bots"));
        if (optString == null || optString2 == null) {
            return null;
        }
        return new C435920d(optString, optString2, A002);
    }

    public /* bridge */ /* synthetic */ Object BLj(Object obj) {
        AnonymousClass9DG r7 = (AnonymousClass9DG) obj;
        C18070vi.A0d(r7, 0);
        String str = r7.A02;
        String str2 = r7.A03;
        AnonymousClass20V r3 = AnonymousClass20V.A00;
        List<Object> list = (List) r7.A00;
        C18070vi.A0d(list, 1);
        ArrayList arrayList = new ArrayList();
        for (Object BLj : list) {
            Object BLj2 = r3.BLj(BLj);
            if (BLj2 != null) {
                arrayList.add(BLj2);
            }
        }
        if (str == null || str2 == null) {
            return null;
        }
        return new C435920d(str, str2, arrayList);
    }

    public /* bridge */ /* synthetic */ JSONObject CPN(Object obj) {
        C435920d r4 = (C435920d) obj;
        C18070vi.A0d(r4, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
        jSONObject.put("bots", AnonymousClass20S.A01(AnonymousClass20V.A00, r4.A02));
        return jSONObject;
    }
}
