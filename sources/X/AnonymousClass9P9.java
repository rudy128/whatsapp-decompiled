package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9P9  reason: invalid class name */
public abstract class AnonymousClass9P9 {
    public static final C196119uU A00(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = jSONObject2.getJSONArray("effects");
        ArrayList A13 = AnonymousClass000.A13();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            C18070vi.A0X(jSONObject3);
            String A0J = C18070vi.A0J("thumbnailUrl", jSONObject3);
            JSONObject A0w = AnonymousClass8BS.A0w("metadata", jSONObject3);
            JSONArray jSONArray2 = A0w.getJSONArray("arCapabilityMinVersionModelings");
            ArrayList A132 = AnonymousClass000.A13();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                C18070vi.A0X(jSONObject4);
                A132.add(new ARCapabilityMinVersionModeling(jSONObject4.getInt("capability"), jSONObject4.getInt("minVersion")));
            }
            JSONArray jSONArray3 = A0w.getJSONArray("effectInstructions");
            ArrayList A133 = AnonymousClass000.A13();
            int length3 = jSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
                C18070vi.A0X(jSONObject5);
                A133.add(new C193389q1(C18070vi.A0J("token", jSONObject5), C18070vi.A0J("text", jSONObject5)));
            }
            String string = A0w.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String string2 = A0w.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string3 = A0w.getString("instanceId");
            String string4 = A0w.getString("cacheKey");
            String string5 = A0w.getString("uri");
            String string6 = A0w.getString("md5Hash");
            String string7 = A0w.getString("requiredSdkVersion");
            int i4 = A0w.getInt("fileSizeBytes");
            int i5 = A0w.getInt("uncompressedFileSizeBytes");
            ARRequestAsset$CompressionMethod valueOf = ARRequestAsset$CompressionMethod.valueOf(C18070vi.A0J("compressionMethod", A0w));
            String string8 = A0w.getString("manifestJson");
            boolean z = A0w.getBoolean("usesFlmCapability");
            C108995ce.A1H(string, string3, string2, string4);
            C108995ce.A1H(string5, string6, string7, string8);
            String str = string;
            String str2 = string3;
            String str3 = string2;
            A13.add(new AM8(new AM9(valueOf, str, str2, str3, string4, string5, string6, string7, string8, A132, A133, i4, i5, z), A0J));
        }
        return new C196119uU(C18070vi.A0J("locale", jSONObject2), A13, jSONObject2.getLong("write_time_ms"));
    }
}
