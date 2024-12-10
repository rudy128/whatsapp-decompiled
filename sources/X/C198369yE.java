package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9yE  reason: invalid class name and case insensitive filesystem */
public class C198369yE {
    public final List A00 = AnonymousClass000.A13();
    public final List A01 = AnonymousClass000.A13();
    public final boolean A02;
    public final List A03 = AnonymousClass000.A13();

    public C198369yE(C18030ve r5) {
        this.A02 = C18020vd.A05(C18040vf.A02, r5, 5480);
        String A0I = r5.A0I(5481);
        if (!TextUtils.isEmpty(A0I)) {
            try {
                JSONObject A16 = C17880vN.A16(A0I);
                ArrayList A002 = A00(A16.optJSONArray("merchant_list"));
                Collections.sort(A002);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    this.A00.add(((C21342AiV) it.next()).A01);
                }
                ArrayList A003 = A00(A16.optJSONArray("explore_merchants"));
                Collections.sort(A003);
                Iterator it2 = A003.iterator();
                while (it2.hasNext()) {
                    this.A03.add(((C21342AiV) it2.next()).A01);
                }
                ArrayList A004 = A00(A16.optJSONArray("chat_with_merchants"));
                Collections.sort(A004);
                Iterator it3 = A004.iterator();
                while (it3.hasNext()) {
                    this.A01.add(((C21342AiV) it3.next()).A01);
                }
            } catch (JSONException unused) {
                Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct from abprops");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.AiV, java.lang.Object] */
    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList A13 = AnonymousClass000.A13();
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    ? obj = new Object();
                    String optString = jSONObject.optString("merchant_number");
                    obj.A01 = optString;
                    if (!TextUtils.isEmpty(optString)) {
                        obj.A00 = jSONObject.optInt("rank", -1);
                        A13.add(obj);
                    }
                    i++;
                } catch (JSONException unused) {
                    Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct merchant list");
                }
            }
        }
        return A13;
    }
}
