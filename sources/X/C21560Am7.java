package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Am7  reason: case insensitive filesystem */
public final class C21560Am7 implements BCK {
    public A0y CPi(Context context, Cursor cursor) {
        String str;
        String str2;
        String str3;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A16 = C17880vN.A16(string);
            JSONObject jSONObject = A16.getJSONObject("profile");
            if (!C18070vi.A18(context.getPackageName(), "com.whatsapp")) {
                str = C18070vi.A0J("uid", jSONObject);
                str3 = C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject);
                str2 = C18070vi.A0J("pic_square", jSONObject);
            } else {
                str = "";
                str2 = str;
                str3 = str;
            }
            return new A0y(A16.getString("access_token"), new A0x(str, str3, str2));
        } catch (JSONException e) {
            throw new C21582AmW((Throwable) e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.A0y, java.lang.Object] */
    public A0y CPk(Context context, Cursor cursor) {
        String str;
        String str2;
        String str3;
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A16 = C17880vN.A16(string);
            if (!C18070vi.A18(context.getPackageName(), "com.whatsapp")) {
                str = C108955ca.A11("user_id", A16);
                str2 = C108955ca.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A16);
                str3 = C108955ca.A11("profilePicUrl", A16);
            } else {
                str = "";
                str2 = str;
                str3 = str;
            }
            String optString = A16.optString("accessToken");
            String optString2 = A16.optString("sso_settings_v2");
            A0x a0x = new A0x(str, str2, str3);
            C21338AiO A00 = C181899Sg.A00(optString2);
            ? obj = new Object();
            obj.A01 = a0x;
            obj.A00 = optString;
            obj.A02 = A00;
            return obj;
        } catch (JSONException e) {
            throw new C21582AmW((Throwable) e);
        }
    }

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
            return new C192759ow(jSONObject.getString("uid"), A16.getString("access_token"), "FACEBOOK", new C27319Dbq(jSONObject), C00.FACEBOOK, r8);
        } catch (JSONException e) {
            throw new C21582AmW((Throwable) e);
        }
    }
}
