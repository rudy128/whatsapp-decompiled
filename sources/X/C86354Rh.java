package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4Rh  reason: invalid class name and case insensitive filesystem */
public final class C86354Rh {
    public final AnonymousClass00H A00;

    public C86354Rh(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C86684Sq A00(C29681ch r5) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("geosuspension_");
        try {
            String A002 = ((C58832lK) this.A00.get()).A00(AnonymousClass000.A0y(r5.getRawString(), A10));
            if (A002 == null || A002.length() == 0) {
                return new C86684Sq(C17880vN.A14());
            }
            JSONObject A16 = C17880vN.A16(A002);
            LinkedHashSet A14 = C17880vN.A14();
            JSONArray jSONArray = A16.getJSONArray("countries");
            C18070vi.A0X(jSONArray);
            C21488Akx A04 = A6n.A04(jSONArray);
            while (A04.hasNext()) {
                JSONObject jSONObject = (JSONObject) A04.next();
                C18070vi.A0d(jSONObject, 0);
                String string = jSONObject.getString("iso_code");
                C18070vi.A0b(string);
                A14.add(new C86674Sp(string));
            }
            return new C86684Sq(A14);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void A01(C29681ch r9, C86684Sq r10) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("geosuspension_");
        String A0y = AnonymousClass000.A0y(r9.getRawString(), A10);
        try {
            JSONObject A15 = C17880vN.A15();
            Set<C86674Sp> set = r10.A00;
            ArrayList A0D = C29351c6.A0D(set);
            for (C86674Sp r3 : set) {
                C18070vi.A0d(r3, 0);
                JSONObject A152 = C17880vN.A15();
                A152.put("iso_code", r3.A00);
                A0D.add(A152);
            }
            A15.put("countries", new JSONArray(A0D));
            ((C58832lK) this.A00.get()).A02(A0y, C18070vi.A0H(A15));
        } catch (Throwable th) {
            C30691eM.A00(th);
        }
    }
}
