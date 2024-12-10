package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab7  reason: case insensitive filesystem */
public final class C20891Ab7 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            C22941Dw r0 = UserJid.Companion;
            UserJid A03 = C22941Dw.A03(A16.getString("KEY_JID"));
            AnonymousClass1E2 A032 = AnonymousClass1E2.A01.A03(C20064A5n.A01("KEY_LID", (String) null, A16));
            JSONObject jSONObject = A16.getJSONObject("KEY_DATA");
            C18070vi.A0b(jSONObject);
            return new C194349ra(A032, A03, jSONObject);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: CtwaTrustSignalStoreStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C194349ra r4 = (C194349ra) obj;
        C18070vi.A0d(r4, 0);
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("KEY_JID", r4.A01.getRawString());
            A15.put("KEY_DATA", r4.A02);
            AnonymousClass1E2 r0 = r4.A00;
            if (r0 != null) {
                A15.put("KEY_LID", r0.getRawString());
            }
            String obj2 = A15.toString();
            C18070vi.A0b(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaTrustSignalStoreStore/toData/JSONException", e);
        }
    }
}
