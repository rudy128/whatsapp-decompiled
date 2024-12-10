package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.72P  reason: invalid class name */
public class AnonymousClass72P {
    public final Bundle A00;

    public static String A00(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean A01(Bundle bundle) {
        String str = "gcm.n.e";
        if (!"1".equals(bundle.getString(str))) {
            if (str.startsWith("gcm.n.")) {
                str = str.replace("gcm.n.", "gcm.notification.");
            }
            if ("1".equals(bundle.getString(str))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public Bundle A02() {
        Bundle bundle = this.A00;
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (!A0v.startsWith("google.c.a.") && !A0v.equals("from")) {
                bundle2.remove(A0v);
            }
        }
        return bundle2;
    }

    public String A05(String str) {
        Bundle bundle = this.A00;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public AnonymousClass72P(Bundle bundle) {
        this.A00 = new Bundle(bundle);
    }

    public Integer A03(String str) {
        String A05 = A05(str);
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        try {
            return C108955ca.A0l(A05);
        } catch (NumberFormatException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Couldn't parse value of ");
            A10.append(A00(str));
            A10.append("(");
            A10.append(A05);
            Log.w("NotificationParams", AnonymousClass000.A0y(") into an int", A10));
            return null;
        }
    }

    public String A04(Resources resources, String str, String str2) {
        String[] strArr;
        String A05 = A05(str2);
        if (!TextUtils.isEmpty(A05)) {
            return A05;
        }
        String A052 = A05(AnonymousClass000.A0y("_loc_key", AnonymousClass000.A11(str2)));
        if (!TextUtils.isEmpty(A052)) {
            int identifier = resources.getIdentifier(A052, "string", str);
            if (identifier == 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(A00(C17900vP.A0A(str2, "_loc_key")));
                C17890vO.A10(" resource not found: ", str2, " Default value will be used.", A10);
                Log.w("NotificationParams", A10.toString());
            } else {
                JSONArray A06 = A06(AnonymousClass000.A0y("_loc_args", AnonymousClass000.A11(str2)));
                if (A06 == null) {
                    strArr = null;
                } else {
                    int length = A06.length();
                    strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = A06.optString(i);
                    }
                }
                if (strArr == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, strArr);
                } catch (MissingFormatArgumentException e) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Missing format argument for ");
                    A102.append(A00(str2));
                    A102.append(": ");
                    Log.w("NotificationParams", AnonymousClass001.A1H(Arrays.toString(strArr), " Default value will be used.", A102), e);
                    return null;
                }
            }
        }
        return null;
    }

    public JSONArray A06(String str) {
        String A05 = A05(str);
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        try {
            return new JSONArray(A05);
        } catch (JSONException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Malformed JSON for key ");
            A10.append(A00(str));
            A10.append(": ");
            A10.append(A05);
            Log.w("NotificationParams", AnonymousClass000.A0y(", falling back to default", A10));
            return null;
        }
    }

    public boolean A07(String str) {
        String A05 = A05(str);
        if ("1".equals(A05) || Boolean.parseBoolean(A05)) {
            return true;
        }
        return false;
    }
}
