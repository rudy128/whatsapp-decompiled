package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ev  reason: invalid class name and case insensitive filesystem */
public class C31041ev {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final C31011es A02;
    public final C31031eu A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass00H A06;

    public void A02(String str, String str2, String str3, int i) {
        JSONArray jSONArray;
        String str4;
        try {
            C18070vi.A0d(str, 0);
            C18010vc r3 = ((C52422at) this.A06.get()).A00;
            SharedPreferences A052 = r3.A05("hybrid_payment_methods_used");
            C18070vi.A0X(A052);
            String string = A052.getString(str, (String) null);
            if (string == null) {
                string = "{}";
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(str2)) {
                i = jSONObject.getInt(str2) + 1;
            }
            jSONObject.put(str2, i);
            SharedPreferences A053 = r3.A05("hybrid_payment_methods_used");
            C18070vi.A0X(A053);
            A053.edit().putString(str, jSONObject.toString()).apply();
            C31001er r2 = this.A02.A01;
            C63522tF A002 = r2.A00();
            try {
                if (!TextUtils.isEmpty(A002.A0C)) {
                    jSONArray = new JSONArray(A002.A0C);
                } else {
                    jSONArray = new JSONArray();
                }
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    if (!str.equals(((JSONObject) jSONArray.get(i2)).optString("business_owner_jid"))) {
                        i2++;
                    } else if (i2 != -1) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                        jSONArray.remove(i2);
                        Iterator<String> keys = jSONObject.keys();
                        int i3 = 0;
                        while (keys.hasNext()) {
                            i3 += jSONObject.getInt(keys.next());
                        }
                        if (str3.equals("VPA")) {
                            str4 = "vpa_successful_transactions_count";
                        } else {
                            str4 = "successful_transactions_count";
                        }
                        jSONObject2.put(str4, i3);
                        jSONObject2.put("payment_method_used", jSONObject);
                        jSONArray.put(jSONObject2);
                        A002.A0C = jSONArray.toString();
                        r2.A01(A002);
                        return;
                    } else {
                        return;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentDailyUsageSync/onTransactionSuccess Error building json payload.");
                A002.A0C = new JSONArray().toString();
                r2.A01(A002);
            }
        } catch (Exception unused2) {
            Log.e("PaymentDailyUsageManager/onTransactionSuccess error updating transaction count.");
        }
    }

    public C31041ev(AnonymousClass11S r1, AnonymousClass11P r2, C18030ve r3, C31011es r4, C31031eu r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A05 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r7;
        this.A03 = r5;
    }

    public static boolean A00(C31041ev r10, C31021et r11, String str, String str2, String str3, long j) {
        Set<String> set;
        Set set2;
        String str4;
        Set set3;
        SharedPreferences A022 = r11.A02();
        C25511Om r3 = C25511Om.A00;
        Set<String> stringSet = A022.getStringSet(str, r3);
        if (stringSet != null) {
            set = C29431cG.A12(stringSet);
        } else {
            set = r3;
        }
        for (String str5 : set) {
            C18070vi.A0d(str5, 0);
            Set<String> stringSet2 = r11.A01().getStringSet(str5, r3);
            if (stringSet2 != null) {
                set2 = C29431cG.A12(stringSet2);
            } else {
                set2 = r3;
            }
            Iterator it = set2.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str6 = (String) it.next();
                    C18070vi.A0d(str6, 0);
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        try {
                            if (str.equals(jSONObject.getString("handle"))) {
                                if (AnonymousClass11P.A01(r10.A05) < jSONObject.getLong("ts") + j) {
                                    Set<String> stringSet3 = r11.A03().getStringSet(str5, r3);
                                    if (stringSet3 != null) {
                                        set3 = C29431cG.A12(stringSet3);
                                    } else {
                                        set3 = r3;
                                    }
                                    HashSet hashSet = new HashSet(set3);
                                    hashSet.add(str2);
                                    r11.A03().edit().putStringSet(str5, hashSet).apply();
                                    r10.A02(str5, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, str3, hashSet.size());
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception unused) {
                            str4 = "PaymentDailyUsageManager/checkAndUpdateTransactionCount Error in getting handle.";
                            Log.e(str4);
                        }
                    } catch (JSONException unused2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(r11.A01);
                        sb.append("/toJsonObject Error building json object.");
                        str4 = sb.toString();
                        Log.e(str4);
                    }
                }
            }
        }
        return false;
    }

    public void A01(AEX aex, AnonymousClass206 r11) {
        if (AnonymousClass25B.A00(r11) != null) {
            String A032 = C20128A8n.A03(AnonymousClass25B.A00(r11).A03);
            if ("p2p".equals(A032) || "p2m".equals(A032)) {
                C31011es r5 = this.A02;
                boolean z = false;
                if (aex != null) {
                    z = true;
                }
                boolean z2 = r11 instanceof C441322g;
                synchronized (r5) {
                    C31001er r6 = r5.A01;
                    C63522tF A002 = r6.A00();
                    A002.A05++;
                    if (z) {
                        A002.A0A++;
                    }
                    if (z2) {
                        A002.A0B++;
                        if (z) {
                            A002.A09++;
                        }
                    }
                    r6.A01(A002);
                }
            }
        }
    }
}
