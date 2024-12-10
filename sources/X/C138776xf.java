package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6xf  reason: invalid class name and case insensitive filesystem */
public final class C138776xf {
    public static final long A00(AnonymousClass708 r5) {
        C18070vi.A0d(r5, 0);
        return ((((long) r5.A00) + 1048576) - 1) / 1048576;
    }

    public final ArrayList A01(String str) {
        Integer num;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList A13 = AnonymousClass000.A13();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject);
            String A0J = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject);
            int i2 = jSONObject.getInt("version");
            String A0J2 = C18070vi.A0J("hash", jSONObject);
            int i3 = jSONObject.getInt("uncompressedFileSizeInBytes");
            String A0J3 = C18070vi.A0J("modelExtension", jSONObject);
            String A0J4 = C18070vi.A0J("compressionType", jSONObject);
            if (A0J4.equals("NONE")) {
                num = AnonymousClass00R.A00;
            } else if (A0J4.equals("BROTLI")) {
                num = AnonymousClass00R.A01;
            } else {
                throw AnonymousClass000.A0k(A0J4);
            }
            A13.add(new AnonymousClass708(C122716Rq.valueOf(C18070vi.A0J("feature", jSONObject)), num, A0J, A0J2, A0J3, i2, i3));
        }
        return A13;
    }
}
