package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9PE  reason: invalid class name */
public abstract class AnonymousClass9PE {
    public static final C20007A2x A00(AnonymousClass1NT r18, A7X a7x, C18030ve r20, C195939uB r21, InputStream inputStream, String str) {
        JSONObject jSONObject;
        try {
            String A00 = AnonymousClass1EY.A00(inputStream);
            if (A00 == null || A00.length() == 0) {
                Log.e("gdrive-api-v2/backup/empty input");
                return null;
            }
            JSONObject A16 = C17880vN.A16(A00);
            String A01 = C20064A5n.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null, A16);
            String A012 = C20064A5n.A01("updateTime", (String) null, A16);
            if (A012 == null || A012.length() == 0) {
                Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
                return null;
            }
            long A09 = AnonymousClass8BX.A09(A012);
            long optLong = A16.optLong("sizeBytes", -1);
            String A013 = C20064A5n.A01("activeTransactionId", (String) null, A16);
            String A014 = C20064A5n.A01("metadata", (String) null, A16);
            if (A014 == null || A014.length() == 0) {
                jSONObject = null;
            } else {
                jSONObject = C17880vN.A16(A014);
            }
            if (A01 != null && A09 > 0) {
                return new C20007A2x(r18, a7x, r20, r21, str, A01, A013, jSONObject, A09, optLong);
            }
            return null;
        } catch (JSONException e) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
            return null;
        } catch (IOException e2) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e2);
        }
    }
}
