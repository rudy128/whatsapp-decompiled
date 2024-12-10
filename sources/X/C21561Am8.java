package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Am8  reason: case insensitive filesystem */
public final class C21561Am8 implements BCK {
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
                str = C108955ca.A11("userId", A16);
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

    public C192759ow CPl(Cursor cursor, AnonymousClass9IX r13) {
        AnonymousClass9IX r10 = r13;
        C18070vi.A0d(r13, 1);
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
            throw new C21582AmW("Column not found.");
        }
        String string = cursor.getString(columnIndex2);
        String string2 = cursor.getString(columnIndex5);
        if (string == null || string2 == null) {
            throw new NullPointerException();
        }
        return new C192759ow(string, string2, "INSTAGRAM", new C27321Dbs(cursor, columnIndex3, columnIndex4, columnIndex6), C00.INSTAGRAM, r10);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.A0y, java.lang.Object] */
    public A0y CPi(Context context, Cursor cursor) {
        String str;
        String str2;
        String str3;
        int columnIndex = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex2 = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        int columnIndex7 = cursor.getColumnIndex("COL_SSO_SETTINGS_CACHE");
        if (columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
            throw new C21582AmW("Column not found.");
        }
        String str4 = "";
        if (!C18070vi.A18(context.getPackageName(), "com.whatsapp")) {
            if (columnIndex != -1) {
                str = cursor.getString(columnIndex);
            } else {
                str = cursor.getString(columnIndex2);
            }
            C18070vi.A0X(str);
            str2 = AnonymousClass8BS.A0c(cursor, columnIndex3);
            str3 = AnonymousClass8BS.A0c(cursor, columnIndex4);
            C18070vi.A0X(cursor.getString(columnIndex2));
        } else {
            str = str4;
            str2 = str4;
            str3 = str4;
        }
        String string = cursor.getString(columnIndex5);
        if (string != null) {
            if (columnIndex7 != -1) {
                str4 = cursor.getString(columnIndex7);
            }
            C21338AiO A00 = C181899Sg.A00(str4);
            A0x a0x = new A0x(str, str2, str3);
            if (columnIndex6 != -1) {
                cursor.getString(columnIndex6);
            }
            ? obj = new Object();
            obj.A01 = a0x;
            obj.A00 = string;
            obj.A02 = A00;
            return obj;
        }
        throw new NullPointerException();
    }
}
