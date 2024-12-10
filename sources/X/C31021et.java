package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1et  reason: invalid class name and case insensitive filesystem */
public abstract class C31021et {
    public final C18010vc A00;
    public final String A01;

    public C31021et(C18010vc r2, String str) {
        C18070vi.A0d(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final int A00(String str, String str2, String str3, long j) {
        Set set;
        StringBuilder sb;
        String str4;
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        C18070vi.A0d(str3, 3);
        SharedPreferences A012 = A01();
        Set set2 = C25511Om.A00;
        Set<String> stringSet = A012.getStringSet(str, set2);
        if (stringSet != null) {
            set = C29431cG.A12(stringSet);
        } else {
            set = set2;
        }
        HashSet hashSet = new HashSet(set);
        Iterator it = hashSet.iterator();
        String str5 = null;
        while (it.hasNext()) {
            String str6 = (String) it.next();
            C18070vi.A0d(str6, 0);
            try {
                try {
                    if (C18070vi.A18(new JSONObject(str6).getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), str2)) {
                        str5 = str6;
                    }
                } catch (Exception unused) {
                    sb = new StringBuilder();
                    sb.append(this.A01);
                    str4 = "/updateDailyMessageMetadata Error in getting id.";
                    sb.append(str4);
                    Log.e(sb.toString());
                }
            } catch (JSONException unused2) {
                sb = new StringBuilder();
                sb.append(this.A01);
                str4 = "/toJsonObject Error building json object.";
                sb.append(str4);
                Log.e(sb.toString());
            }
        }
        if (!(str5 == null || str5.length() == 0)) {
            C41681wt.A00(hashSet).remove(str5);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
            jSONObject.put("ts", j);
            jSONObject.put("handle", str3);
            String obj = jSONObject.toString();
            if (obj != null) {
                hashSet.add(obj);
            }
        } catch (JSONException unused3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.A01);
            sb2.append("/toJsonString Error building json payload.");
            Log.e(sb2.toString());
        }
        A01().edit().putStringSet(str, hashSet).apply();
        Set<String> stringSet2 = A02().getStringSet(str3, set2);
        if (stringSet2 != null) {
            set2 = C29431cG.A12(stringSet2);
        }
        HashSet hashSet2 = new HashSet(set2);
        hashSet2.add(str);
        A02().edit().putStringSet(str3, hashSet2).apply();
        return hashSet.size();
    }

    public SharedPreferences A01() {
        if (this instanceof AnonymousClass2LW) {
            AnonymousClass2LW r2 = (AnonymousClass2LW) this;
            SharedPreferences sharedPreferences = r2.A00;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A05 = r2.A00.A05("vpa_daily_prefs");
            r2.A00 = A05;
            if (A05 != null) {
                return A05;
            }
            throw new IllegalStateException("Required value was null.");
        }
        C31031eu r22 = (C31031eu) this;
        SharedPreferences sharedPreferences2 = r22.A00;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A052 = r22.A00.A05("qr_code_daily_prefs");
        r22.A00 = A052;
        return A052;
    }

    public SharedPreferences A02() {
        if (this instanceof AnonymousClass2LW) {
            AnonymousClass2LW r2 = (AnonymousClass2LW) this;
            SharedPreferences sharedPreferences = r2.A01;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A05 = r2.A00.A05("vpa_payment_handle_prefs");
            r2.A01 = A05;
            if (A05 != null) {
                return A05;
            }
            throw new IllegalStateException("Required value was null.");
        }
        C31031eu r22 = (C31031eu) this;
        SharedPreferences sharedPreferences2 = r22.A01;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A052 = r22.A00.A05("payment_handle_prefs");
        r22.A01 = A052;
        return A052;
    }

    public SharedPreferences A03() {
        if (this instanceof AnonymousClass2LW) {
            AnonymousClass2LW r2 = (AnonymousClass2LW) this;
            SharedPreferences sharedPreferences = r2.A02;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            SharedPreferences A05 = r2.A00.A05("vpa_txn_prefs");
            r2.A02 = A05;
            if (A05 != null) {
                return A05;
            }
            throw new IllegalStateException("Required value was null.");
        }
        C31031eu r22 = (C31031eu) this;
        SharedPreferences sharedPreferences2 = r22.A02;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences A052 = r22.A00.A05("qr_code_txn_prefs");
        r22.A02 = A052;
        return A052;
    }

    public final void A04() {
        A01().edit().clear().apply();
        A02().edit().clear().apply();
        A03().edit().clear().apply();
    }
}
