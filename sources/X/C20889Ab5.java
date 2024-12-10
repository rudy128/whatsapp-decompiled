package X;

import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab5  reason: case insensitive filesystem */
public final class C20889Ab5 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        String A03;
        String A032;
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            String string = A16.getString("uj");
            AnonymousClass1E2 A033 = AnonymousClass1E2.A01.A03(C20064A5n.A01("ul", (String) null, A16));
            long j = A16.getLong("ct");
            LinkedHashMap A13 = C17880vN.A13();
            if (A16.has("pl")) {
                JSONObject jSONObject = A16.getJSONObject("pl");
                for (C179569Im r3 : C179569Im.A00) {
                    String valueOf = String.valueOf(r3.jsonKey);
                    if (jSONObject.has(valueOf)) {
                        A13.put(r3, C18070vi.A0J(valueOf, jSONObject));
                    }
                }
            }
            C179569Im r32 = C179569Im.ENTRY_POINT_TYPE;
            if (!A13.containsKey(r32) && (A032 = A6n.A03("lt", A16, C18070vi.A15(A16, "lt"))) != null) {
                A13.put(r32, A032);
            }
            C179569Im r33 = C179569Im.PARTNER_NAME;
            if (!A13.containsKey(r33) && (A03 = A6n.A03("p", A16, C18070vi.A15(A16, "p"))) != null) {
                A13.put(r33, A03);
            }
            C179569Im r1 = C179569Im.AUTH_FAIL;
            if (!A13.containsKey(r1) && C18070vi.A19(A6n.A00("s", A16), false)) {
                A13.put(r1, "1");
            }
            return new AnonymousClass8oQ(A033, C22941Dw.A03(string), A13, j);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: ExternalEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: ExternalEntryPointTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        String str;
        AnonymousClass8oQ r5 = (AnonymousClass8oQ) obj;
        C18070vi.A0d(r5, 0);
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("uj", r5.A00.getRawString());
            A15.put("ct", r5.A00);
            AnonymousClass1E2 r0 = r5.A01;
            if (r0 != null) {
                str = r0.getRawString();
            } else {
                str = null;
            }
            A15.put("ul", str);
            return AnonymousClass8BV.A0r(r5.A02(), "pl", A15);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: ExternalEntryPointTransformer/toData/JSONException", e);
        }
    }
}
