package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Am6  reason: case insensitive filesystem */
public final class C21559Am6 implements BCK {
    public C192759ow CPl(Cursor cursor, AnonymousClass9IX r11) {
        AnonymousClass9IX r8 = r11;
        C18070vi.A0d(r11, 1);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A16 = C17880vN.A16(string);
            JSONObject jSONObject = A16.getJSONObject("profile");
            return new C192759ow(jSONObject.getString("uid"), A16.getString("access_token"), "FACEBOOK", new C27318Dbp(jSONObject), C00.FACEBOOK_LITE, r8);
        } catch (JSONException e) {
            throw new C21582AmW((Throwable) e);
        }
    }

    public A0y CPi(Context context, Cursor cursor) {
        String str;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A16 = C17880vN.A16(string);
            JSONObject jSONObject = A16.getJSONObject("profile");
            String string2 = jSONObject.getString("uid");
            String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (jSONObject.has("profile_pic_url")) {
                str = jSONObject.getString("profile_pic_url");
            } else {
                str = "";
            }
            return new A0y(A16.getString("access_token"), new A0x(string2, string3, str));
        } catch (JSONException e) {
            throw new C21582AmW((Throwable) e);
        }
    }

    public A0y CPk(Context context, Cursor cursor) {
        throw new C21582AmW("LiteProvider not used in Facebook Lite.");
    }
}
