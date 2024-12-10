package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9uA  reason: invalid class name and case insensitive filesystem */
public class C195929uA {
    public final AnonymousClass1QD A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("PaymentPinSharedPrefs", "infra", "COMMON");

    public synchronized long A00() {
        long j;
        JSONObject optJSONObject;
        j = 0;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C17880vN.A16(A06).optJSONObject("pin")) != null) {
                j = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e) {
            AnonymousClass8BX.A1C(this.A01, e, "getNextRetryTs threw: ", AnonymousClass000.A10());
        }
        return j;
    }

    public synchronized void A01(long j) {
        try {
            AnonymousClass1QD r5 = this.A00;
            JSONObject A0c = AnonymousClass8BY.A0c(r5);
            JSONObject A0w = AnonymousClass8BW.A0w("pin", A0c);
            A0w.put("v", "1");
            A0w.put("pin_next_retry_ts", j);
            A0c.put("pin", A0w);
            AnonymousClass8BT.A1G(r5, A0c);
        } catch (JSONException e) {
            AnonymousClass8BX.A1C(this.A01, e, "setPinSet threw: ", AnonymousClass000.A10());
        }
        return;
    }

    public synchronized void A02(boolean z) {
        try {
            AnonymousClass1QE r7 = this.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("setPinSet(");
            A10.append(z);
            AnonymousClass8BV.A1E(r7, ") [try]", A10);
            AnonymousClass1QD r5 = this.A00;
            JSONObject A0c = AnonymousClass8BY.A0c(r5);
            JSONObject A0w = AnonymousClass8BW.A0w("pin", A0c);
            A0w.put("v", "1");
            A0w.put("pinSet", z);
            A0c.put("pin", A0w);
            AnonymousClass8BT.A1G(r5, A0c);
            StringBuilder A11 = AnonymousClass000.A11("setPinSet(");
            A11.append(z);
            AnonymousClass8BV.A1E(r7, ") [done]", A11);
        } catch (JSONException e) {
            AnonymousClass8BX.A1C(this.A01, e, "setPinSet threw: ", AnonymousClass000.A10());
        }
        return;
    }

    public synchronized boolean A03() {
        boolean z;
        JSONObject optJSONObject;
        z = false;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = C17880vN.A16(A06).optJSONObject("pin")) != null) {
                z = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e) {
            AnonymousClass8BX.A1C(this.A01, e, "isPinSet threw: ", AnonymousClass000.A10());
        }
        return z;
    }

    public C195929uA(AnonymousClass1QD r4) {
        this.A00 = r4;
    }
}
