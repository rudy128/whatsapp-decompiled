package X;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.9Qg  reason: invalid class name and case insensitive filesystem */
public abstract class C181379Qg {
    public static final String A00(String str, JSONObject jSONObject, boolean z) {
        String str2;
        String str3;
        String str4;
        C18070vi.A0i(jSONObject, str);
        Iterator<String> keys = jSONObject.keys();
        if (z) {
            str2 = AnonymousClass001.A1H("{\n", str, AnonymousClass000.A10());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(10);
            A10.append(AnonymousClass1YE.A06(str, "  ", ""));
            str3 = C17890vO.A0b(A10);
            str4 = AnonymousClass001.A1H(",\n", str, AnonymousClass000.A10());
        } else {
            str2 = "{ ";
            str3 = " }";
            str4 = ", ";
        }
        StringBuilder sb = new StringBuilder(str2);
        C18070vi.A0b(keys);
        String A1H = AnonymousClass001.A1H(AnonymousClass1b2.A05(str4, B37.A00, AnonymousClass1b2.A0C(new B1N(str, jSONObject, z), AnonymousClass1JO.A01(keys))), str3, sb);
        C18070vi.A0X(A1H);
        return A1H;
    }
}
