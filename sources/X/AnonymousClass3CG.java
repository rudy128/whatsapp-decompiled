package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3CG  reason: invalid class name */
public class AnonymousClass3CG implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public AnonymousClass3CG(Object obj, Object obj2, Object obj3, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = j;
        this.A05 = str;
    }

    public final void run() {
        C31001er r6;
        C63522tF r5;
        String str;
        JSONArray jSONArray;
        String str2;
        JSONArray jSONArray2;
        if (this.A00 != 0) {
            C139676zG r2 = (C139676zG) this.A02;
            AnonymousClass205 r1 = (AnonymousClass205) this.A04;
            long j = this.A01;
            String str3 = this.A05;
            if (((C42741yf) this.A03).A02()) {
                str2 = "ent";
            } else {
                str2 = "smb";
            }
            C31041ev r0 = r2.A0Q;
            AnonymousClass1BI r7 = r1.A00;
            int A002 = r0.A03.A00(r7.user, r1.A01, str3, j);
            r6 = r0.A02.A01;
            r5 = r6.A00();
            if (!TextUtils.isEmpty(r5.A0C)) {
                jSONArray2 = new JSONArray(r5.A0C);
            } else {
                jSONArray2 = new JSONArray();
            }
            JSONObject A003 = C31011es.A00(r7.user, jSONArray2);
            A003.put("business_owner_jid", r7.user);
            A003.put("biz_platform", str2);
            A003.put("messages_viewed_count", A002);
            jSONArray2.put(A003);
            r5.A0C = jSONArray2.toString();
        } else {
            ALX alx = (ALX) this.A02;
            AnonymousClass205 r22 = (AnonymousClass205) this.A04;
            long j2 = this.A01;
            String str4 = this.A05;
            if (((C42741yf) this.A03).A02()) {
                str = "ent";
            } else {
                str = "smb";
            }
            C31041ev r12 = alx.A09;
            AnonymousClass1BI r72 = r22.A00;
            int A004 = ((C31021et) r12.A04.get()).A00(r72.user, r22.A01, str4, j2);
            r6 = r12.A02.A01;
            r5 = r6.A00();
            try {
                if (!TextUtils.isEmpty(r5.A0C)) {
                    jSONArray = new JSONArray(r5.A0C);
                } else {
                    jSONArray = new JSONArray();
                }
                JSONObject A005 = C31011es.A00(r72.user, jSONArray);
                A005.put("business_owner_jid", r72.user);
                A005.put("biz_platform", str);
                A005.put("vpa_messages_viewed_count", A004);
                jSONArray.put(A005);
                r5.A0C = jSONArray.toString();
            } catch (JSONException unused) {
                Log.e("PaymentDailyUsageSync/onQrCodeReceived Error building json payload.");
                r5.A0C = new JSONArray().toString();
                r6.A01(r5);
                return;
            }
        }
        r6.A01(r5);
    }
}
