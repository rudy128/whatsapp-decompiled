package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lH  reason: invalid class name and case insensitive filesystem */
public final class C34911lH {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C34911lH(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass6p7 A01(C35021lW r8) {
        String str;
        C18070vi.A0d(r8, 0);
        A00(this);
        C33631j8 r3 = (C33631j8) this.A00.get();
        HashMap A02 = C33631j8.A02(r3);
        StringBuilder sb = new StringBuilder();
        sb.append("FBCredentialsStore/getFBPasswordlessIdentity/FbUserType: ");
        sb.append(r8);
        Log.i(sb.toString());
        if (A02.isEmpty()) {
            str = "FBCredentialsStore/getFBPasswordlessIdentity/fbUsers is empty";
        } else {
            String str2 = (String) A02.get("waffle_companion");
            if (str2 == null || str2.isEmpty()) {
                str = "FBCredentialsStore/getFBPasswordlessIdentity/userCredentials is null";
            } else {
                try {
                    r3.A02.get();
                    JSONObject jSONObject = new JSONObject(str2);
                    long j = jSONObject.getLong("fbid");
                    String string = jSONObject.getString("access_token");
                    String string2 = jSONObject.getString("usertype");
                    C18070vi.A0d(string2, 1);
                    return new AnonymousClass6p7(new C35021lW(string2, true), string, j);
                } catch (JSONException e) {
                    Log.e("FBCredentialsStore/getFBPasswordlessIdentity/getJsonStringAsEntity/JSONException");
                    C17960vV.A0B(e);
                    return null;
                }
            }
        }
        Log.i(str);
        return null;
    }

    public static final void A00(C34911lH r1) {
        if (!((AnonymousClass11S) r1.A01.get()).A0N()) {
            throw new IllegalStateException("Operation not allowed in non-companion mode");
        }
    }
}
