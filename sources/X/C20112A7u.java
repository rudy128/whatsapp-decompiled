package X;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A7u  reason: case insensitive filesystem */
public class C20112A7u {
    public final String A00;
    public final JSONObject A01;

    public static C20112A7u A01() {
        return new C20112A7u((String) null, new C20112A7u[0]);
    }

    public static C20112A7u A02() {
        return new C20112A7u((String) null, new C20112A7u[0]);
    }

    public static C20112A7u A03(C20112A7u[] a7uArr) {
        return new C20112A7u((String) null, a7uArr);
    }

    public static void A04(C20112A7u a7u, AnonymousClass91R r3) {
        a7u.A06("is_alias_resolved", 1);
        if (!TextUtils.isEmpty(r3.A0S)) {
            a7u.A07("receiver_platform", r3.A0S);
        }
    }

    public void A05(C20112A7u a7u) {
        try {
            String str = a7u.A00;
            if (str == null) {
                JSONObject jSONObject = a7u.A01;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0v = C17880vN.A0v(keys);
                    this.A01.put(A0v, jSONObject.get(A0v));
                }
                return;
            }
            this.A01.put(str, a7u.A01);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A06(String str, int i) {
        try {
            this.A01.put(str, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A07(String str, String str2) {
        try {
            this.A01.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void A08(String str, boolean z) {
        try {
            this.A01.put(str, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public C20112A7u(String str, C20112A7u... a7uArr) {
        this.A01 = C17880vN.A15();
        this.A00 = str;
        int length = a7uArr.length;
        for (int i = 0; i < length; i = 1) {
            A05(a7uArr[i]);
        }
    }

    public String toString() {
        JSONObject A15 = C17880vN.A15();
        try {
            String str = this.A00;
            if (str != null) {
                A15.put(str, this.A01);
            } else {
                A15 = this.A01;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return A15.toString();
    }

    public C20112A7u(C20112A7u... a7uArr) {
        this((String) null, a7uArr);
    }
}
