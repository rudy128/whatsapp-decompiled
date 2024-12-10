package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A3Z {
    public static final C198249y2 A00(A3Z a3z, JSONObject jSONObject) {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Integer A00 = AnonymousClass9SX.A00(jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
        JSONArray jSONArray = jSONObject.getJSONArray("filters");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject2);
            boolean optBoolean = jSONObject2.optBoolean("passIfNotSupported", false);
            JSONObject optJSONObject = jSONObject2.optJSONObject("extra_data");
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            } else {
                str = null;
            }
            HashMap A01 = A3M.A01(str);
            ArrayList A0z = C17880vN.A0z(A01.size());
            Iterator A0i = C17890vO.A0i(A01);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                AnonymousClass1D6.A02(A16.getKey(), A16.getValue().toString(), A0z);
            }
            A13.add(new C186309dz(new AnonymousClass9ZE(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2)), AnonymousClass1D7.A0D(A0z), optBoolean));
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("clauses");
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
            C18070vi.A0X(jSONObject3);
            A132.add(A00(a3z, jSONObject3));
        }
        return new C198249y2(A00, A13, A132);
    }

    public static final JSONObject A01(A3Z a3z, C198249y2 r9) {
        String str;
        JSONObject A15 = C17880vN.A15();
        switch (r9.A00.intValue()) {
            case 0:
                str = "AND";
                break;
            case 1:
                str = "OR";
                break;
            case 2:
                str = "NOR";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A15.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        JSONArray A1A = AnonymousClass8BR.A1A();
        Iterator it = r9.A02.iterator();
        while (it.hasNext()) {
            C186309dz r4 = (C186309dz) it.next();
            JSONObject A0u = C108985cd.A0u(r4);
            A0u.putOpt("passIfNotSupported", Boolean.valueOf(r4.A02));
            A0u.putOpt("extra_data", new JSONObject(r4.A01));
            A0u.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A00.A00);
            A1A.put(A0u);
        }
        A15.putOpt("filters", A1A);
        JSONArray A1A2 = AnonymousClass8BR.A1A();
        Iterator it2 = r9.A01.iterator();
        while (it2.hasNext()) {
            A1A2.put(A01(a3z, (C198249y2) it2.next()));
        }
        A15.putOpt("clauses", A1A2);
        return A15;
    }
}
