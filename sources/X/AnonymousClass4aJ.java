package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aJ  reason: invalid class name */
public abstract class AnonymousClass4aJ {
    public static String A00(C70503Bi r2) {
        String str;
        AnonymousClass1BI r22 = r2.A00;
        if (C22971Dz.A0e(r22)) {
            str = r22.getRawString();
        } else {
            C17960vV.A0F(C22971Dz.A0d(r22), "MentionUtil/unexpected jid type in mention");
            str = r22.user;
            C17960vV.A07(str);
        }
        return AnonymousClass001.A1H("@", str, AnonymousClass000.A10());
    }

    public static String A01(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass5SJ r1 = new AnonymousClass5SJ((C70503Bi) it.next());
            JSONObject jSONObject = new JSONObject();
            r1.invoke(jSONObject);
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    public static boolean A05(AnonymousClass11S r2, List list) {
        return A02(UserJid.class, list).contains(AnonymousClass11S.A00(r2));
    }

    public static ArrayList A02(Class cls, Iterable iterable) {
        ArrayList A13 = AnonymousClass000.A13();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C70503Bi) it.next()).A00;
                if (cls.isInstance(r1)) {
                    A13.add(cls.cast(r1));
                }
            }
        }
        return A13;
    }

    public static ArrayList A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '[') {
            return A04(str);
        }
        ArrayList A13 = AnonymousClass000.A13();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C18070vi.A0d(jSONObject, 0);
                C22931Dv r0 = AnonymousClass1BI.A00;
                A13.add(new C70503Bi(C22931Dv.A01(jSONObject.getString("j")), A6n.A02("d", jSONObject)));
            }
            return A13;
        } catch (JSONException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MentionUtil/Failed to parse mention from JSON looking string: ");
            A10.append(str.substring(0, 5));
            C17890vO.A19(A10, "...");
            return A04(str);
        }
    }

    public static ArrayList A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList A0A = C22971Dz.A0A(UserJid.class, Arrays.asList(str.split(",")));
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            A13.add(new C70503Bi(C17880vN.A0Q(it), (String) null));
        }
        return A13;
    }
}
