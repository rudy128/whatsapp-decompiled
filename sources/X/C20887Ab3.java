package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ab3  reason: case insensitive filesystem */
public final class C20887Ab3 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            String string = A16.getString("jid");
            C196189ub A00 = AnonymousClass9QF.A00(AnonymousClass8BS.A0w("lt", A16));
            long j = A16.getLong("lit");
            C18070vi.A0b(string);
            return new C19977A1n(A00, string, j);
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C19977A1n a1n = (C19977A1n) obj;
        C18070vi.A0d(a1n, 0);
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("jid", a1n.A02);
            A15.put("lt", a1n.A01.A01());
            A15.put("lit", a1n.A00);
            String obj2 = A15.toString();
            C18070vi.A0b(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: CtwaAdConsumerDCStateInfoStore/toData/JSONException", e);
        }
    }
}
