package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab6  reason: case insensitive filesystem */
public final class C20890Ab6 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        String str2 = str;
        C18070vi.A0d(str2, 0);
        try {
            JSONObject A16 = C17880vN.A16(str2);
            String string = A16.getString("j");
            AnonymousClass1E2 A03 = AnonymousClass1E2.A01.A03(C20064A5n.A01("l", (String) null, A16));
            String string2 = A16.getString("t");
            long j = A16.getLong("c");
            JSONObject jSONObject = A16.getJSONObject("p");
            LinkedHashMap A13 = C17880vN.A13();
            for (C179489Ie r3 : C179489Ie.values()) {
                String valueOf = String.valueOf(r3.jsonKey);
                if (jSONObject.has(valueOf)) {
                    A13.put(r3, C18070vi.A0J(valueOf, jSONObject));
                }
            }
            UserJid A032 = C22941Dw.A03(string);
            C18070vi.A0b(string2);
            return new A1A(C49372Qf.valueOf(string2), A03, A032, AnonymousClass1D7.A0F(A13), j);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: IntegrityDiscoveryEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: IntegrityDiscoveryEntryPointTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        String str;
        A1A a1a = (A1A) obj;
        C18070vi.A0d(a1a, 0);
        try {
            JSONObject A15 = C17880vN.A15();
            Iterator A152 = AnonymousClass000.A15(a1a.A04);
            while (A152.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A152);
                A15.put(String.valueOf(((C179489Ie) A16.getKey()).jsonKey), A16.getValue());
            }
            JSONObject A153 = C17880vN.A15();
            A153.put("j", a1a.A03.getRawString());
            AnonymousClass1E2 r0 = a1a.A02;
            if (r0 != null) {
                str = r0.getRawString();
            } else {
                str = null;
            }
            A153.put("l", str);
            A153.put("t", a1a.A01);
            A153.put("c", a1a.A00);
            return AnonymousClass8BV.A0r(A15, "p", A153);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: IntegrityDiscoveryEntryPointTransformer/toData/JSONException", e);
        }
    }
}
