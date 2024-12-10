package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1io  reason: invalid class name and case insensitive filesystem */
public final class C33431io {
    public final C18010vc A00;
    public final TreeMap A01;
    public final C18100vl A02 = new C18110vm(new C33441ip(this));

    public C33431io(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        TreeMap treeMap = new TreeMap();
        this.A00 = r3;
        this.A01 = treeMap;
    }

    public final C63592tN A00() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.A02.getValue();
        int i = sharedPreferences.getInt("current_user_notice_id", -1);
        if (i == -1) {
            return null;
        }
        return new C63592tN(i, sharedPreferences.getInt("current_user_notice_stage", 0), sharedPreferences.getInt("current_user_notice_version", 0), sharedPreferences.getLong("current_user_notice_stage_timestamp", 0), 0);
    }

    public final TreeMap A01() {
        String string;
        TreeMap treeMap = this.A01;
        if (treeMap.isEmpty() && (string = ((SharedPreferences) this.A02.getValue()).getString("user_notices", (String) null)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                C18070vi.A0X(keys);
                while (keys.hasNext()) {
                    String next = keys.next();
                    C63592tN A002 = C63592tN.A00(new JSONObject(jSONObject.get(next).toString()));
                    if (A002 != null) {
                        Integer valueOf = Integer.valueOf(next);
                        C18070vi.A0X(valueOf);
                        treeMap.put(valueOf, A002);
                    }
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return treeMap;
    }

    public final void A02(C63592tN r6) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A02.getValue()).edit();
        int i = r6.A01;
        edit.putInt("current_user_notice_id", i).putInt("current_user_notice_stage", r6.A00).putLong("current_user_notice_stage_timestamp", r6.A04).putInt("current_user_notice_version", r6.A03).apply();
        TreeMap A012 = A01();
        A012.put(Integer.valueOf(i), r6);
        Collection values = A012.values();
        C18070vi.A0X(values);
        A03(C29431cG.A0t(values));
    }

    public final void A03(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeMap treeMap = this.A01;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63592tN r3 = (C63592tN) it.next();
            JSONObject A012 = C63592tN.A01(r3);
            if (A012 != null) {
                int i = r3.A01;
                linkedHashMap.put(String.valueOf(i), A012.toString());
                treeMap.put(Integer.valueOf(i), r3);
            }
        }
        ((SharedPreferences) this.A02.getValue()).edit().putString("user_notices", new JSONObject(linkedHashMap).toString()).apply();
    }
}
