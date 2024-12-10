package X;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: X.1Mb  reason: invalid class name and case insensitive filesystem */
public final class C24891Mb {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 7));
    public final C18100vl A02 = new C18110vm(new C71023Dm(this, 8));

    public C24891Mb(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final JSONObject A00(C24891Mb r1, AnonymousClass1BI r2) {
        Object value = r1.A01.getValue();
        C18070vi.A0X(value);
        String string = ((SharedPreferences) value).getString(r2.getRawString(), (String) null);
        if (string == null || string.length() == 0) {
            return null;
        }
        return new JSONObject(string);
    }

    public static final void A01(C24891Mb r2, AnonymousClass1BI r3, JSONObject jSONObject) {
        Object value = r2.A01.getValue();
        C18070vi.A0X(value);
        ((SharedPreferences) value).edit().putString(r3.getRawString(), jSONObject.toString()).apply();
    }
}
