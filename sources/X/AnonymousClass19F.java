package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.19F  reason: invalid class name */
public class AnonymousClass19F {
    public final SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass10U A03;
    public final AnonymousClass19E A04;
    public final C18020vd A05;
    public final AnonymousClass188 A06;
    public final C18010vc A07;
    public final AnonymousClass00H A08;
    public final C19830z4 A09;
    public final AnonymousClass19D A0A;

    public synchronized int A01() {
        return this.A00.getInt("ab_props:sys:last_version", 0);
    }

    public synchronized long A02() {
        return this.A00.getLong("ab_props:sys:last_refresh_time", 0);
    }

    public synchronized String A03() {
        String str;
        Set<String> stringSet = this.A00.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
        if (stringSet == null) {
            str = "";
        } else {
            str = TextUtils.join(",", stringSet);
        }
        return str;
    }

    public synchronized void A04() {
        AnonymousClass19D r0 = this.A0A;
        r0.A0K();
        r0.A0P().edit().clear().apply();
        C19830z4 r1 = this.A09;
        Log.i("washaredpreferences/clearPreChatdAbHash");
        ((SharedPreferences) r1.A00.get()).edit().remove("pref_pre_chatd_ab_hash").apply();
    }

    public synchronized void A05(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i);
        edit.apply();
    }

    public synchronized void A06(int i) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putInt("ab_props:sys:last_error_code", i);
        edit.apply();
    }

    public synchronized void A07(String str) {
        Log.i("CheckIfReinstalledTask/updatePreChatdABProps");
        A04();
        if (TextUtils.isEmpty(str)) {
            Log.i("CheckIfReinstalledTask/updatePreChatdABProps/empty expConfigs");
        } else {
            try {
                SharedPreferences.Editor edit = this.A0A.A0P().edit();
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        A00(edit, this, jSONObject.getString("config_value"), Integer.parseInt(jSONObject.getString("config_code")));
                    }
                }
                edit.apply();
            } catch (JSONException e) {
                Log.e("ABPropsManager/updatePreChatdABProps/update abprop configs failed", e);
            }
        }
        return;
    }

    public AnonymousClass19F(AnonymousClass11P r2, AnonymousClass118 r3, C19830z4 r4, AnonymousClass19D r5, AnonymousClass10U r6, AnonymousClass19E r7, C18020vd r8, AnonymousClass188 r9, C18010vc r10, AnonymousClass00H r11) {
        this.A01 = r2;
        this.A05 = r8;
        this.A0A = r5;
        this.A02 = r3;
        this.A04 = r7;
        this.A03 = r6;
        this.A06 = r9;
        this.A00 = r10.A05("ab-props");
        this.A07 = r10;
        this.A08 = r11;
        this.A09 = r4;
    }

    public static boolean A00(SharedPreferences.Editor editor, AnonymousClass19F r8, String str, int i) {
        C201110w r0;
        C201110w r02;
        C201110w r03;
        C201110w r04;
        C201110w r05;
        if (!TextUtils.isEmpty(str)) {
            String num = Integer.toString(i);
            try {
                C18020vd r4 = r8.A05;
                boolean z = r4 instanceof C18030ve;
                if (z) {
                    r0 = ((C18030ve) r4).A00;
                } else {
                    r0 = ((AnonymousClass19D) r4).A00.A00;
                }
                Integer valueOf = Integer.valueOf(i);
                if (r0.containsKey(valueOf)) {
                    boolean z2 = false;
                    if (Integer.parseInt(str) != 0) {
                        z2 = true;
                    }
                    editor.putBoolean(num, z2);
                    return true;
                }
                if (z) {
                    r02 = ((C18030ve) r4).A02;
                } else {
                    r02 = ((AnonymousClass19D) r4).A00.A02;
                }
                if (r02.containsKey(valueOf)) {
                    editor.putInt(num, Integer.parseInt(str));
                    return true;
                }
                if (z) {
                    r03 = ((C18030ve) r4).A01;
                } else {
                    r03 = ((AnonymousClass19D) r4).A00.A01;
                }
                if (r03.containsKey(valueOf)) {
                    editor.putFloat(num, Float.parseFloat(str));
                    return true;
                }
                if (z) {
                    r04 = ((C18030ve) r4).A04;
                } else {
                    r04 = ((AnonymousClass19D) r4).A00.A04;
                }
                if (!r04.containsKey(valueOf)) {
                    if (z) {
                        r05 = ((C18030ve) r4).A03;
                    } else {
                        r05 = ((AnonymousClass19D) r4).A00.A03;
                    }
                    if (r05.containsKey(valueOf)) {
                        new JSONObject(str);
                    }
                }
                editor.putString(num, str);
                return true;
            } catch (NumberFormatException | JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ABPropsManager/invalid format for config; configCode=");
                sb.append(i);
                sb.append("; value=");
                sb.append(str);
                Log.e(sb.toString(), e);
            }
        }
        return false;
    }
}
