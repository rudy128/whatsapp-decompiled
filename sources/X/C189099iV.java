package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9iV  reason: invalid class name and case insensitive filesystem */
public final class C189099iV {
    public final JSONArray A00(List list) {
        JSONArray A1A = AnonymousClass8BR.A1A();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20244ADc aDc = (C20244ADc) it.next();
                JSONObject A0u = C108985cd.A0u(aDc);
                A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, aDc.A00);
                A1A.put(A0u);
            }
            return A1A;
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionOfferData/toJsonArray threw: ", e);
            return A1A;
        }
    }
}
