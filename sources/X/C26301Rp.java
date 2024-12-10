package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1Rp  reason: invalid class name and case insensitive filesystem */
public class C26301Rp extends C24861Ly {
    @Deprecated
    public synchronized HashSet A0M(String str) {
        HashSet hashSet;
        String A0K = A0K(str);
        hashSet = new HashSet();
        if (A0K != null) {
            try {
                JSONArray jSONArray = new JSONArray(A0K);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                throw new IllegalStateException("key-value-store/getStringSetProp:", e);
            }
        }
        return hashSet;
    }

    @Deprecated
    public synchronized void A0N(String str, Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        A04(this, str, jSONArray.toString());
    }

    @Deprecated
    public boolean A0O(String str) {
        String A0K = A0K(str);
        if (TextUtils.isEmpty(A0K)) {
            return false;
        }
        return Boolean.parseBoolean(A0K);
    }

    public static void A04(C26301Rp r4, String str, String str2) {
        C28791au A06;
        try {
            A06 = r4.A00.A06();
            if (TextUtils.isEmpty(str2)) {
                C24861Ly.A02(A06, "wa_props", "prop_name=?", new String[]{str});
            } else {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("prop_name", str);
                contentValues.put("prop_value", str2);
                C24861Ly.A05(contentValues, A06, "wa_props");
            }
            A06.close();
            return;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/unable to set prop:");
            sb.append(str);
            C17960vV.A09(sb.toString(), e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    @Deprecated
    public String A0K(String str) {
        Cursor A03;
        C28781at A05 = this.A00.get();
        try {
            A03 = C24861Ly.A03(A05, "SELECT prop_value FROM wa_props WHERE prop_name = ?", "CONTACT_PROPS", new String[]{str});
            if (A03.moveToFirst()) {
                String string = A03.getString(A03.getColumnIndexOrThrow("prop_value"));
                A03.close();
                A05.close();
                return string;
            }
            A03.close();
            A05.close();
            return null;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C26301Rp(C24811Lt r1) {
        super(r1);
    }

    @Deprecated
    public Integer A0I(String str) {
        String A0K = A0K(str);
        if (A0K == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A0K));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/getIntProp/Invalid int value: ");
            sb.append(A0K);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    @Deprecated
    public Long A0J(String str) {
        String A0K = A0K(str);
        if (A0K == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A0K));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("key-value-store/getLongProp/Invalid long value: ");
            sb.append(A0K);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    @Deprecated
    public ArrayList A0L(String str) {
        String A0K = A0K(str);
        if (A0K == null) {
            return null;
        }
        String[] split = A0K.split(",");
        ArrayList arrayList = new ArrayList();
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str2 = split[i];
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                i++;
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("key-value-store/getLongListProp/Invalid long value: ");
                sb.append(str2);
                Log.e(sb.toString(), e);
                return null;
            }
        }
        return arrayList;
    }
}
