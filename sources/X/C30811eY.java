package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1eY  reason: invalid class name and case insensitive filesystem */
public class C30811eY {
    public final C18010vc A00;
    public final String A01;

    public static C60082nM A00(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("uj");
            C22941Dw r0 = UserJid.Companion;
            UserJid A03 = C22941Dw.A03(string);
            String string2 = jSONObject.getString("s");
            if (jSONObject.has("a")) {
                str3 = jSONObject.getString("a");
            } else {
                str3 = null;
            }
            C56112gv r4 = new C56112gv(A03, string2, str3, jSONObject.getLong("ct"), jSONObject.getLong("lit"));
            r4.A04 = jSONObject.getBoolean("hcslm");
            r4.A00 = jSONObject.optInt("brc", -1);
            r4.A01 = jSONObject.optLong("fmts", -1);
            r4.A05 = jSONObject.optBoolean("wdtb", false);
            if (jSONObject.has("es")) {
                r4.A03 = jSONObject.optString("es");
            }
            if (jSONObject.has("em")) {
                r4.A02 = jSONObject.optString("em");
            }
            return new C60082nM(r4);
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "CTWA: EntryPointConversionStore/getConversion/json error";
            sb.append(str2);
            sb.append(e);
            Log.e(sb.toString());
            return null;
        } catch (AnonymousClass11T e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "CTWA: EntryPointConversionStore/getConversion/invalid jid error";
            sb.append(str2);
            sb.append(e);
            Log.e(sb.toString());
            return null;
        }
    }

    public C60082nM A01(UserJid userJid) {
        String string = this.A00.A05(this.A01).getString(userJid.getRawString(), (String) null);
        if (string != null) {
            return A00(string);
        }
        return null;
    }

    public ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = this.A00.A05(this.A01).getAll();
        for (Map.Entry next : all.entrySet()) {
            Object obj = all.get(next.getKey());
            if (obj != null) {
                C60082nM A002 = A00(obj.toString());
                if (A002 != null) {
                    arrayList.add(A002);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("CTWA: EntryPointConversionStore/getAllConversions/ null pref value for key=");
                sb.append(next);
                Log.e(sb.toString());
            }
        }
        return arrayList;
    }

    public void A03(C60082nM r4) {
        try {
            this.A00.A05("entry_point_conversions_for_sending").edit().putString(r4.A04.getRawString(), r4.A00()).apply();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CTWA: EntryPointConversionStore/storeConversion/json error");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public C30811eY(C18010vc r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
